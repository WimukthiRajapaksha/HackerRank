/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */
public class Pairs {

    /**
     * @param args the command line arguments
     */
    
    public static int pairs(int k, List<Integer> arr) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i: arr) {
            set.add(i);
        }
        for (int i: arr) {
            if (set.contains(i+k)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    
//    ALTERNATE
//    public static int pairs(int k, List<Integer> arr) {
//        Collections.sort(arr);
//        int i=0;
//        int j=i+1;
//        int count = 0;
//        while(j<arr.size()) {
//            if (arr.get(j)-arr.get(i)>k) {
//                i++;
//            } else if (arr.get(j)-arr.get(i)<k) {
//                j++;
//            } else {
//                count++;
//                j++;
//            }
//        }
//        System.out.println(count);
//        return count;
//    }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,4,2));
        Pairs.pairs(2, list);
    }
    
}
