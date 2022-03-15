/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author wimukthirajapaksha
 */
public class Knapsack {

    /**
     * @param args the command line arguments
     */
    
    public static int unboundedKnapsack(int k, List<Integer> arr) {
        int[] list = new int[k+1];
        for (int i=0; i<list.length; i++) {
            for (int j: arr) {
                if(j<=i) {
                    list[i] = Math.max(list[i], list[i-j]+j);
                }
            }
        }
        System.out.println(list[k]);
        return list[k];
    }
    
    public static void main(String[] args) {
        unboundedKnapsack(9, Arrays.asList(3, 4, 4, 4, 8));
        unboundedKnapsack(13, Arrays.asList(3, 6, 9));
        unboundedKnapsack(11, Arrays.asList(3, 7, 9));
        unboundedKnapsack(13, Arrays.asList(3, 7, 9, 15));
    }    
}
