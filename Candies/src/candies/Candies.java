/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candies;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class Candies {

    /**
     * @param args the command line arguments
     */
    
    public static long candies(int n, List<Integer> arr) {
        int[] list = new int[arr.size()];
        list[0]=1;
        for (int i=1; i<arr.size(); i++) {
            if (arr.get(i-1)<arr.get(i)) {
                list[i]=list[i-1]+1;
            } else {
                list[i]=1;
            }
        }
        for (int i: list) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=arr.size()-1; i>0; i--) {
            if (arr.get(i)<arr.get(i-1)) {
                list[i-1]=Math.max(list[i]+1, list[i-1]);
            }
        }
        long sum=0;
        for (int i: list) {
            sum+=i;
        }
        System.out.println(sum);
        return sum;
    }
    
    public static void main(String[] args) {
//        Candies.candies(6, Arrays.asList(4, 6, 4, 5, 6, 2));
//        Candies.candies(3, Arrays.asList(1, 2, 2));
//        Candies.candies(3, Arrays.asList(1, 2, 2));
//        Candies.candies(8, Arrays.asList(2, 4, 3, 5, 2, 6, 4, 5));
//        Candies.candies(10, Arrays.asList(2, 4, 5, 6, 1, 7, 8, 9, 2, 1));
        Candies.candies(10, Arrays.asList(2, 4, 2, 6, 1, 7, 8, 9, 2, 1));
    }
}
