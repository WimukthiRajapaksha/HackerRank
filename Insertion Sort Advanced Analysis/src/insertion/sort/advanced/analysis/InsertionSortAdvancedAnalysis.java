/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion.sort.advanced.analysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class InsertionSortAdvancedAnalysis {

    /**
     * @param args the command line arguments
     */
    
    public static int binarySearch(int[] arr, int item, int low, int high) {
        while(low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==item) {
                return mid+1;
            } else if (item>arr[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        System.out.println(low+" low");
        return low;
    }
        
    public static int insertionSort(List<Integer> arr) {
        long swaps=0;
        int[] list = new int[arr.size()];
        for (int i=0; i<arr.size(); i++) {
            list[i] = arr.get(i);
        }
        for (int i=0; i<list.length; i++) {
            int j=i-1;
            int selected = list[i];
            int loc = InsertionSortAdvancedAnalysis.binarySearch(list, selected, 0, j);
            System.out.println(selected + " -> " + loc);
            while(j>=loc) {
                System.out.println(list[j]+"-");
                list[j+1] = list[j];
                if (list[j+1]>selected) {
                    swaps++;
                }
                j--;
            }
            list[j+1] = selected;
            for (int k: list) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println("\n\n"+swaps);
        return (int)swaps;
        
        
        
//        TIMEEOUT
//        int swaps = 0;
//        for (int i=1; i<arr.size(); i++) {
//            int j=i-1;
//            int temp = arr.get(i);
//            while(j>=0 && arr.get(j)>temp) {
//                arr.set(j+1, arr.get(j));
//                swaps++;
//                j--;
//            }
//            
//            arr.set(j+1, temp);
//        }
//        System.out.println(swaps);
//        return swaps;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 3, 1, 2);
//        List<Integer> list = Arrays.asList(1, 1, 1, 2, 2);
        InsertionSortAdvancedAnalysis.insertionSort(list);
    }
    
}
