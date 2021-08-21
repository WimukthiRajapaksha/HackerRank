/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absolute.permutation;

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
public class AbsolutePermutation {
    static int[] absolutePermutation(int n, int k) {
//1,2
//2,1

//1,2,3,4
//3,4,1,2-2
//1,2,3,4,5
//
//1,2,3,4,5,6
//4,5,6,1,2,3-3
//6,1,2,3,4,5
//
//1,2,3,4,5,6,7
//
//1,2,3,4,5,6,7,8
//2,1,4,3,6,5,8,7-1
//3,4,1,2,7,8,5,6-2
//5,6,7,8,1,2,3,4-4
//
//1,2,3,4,5,6,7,8,9
//3,4,1,2,7,8,5,6,7-2
//
//1,2,3,4,5,6,7,8,9,10
//2,1,4,3,6,5,8,7,10,9-1
//3,4,1,2,7,8,5,6,
//4,5,6,1,2,3
//5,6,7,8,1,2,3,4
//6,7,8,9,10,1,2,3,4,5-5


//1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
//5,6,7,8,1,2,3,4,13,14,15,16,9,10,11,12-4


//1-2
//2-4
//3-6
//4-8
//5-10
        if (k==0) {
            int[] list = new int[n];
            for (int i=0;i<n;i++) {
                list[i] = i+1;
            }
            for (int i: list) {
                System.out.print(i+" - ");
            } 
            return list;
        } else if (n%(2*k)==0) {
            int[] items = new int[2*k];
            for (int j=0;j<k;j++) {
                items[j]= k;
                items[(2*k-1)-j] = -k;
            }
            for (int i: items) {
                System.out.print(i+" ");
            } 
            System.out.println();
            int[] list = new int[n];
//            for (int i=0;i<n/(2*k);i++) {
//                int min = (i*2*k)+1;
//                int max = (i+1)*2*k;
//                System.out.println("i "+i);
//                System.out.println("min "+min);
//                System.out.println("max "+max);
//                for (int j=0;j<2*k;j++) {
//                    if (min+j+k<=max) {
//                        System.out.println("val "+(min+k+j));
//                        list[min+j-1] = min+k+j;
//                    } else {
//                        System.out.println("val "+(min+j-k));
//                        list[min+j-1] = min+j-k;
//                    }
//                }
//            }
            for (int i=0;i<n;i++) {
                list[i]=i+1+items[i%(2*k)];
            }
            for (int i: list) {
                System.out.print(i+" - ");
            }
            System.out.println();
            return list;
        } else {
            int[] list = new int[]{-1};
            for (int i: list) {
                System.out.print(i+" ");
            }
            System.out.println();
            return list;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] result = absolutePermutation(n, k);

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
