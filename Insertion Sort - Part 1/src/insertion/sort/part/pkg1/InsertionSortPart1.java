/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion.sort.part.pkg1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {
    public static void insertionSort1(int n, List<Integer> arr) {
        int i = n-1;
        while(i>=0) {
            boolean changed = false;
            for (int j=i-1; j>=0; j--) {
                if (arr.get(j)>arr.get(i)) {
                    int val = arr.get(i);
                    arr.set(i, arr.get(j));
                    for (int k=0; k<n; k++) {
                        System.out.print(arr.get(k) +" ");
                    }
                    System.out.println();
                    arr.set(j, val);
                    changed = true;
                } 
            }
            if (!changed) {
                i--;
            }            
        }
        arr.forEach((item)-> {
            System.out.print(item +" ");});
    }

}

public class InsertionSortPart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Result.insertionSort1(5, Arrays.asList(2, 4, 4, 6, 8, 3));
//        Result.insertionSort1(5, Arrays.asList(2, 4, 6, 8, 3));
        System.out.println("--------");
//        Result.insertionSort1(5, Arrays.asList(2, 3, 3, 4, 6, 8));
        
        System.out.println("--------");
        Result.insertionSort1(8, Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1));
    }
    
}
