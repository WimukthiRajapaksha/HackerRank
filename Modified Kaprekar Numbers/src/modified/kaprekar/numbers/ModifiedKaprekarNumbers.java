/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modified.kaprekar.numbers;

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
public class ModifiedKaprekarNumbers {
    
    static void kaprekarNumbers(int p, int q) {
//        int[] lis = new int[]();
//        List<Integer> listt = new ArrayList<Integer>();
//        boolean found = false;
//        for(int i=p; i<=q; i++) {
//            System.out.println(i);
//            int lengthI = String.valueOf(i).length();
////            System.out.println(lengthI+" i");
//            int length = String.valueOf(i*i).length();
////            System.out.println(length+" i^2");
//            int firstN = 0;
//            if (lengthI > 1) {
//                firstN = Integer.parseInt(Integer.toString(i*i).substring(0, length - lengthI));
////                System.out.println(firstN+" first");
//            } else if (length != lengthI) {
//                char cc = Integer.toString(i*i).charAt(0);
//                firstN = Integer.valueOf(String.valueOf(cc));
//            } else {
//                firstN = 0;
//            }
//            System.out.println(firstN+" first");
//            int lastN = Integer.parseInt(Integer.toString(i*i).substring(length - lengthI));
//            System.out.println(lastN+" last");
//            
//            
////            System.out.println(lastN + " Lastttt");
//            if (firstN+lastN==i && lastN!=0) {
//                System.out.print(i+" ");
//                found = true;
//                listt.add(i);
//            }
////                if (firstN==i) {
////                    System.out.print(i+" n");
////                    found = true;
////                }
//        }
//        if (!found) {
//            System.out.print("INVALID RANGE");
//        } else {
//            System.out.println(Arrays.toString(listt.toArray()));
//        }




//        List<Integer> listt = new ArrayList<Integer>();
        boolean found = false;
        if (p>0 && q<100000 && p<q) {
            for(int i=p; i<=q; i++) {
//            System.out.println(i);
                int lengthI = String.valueOf(i).length();
                int length = String.valueOf(i*i).length();
                long firstN = 0;
                firstN = ((long)i*i)/(int)Math.pow(10, lengthI);
    //            System.out.println(firstN+" first");
                long lastN = ((long)i*i)%(int)Math.pow(10, lengthI);
    //            System.out.println(lastN+" last");


    //            System.out.println(lastN + " Lastttt");
                if (firstN+lastN==i && lastN!=0) {
                    System.out.print(i+" ");
                    found = true;
    //                listt.add(i);
                }
    //                if (firstN==i) {
    //                    System.out.print(i+" n");
    //                    found = true;
    //                }
            }
            if (!found) {
                System.out.print("INVALID RANGE");
            } 
//            else {
//                System.out.println(Arrays.toString(listt.toArray()));
//            }
        } else {
            System.out.print("INVALID RANGE");
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);
//        System.out.println(Integer.parseInt(Integer.toString(16).substring(0, 0)));
//        System.out.println(String.valueOf(p).length());
//        System.out.println(Integer.parseInt(Integer.toString(p).substring(0, String.valueOf(p).length())));

        scanner.close();
    }
}
