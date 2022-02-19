/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max.min;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    
    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        System.out.println(arr);
        for (int i=0; i<arr.size()-k+1; i++) {
            min = Math.min(min, arr.get(i+k-1)-arr.get(i));
        }
        System.out.println(min);
        return min;
    }
    
    public static void main(String[] args) {
        MaxMin.maxMin(3, Arrays.asList(10, 100, 200, 300, 200, 1000, 20, 30));
    }
}
