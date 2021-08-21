/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happy.ladybugs;

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
public class HappyLadybugs {

    static String happyLadybugs(String b) {
        if(b.contains("_")) {
            System.out.println("_");
            b = b.replace("_", "");
            for (char c: b.toCharArray()) {
                int count = b.length()-b.replace(Character.toString(c), "").length();
                System.out.println(c+"-"+count);
                if (count < 2) {
                    System.out.println("NO");
                    return "NO";
                }
            }
            System.out.println("YES");
            return "YES";
        } else {
            if (!(b.length()>=2 && (b.charAt(0)==b.charAt(1)) && (b.charAt(b.length()-1)==b.charAt(b.length()-2)))) {
                System.out.println("NO");
                return "NO";
            }
            for (int i=1; i<b.length()-1; i++) {
                if (!(b.charAt(i)==b.charAt(i+1) || (b.charAt(i-1)==b.charAt(i)))) {
                    System.out.println("NO");
                    return "NO";
                }
            }
            System.out.println("YES");
            return "YES";
        }
        
        
        
////            CORRECT
//        boolean found = true;
//        if(b.contains("_")) {
//            System.out.println("_");
//            b = b.replace("_", "");
//            for (char c: b.toCharArray()) {
//                
//                int count = b.length()-b.replace(Character.toString(c), "").length();
//                System.out.println(c+"-"+count);
//                if (count < 2) {
//                    found = false;
//                    break;
//                }
//            }
//        } else {
//            int i=0;
//            while (i<b.length()-1) {
//                if (b.charAt(i)==b.charAt(i+1)) {
//                    i+=2;
//                } else if (i!=0 && b.charAt(i)==b.charAt(i-1) && i!=b.length()-2) {
//                    i++;
//                } else {
//                    found = false;
//                    break;
//                }
//            }
//            if ((b.length() >= 2 && b.charAt(b.length()-2)!=b.charAt(b.length()-1)) || (b.length()<2)) {
//                found = false;
//            }
//        }
//        if (found) {
//            System.out.println("YES");
//            return "YES";
//        } else {
//            System.out.println("NO");
//            return "NO";
//        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
    
}
