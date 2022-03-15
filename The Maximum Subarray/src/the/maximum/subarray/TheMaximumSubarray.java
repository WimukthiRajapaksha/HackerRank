/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.maximum.subarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class TheMaximumSubarray {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> maxSubarray(List<Integer> arr) {
        System.out.println(arr);
        int subSequence=arr.get(0);
        
        for (int i=0; i<arr.size(); i++) {
            if (i>0) {
                subSequence = Math.max(subSequence, Math.max(subSequence+arr.get(i), arr.get(i)));
            }
        }
        
        int subArr=Integer.MIN_VALUE;
        int temp = 0;
        for (int i=0; i<arr.size(); i++) {
            temp+=arr.get(i);
            temp = Math.max(temp, arr.get(i));
            subArr=Math.max(subArr, temp);
        }
        
        System.out.println(subArr+" "+subSequence);
        return Arrays.asList(subArr, subSequence);
    }
    
    public static void main(String[] args) {
        maxSubarray(Arrays.asList(2, -1, 2, 3, 4, -5));
        maxSubarray(Arrays.asList(-2, -3, -1, -4, -6));
        maxSubarray(Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3));
    }    
}
