/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.coin.change.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author wimukthirajapaksha
 */
public class TheCoinChangeProblem {

    /**
     * @param args the command line arguments
     */
    
    public static long getWays(int n, List<Integer> c) {
        long[] list = new long[n+1];
        for (int i=0; i<c.size(); i++) {
            for (int j=0; j<list.length; j++) {
                if (j==0) {
                    list[j]=1;
                    continue;
                }
                if (j>=c.get(i)) {
                    list[j] = list[j] + list[j-c.get(i)];
                }
            }
        }
        System.out.println(list[list.length-1]);
        return list[list.length-1];
    }
    
    public static void main(String[] args) {
//        getWays(3, Arrays.asList(8l, 3l, 1l, 2l));
        getWays(3, Arrays.asList(1, 2, 3));
    }
}
