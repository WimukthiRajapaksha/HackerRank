/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlock.and.minimax;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */
public class SherlockAndMiniMax {

    /**
     * @param args the command line arguments
     */
    
    public static int sherlockAndMinimax(List<Integer> arr, int p, int q) {
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        int val = -1;
        if (arr.get(0)>p) {
            max = arr.get(0)-p;
            val = p;
        } 
        System.out.println(val+" - "+max);
        for (int i=0; i<arr.size()-1; i++) {
            int temp = (arr.get(i+1)+arr.get(i))/2;
            if (temp>=p && temp<=q) {
                if (max<(arr.get(i+1)-arr.get(i))/2) {
                    max = (arr.get(i+1)-arr.get(i))/2;
                    val = temp;
                }
            } else if (arr.get(i)<p && arr.get(i+1)>p) {
                if (p-arr.get(i)<=arr.get(i+1)-p) {
                    if (max<p-arr.get(i)) {
                        max = p-arr.get(i);
                        val = p;
                    }
                } else {
                    if (max<arr.get(i+1)-p) {
                        max = arr.get(i+1)-p;
                        val = p;
                    }
                }
            } else if (arr.get(i)<q && arr.get(i+1)>q) {
                if (q-arr.get(i)<=arr.get(i+1)-q) {
                    if (max<q-arr.get(i)) {
                        max = q-arr.get(i);
                        val = q;
                    }
                } else {
                    if (max<arr.get(i+1)-q) {
                        max = arr.get(i+1)-q;
                        val = q;
                    }
                }
            }
            System.out.println(temp+" - "+max);
        }
        if (arr.get(arr.size()-1)<q){
            if (max<q-arr.get(arr.size()-1)) {
                max = q-arr.get(arr.size()-1);
                val = q;
            }
        }
        System.out.println(val+" "+max);
        return val;
    }
    
    public static void main(String[] args) {
//        SherlockAndMiniMax.sherlockAndMinimax(Arrays.asList(5, 8, 14, 17, 20, 24, 28, 32), 4, 26);
        SherlockAndMiniMax.sherlockAndMinimax(Arrays.asList(1, 2, 5, 8, 14), 4, 9);
        SherlockAndMiniMax.sherlockAndMinimax(Arrays.asList(1, 5, 8, 14), 2, 12);
        SherlockAndMiniMax.sherlockAndMinimax(Arrays.asList(5, 8, 14), 4, 9);
        SherlockAndMiniMax.sherlockAndMinimax(Arrays.asList(1, 5, 6), 4, 9);
        SherlockAndMiniMax.sherlockAndMinimax(Arrays.asList(1, 5, 6, 8), 4, 9);
        SherlockAndMiniMax.sherlockAndMinimax(Arrays.asList(8, 10, 12), 4, 9);
    }
}
