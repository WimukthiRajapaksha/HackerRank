/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.the.median;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author wimukthirajapaksha
 */
public class FindTheMedian {

    /**
     * @param args the command line arguments
     */
    
    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(j);
        arr.set(j, arr.get(i+1));
        arr.set(i+1, temp);
    }
    
    public static int partition(List<Integer> arr, int left, int right) {
        int pivot = arr.get(right);
        int i=left-1;
        for (int j=left; j<right; j++) {
            if (arr.get(j)<pivot) {
                FindTheMedian.swap(arr, i, j);
                i++;
            }
        }
        return i+1;
    }
    
//    ITERATIVE METHOD
    public static int sort(List<Integer> arr, int left, int right, int item) {
        while(left<=right) {
            int res = FindTheMedian.partition(arr, left, right);
            System.out.println(res);
            System.out.println(arr);
            if (res == item) {
                return arr.get(right);
            } else if (res>item) {
                int temp = arr.get(res);
                arr.set(res, arr.get(right));
                arr.set(right, temp);
                left = left;
                right = res-1;
            } else {                
                int temp = arr.get(res);
                arr.set(res, arr.get(right));
                arr.set(right, temp);
                left = res+1;
                right = right;
            }
        }
        return 0;
    }
    
    
//    USING RANDOM VALUE AS PIVOT - OPTIMIZED - RECURSIVE
//    public static int sort(List<Integer> arr, int left, int right, int item) {
//        System.out.println(arr + " -> " + item+" , "+left+" "+right);
//        Random rand = new Random();
//        int pivotIndex = rand.nextInt(right-left+1)+left;
//        int pivot = arr.get(pivotIndex);
//        FindTheMedian.swap(arr, pivotIndex-1, right);
//        System.out.println(arr);
//        int i=left-1;
//        int j=left;
//        while(j<=right-1) {
//            if (arr.get(j)<pivot) {
//                FindTheMedian.swap(arr, i, j);
//                i++;
//            }
//            j++;
//        }
//        System.out.println(i+" - "+j);
//        FindTheMedian.swap(arr, i, right);
//        System.out.println(arr);
//        if (i+1==item) {
//            return arr.get(i+1);
//        } else if (item>i+1) {
//            return FindTheMedian.sort(arr, i+2, right, item);
//        } else {
//            return FindTheMedian.sort(arr, left, i, item);
//        }
//    }
    
//    FROM LAST ELEMENT - RECURSIVE
//    public static int sort(List<Integer> arr, int item) {
//        System.out.println(arr + " -> " + item);
//        int n = arr.size();
//        int pivot = arr.get(n-1);
//        int pivotIndex = n-1;
//        int i=-1;
//        int j=0;
//        while(j<=pivotIndex-1) {
//            if (arr.get(j)<pivot) {
//                FindTheMedian.swap(arr, i, j);
//                i++;
//            }
//            j++;
//        }
//        System.out.println(i+" - "+j);
//        System.out.println(arr);
//        if (i+1==item) {
//            return arr.get(pivotIndex);
//        } else if (item>i+1) {
//            arr.set(arr.size()-1, arr.get(i+1));
//            return FindTheMedian.sort(arr.subList(i+2, arr.size()), item-(i+2));
//            
//        } else {
//            return FindTheMedian.sort(arr.subList(0, i+1), item);
//        }
//    }
    
    public static int findMedian(List<Integer> arr) {
        int position = ((arr.size()+1)/2)-1;
        int a  = FindTheMedian.sort(arr, 0, arr.size()-1, position);
        System.out.println(a);
        return a;
    }
    
    public static void main(String[] args) {
        FindTheMedian.findMedian(Arrays.asList(new Integer[] {0, 1, 2, 4, 6, 5, 3}));
//        FindTheMedian.findMedian(Arrays.asList(new Integer[] {7,10,6,8,2,1,11,4,3,5,9}));
//        FindTheMedian.findMedian(Arrays.asList(new Integer[] {11,10,9,8,7,6,5,4,3,2,1}));
//        FindTheMedian.findMedian(Arrays.asList(new Integer[] {11,10,9,8,7,6,5,4,3,2,1,1,1}));
//        FindTheMedian.findMedian(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,11}));
    }
}
