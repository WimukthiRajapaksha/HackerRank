/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy.florist;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author wimukthirajapaksha
 */
public class GreedyFlorist {

    /**
     * @param args the command line arguments
     */
    
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int total = 0;
        int iter = 0;
        int amou = k;
        for (int i=c.length-1; i>=0; i--) {
            total+=(iter+1)*c[i];
            amou--;
            if (amou==0) {
                amou=k;
                iter++;
            }
        }
        System.out.println(total);
        return total;
    }
    
    public static void main(String[] args) {
        GreedyFlorist.getMinimumCost(3, new int[]{1, 3, 5, 7, 9});
    }
}
