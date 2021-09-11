/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion.sort.part.pkg2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
class Result {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        if (n==1) {
            return;
        }
        insertionSort2(n-1, arr);
        int i=n-2;
        int temp = arr.get(n-1);
        while (i>=0 && arr.get(i)>temp) {
            arr.set(i+1, arr.get(i));
            i--;
        }
        arr.set(i+1, temp);
        arr.forEach((item)->{
            System.out.print(item+" ");
        });
        System.out.println();
//        for (int i=1; i<n; i++) {
//            int temp = arr.get(i);
//            int j = i-1;
//            while(j>=0 && arr.get(j)>temp) {
//                arr.set(j+1, arr.get(j));
//                j--;
//            }
//            arr.set(j+1, temp);
//            arr.forEach((item)->{
//                System.out.print(item+" ");
//            });
//            System.out.println();
//        }
    }
}

public class InsertionSortPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.insertionSort2(6, Arrays.asList(8, 4, 3, 5, 6, 2));
    }
    
}
