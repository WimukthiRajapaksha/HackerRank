/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlock.and.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class SherlockAndArray {

    /**
     * @param args the command line arguments
     */
    
    public static String balancedSums(List<Integer> arr) {
        int sum = 0;
        for (int i: arr) {
            sum+=i;
        }
        int halfSum=0;
        for (int i: arr) {
            if (2*halfSum == sum-i) {
                return "YES";
            }
            halfSum+=i;
        }
        return "NO";
        
        
        
//        int sumLeft = 0;
//        int sumRight = 0;
//        for(int i=0; i<arr.size(); i++) {
//            if (i<(arr.size()/2)) {
//                sumLeft += arr.get(i);
//            } else if (i==arr.size()/2) {
//            } else {
//                sumRight += arr.get(i);
//            }
//        }
//        if (sumLeft > sumRight) {
//            for(int i=(arr.size()/2-1); i>=0; i--) {
//                sumLeft -= arr.get(i);
//                sumRight += arr.get(i+1);
//                int temp = sumLeft-sumRight;
//                if (temp == 0) {
//                    return "YES";
//                }
//            }
//            return "NO";
//        } else if (sumLeft == sumRight) {
//            return "YES";
//        } else {
//            for(int i=(arr.size()/2+1); i<=arr.size()-1; i++) {
//                sumLeft += arr.get(i-1);
//                sumRight -= arr.get(i);
//                int temp = sumLeft-sumRight;
//                if (temp == 0) {
//                    return "YES";
//                }
//            }
//            return "NO";
//        }
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 2, 1, 1, 1, 1, 1, 1);
        System.out.println(SherlockAndArray.balancedSums(arr));

        List<Integer> arr1 = Arrays.asList(1, 2, 3);
        System.out.println(SherlockAndArray.balancedSums(arr1));
        
        List<Integer> arr2 = Arrays.asList(1, 2, 3, 3);
        System.out.println(SherlockAndArray.balancedSums(arr2));
        
        List<Integer> arr3 = Arrays.asList(1, 1, 4, 1, 1);
        System.out.println(SherlockAndArray.balancedSums(arr3));
        
        List<Integer> arr4 = Arrays.asList(2, 0, 0, 0);
        System.out.println(SherlockAndArray.balancedSums(arr4));
        
        List<Integer> arr5 = Arrays.asList(0, 0, 2, 0);
        System.out.println(SherlockAndArray.balancedSums(arr5));
        
        List<Integer> arr6 = Arrays.asList(0);
        System.out.println(SherlockAndArray.balancedSums(arr6));
    }
    
}
