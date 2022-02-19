/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimum.absolute.difference.in.an.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */
public class MinimumAbsoluteDifferenceInAnArray {

    /**
     * @param args the command line arguments
     */
    
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Set<Integer> set = new HashSet<>();
        set.addAll(arr);
        if (set.size()!=arr.size()) {
            return 0;
        }
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.size()-1; i++) {
            min = Math.min(min, Math.abs(arr.get(i)-arr.get(i+1)));
        }
        System.out.println(min);
        return min;
    }
    
    public static void main(String[] args) {
        MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(Arrays.asList(-2,2,4));
    }
}
