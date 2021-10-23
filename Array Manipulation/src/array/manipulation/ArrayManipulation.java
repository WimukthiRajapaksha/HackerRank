/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.manipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // here we only stores the differences of each pair; begin and end to optimize the query
//        + value at the beginning and - value at the end of query values. 
        long[] list = new long[n+1];
        long max = 0;
        for (List<Integer> que: queries) {
            list[que.get(0)-1] += que.get(2);
            list[que.get(1)] -= que.get(2);
        }
        long temp = 0;
        for (long i: list) {
            
            temp += i;
            System.out.println(temp);
            if (max<temp) {
                max = temp;
            }
        }
        System.out.println(max);
        return max;
        
        
        
//        long[] list = new long[n];
//        long max = 0;
//        for (List<Integer> que: queries) {
//            for (int i=que.get(0); i<que.get(1)+1; i++) {
//                list[i] += que.get(2);
//                if (max<list[i]) {
//                    max = list[i];
//                }
//            }
//        }
//        System.out.println(max);
//        return max;
    }
}

public class ArrayManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> li1 = Arrays.asList(1, 2, 100);
        List<Integer> li2 = Arrays.asList(2, 5, 100);
        List<Integer> li3 = Arrays.asList(3, 4, 100);
        List<List<Integer>> li = Arrays.asList(li1, li2, li3);
        
//        List<Integer> li1 = Arrays.asList(1, 5, 3);
//        List<Integer> li2 = Arrays.asList(4, 8, 7);
//        List<Integer> li3 = Arrays.asList(6, 9, 1);
//        List<List<Integer>> li = Arrays.asList(li1, li2, li3);

//        List<Integer> li1 = Arrays.asList(2, 6, 8);
//        List<Integer> li2 = Arrays.asList(3, 5, 7);
//        List<Integer> li3 = Arrays.asList(1, 8, 1);
//        List<Integer> li4 = Arrays.asList(5, 9, 15);
//        List<List<Integer>> li = Arrays.asList(li1, li2, li3, li4);
        
        Result.arrayManipulation(5, li);
    }
    
}
