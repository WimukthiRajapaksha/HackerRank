/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package append.and.delete;

/**
 *
 * @author wimukthirajapaksha
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppendAndDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        char[] sC= s.toCharArray();
        char[] tC = t.toCharArray();
//        int count = 0;
//        int comm = 0;
//        int min = Math.min(s.length(), t.length());
//        
//        if (min == s.length()) {
//            for (int i=0; i<s.length(); i++) {
//                if (sC[i] == tC[i]) {
//                    comm += 1;
//                } else {
//                    break;
//                }
//            }
//            if (min == t.length()) {
//                count = s.length()*2;
//            } else {
//                count = (s.length()-comm)+(t.length()-comm);
//            }
//        } else {
//            for (int i=0; i<t.length(); i++) {
//                if (sC[i] == tC[i]) {
//                    comm += 1;
//                } else {
//                    break;
//                }
//            }
//            count = (s.length()-comm)+(t.length()-comm);
//        }
        
        
        
        int count = 0;
        if (s.length() >= t.length()) {
            boolean fo = false;
            for (int i=0; i< t.length(); i++) {
                if (sC[i]!=tC[i]) {
                    fo = true;
                    count = (s.length()-(i))+(t.length()-i);
                    break;
                }
            }
            if (s.length() > t.length() && !fo) {
                count = (s.length()-t.length());
            }
        } else {
            boolean fo = false;
            for (int i=0; i< s.length(); i++) {
                if (sC[i]!=tC[i]) {
                    fo = true;
                    count = (t.length()-(i))+(s.length()-i);
                    break;
                }
            }
            if (!fo) {
                count = (t.length()-s.length());
            }
        }
        System.out.println(count);
        if (count == k) {
            System.out.println("Yes");
            return "Yes";
        } else if (count < k) {
            if (count%2==k%2) {
                System.out.println("Yes");
                return "Yes";
            } else if(k>s.length()+t.length()) {
                System.out.println("Yes");
                return "Yes";
            } else  {
                System.out.println("No");
                return "No";
            }
        } else {
            System.out.println("No");
            return "No";
        }
//        if (count > k) {
//            System.out.println("NO");
//            return "NO";
//        } else {
//            System.out.println("YES");
//            return "YES";
//        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

