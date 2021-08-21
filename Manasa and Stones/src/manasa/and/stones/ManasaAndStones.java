/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manasa.and.stones;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author wimukthirajapaksha
 */
public class ManasaAndStones {

    static int[] stones(int n, int a, int b) {
        Set<Integer> set = new TreeSet<Integer>();
//        n=4
// 3, 4-3
        for (int i=0; i<n; i++) { // 0...3
            int sum = (a*i) + (b*(n-1-i));
            System.out.println("sum-"+sum);
            set.add(sum);
        }
        
//        Collections.sort(set);
        int[] ret = new int[set.size()];
        int k = 0;
        for (int i: set) {
            ret[k++] = i;
            System.out.println(i);
        }
//        System.out.println(ret);
        return ret;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int a = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int b = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = stones(n, a, b);

//            for (int i = 0; i < result.length; i++) {
//                bufferedWriter.write(String.valueOf(result[i]));
//
//                if (i != result.length - 1) {
//                    bufferedWriter.write(" ");
//                }
//            }
//
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
    
}
