/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package and.xor.or;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author wimukthirajapaksha
 */
public class ANDXorOR {

    /**
     * @param args the command line arguments
     */
    
    public static int andXorOr(int[] a) {
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for (int i: a) {
            int val = 0;
            while(!stack.isEmpty()) {
                val = stack.peek()^i;
                max = Math.max(max, val);
                if (stack.peek()>i) {
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        System.out.println(max);
        return max; 
    }
    
    public static void main(String[] args) {
        ANDXorOR.andXorOr(Arrays.asList(9, 6, 3, 5, 2));
//        System.out.println(((~2|~3)) & (2|3));
    }
}
