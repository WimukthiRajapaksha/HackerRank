/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counting.sort.pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        int[] returnList = new int[100];
        for (int i=0; i<arr.size(); i++) {
            returnList[arr.get(i)]++;
        }
        for (int i=1; i<returnList.length; i++) {
            returnList[i] +=returnList[i-1];
        }
        int[] newList = new int[arr.size()];
        for (int i=0; i<arr.size(); i++) {
            newList[returnList[arr.get(i)]-1] = arr.get(i);
            returnList[arr.get(i)]--;
        }
        List<Integer> newRetList = new ArrayList<>();
        for (int t: newList) {
            newRetList.add(t);
        }
        return newRetList;
    }
}


public class CountingSort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.countingSort(Arrays.asList(1,3,2,1,5,5));
//        Result.countingSort(Arrays.asList(63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 
//                83, 8, 25, 81, 56, 9, 53, 98, 67, 99, 12, 83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25,
//                90, 59, 10, 94, 32, 44, 3, 89, 30, 27, 79, 46, 96, 27, 32, 18, 21, 92, 69, 81, 40, 40,
//                34, 68, 78, 24, 87, 42, 69, 23, 41, 78, 22, 6, 90, 99, 89, 50, 30, 20, 1, 43, 3, 70, 95,
//                33, 46, 44, 9, 69, 48, 33, 60, 65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33));
    }
    
}
