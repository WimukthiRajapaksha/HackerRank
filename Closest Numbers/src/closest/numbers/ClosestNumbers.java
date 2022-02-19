/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closest.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class ClosestNumbers {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> closestNumbers(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();
        Collections.sort(arr);
        int min = 100000000;
        for (int i=1; i<arr.size(); i++) {
            if (arr.get(i)-arr.get(i-1)<min) {
                newArr.clear();
                min = arr.get(i)-arr.get(i-1);
                newArr.addAll(Arrays.asList(new Integer[] {arr.get(i-1), arr.get(i)}));
            } else if (min == arr.get(i)-arr.get(i-1)) {
                newArr.addAll(Arrays.asList(new Integer[] {arr.get(i-1), arr.get(i)}));
            }
        }
        Collections.sort(newArr);
        System.out.println(newArr);
        return newArr;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(new Integer[]{-5, 15, 25, 71, 63});
//        List<Integer> arr = Arrays.asList(new Integer[]{5, 4, 3, 2});
        ClosestNumbers.closestNumbers(arr);
    }
    
}
