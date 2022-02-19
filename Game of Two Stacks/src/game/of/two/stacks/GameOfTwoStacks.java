/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.of.two.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */
public class GameOfTwoStacks {

    /**
     * @param args the command line arguments
     */
    
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int i = 0;
        int countStackA=0;
        int max=0;
        while(i<a.size() && maxSum>=countStackA+a.get(i)) {
            countStackA+=a.get(i);
            i++;
        }
        max = i;
        int k=0;
        while(k<b.size() && i>=0) {
            countStackA += b.get(k);
            k++;
            
            while(i>0 && countStackA>maxSum) {
                i--;
                countStackA -= a.get(i);
            }
            if (countStackA<=maxSum && max<i+k) {
                max = i+k;
            }
        }
        System.out.println(max);
        return max;
    }
    
    
//    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
//        int i = 0;
//        int countStackA=0;
//        int max=0;
//        while(i<a.size() && maxSum>countStackA+a.get(i)) {
//            countStackA+=a.get(i);
//            i++;
//        }
//        i--;
//        max = i+1;
//        int k=0;
//        while(k<b.size() && i>=-1 && b.get(k)<maxSum) {
//            countStackA += b.get(k);
//            k++;
//            if (countStackA<maxSum) {
//                max = (i==-1) ? Math.max(max, k) : Math.max(max, i+k+1);
//                continue;
//            }
//            while(i>-1 && countStackA>=maxSum) {
//                countStackA -= a.get(i);
//                i--;
//            }
//            if (countStackA<maxSum) {
//                max = (i==-1) ? Math.max(max, k) : Math.max(max, i+k+1);
//            } else {
//                break;
//            }
//        }
//        System.out.println(max);
//        return max;
//    }
    
    public static void main(String[] args) {
        GameOfTwoStacks.twoStacks(10, Arrays.asList(4,2,4,6,1), Arrays.asList(2,1,8,5));
        GameOfTwoStacks.twoStacks(21, Arrays.asList(1,2,3,10,4,6,1,1), Arrays.asList(2,2,5,3,1,1,1,1,4,4,4,4));
        GameOfTwoStacks.twoStacks(30, Arrays.asList(10,10,10), Arrays.asList(20,2,2,2,2,2,2));
        GameOfTwoStacks.twoStacks(20, Arrays.asList(100,10,100), Arrays.asList(2,10,2,2,2,2,2));
    }
}
