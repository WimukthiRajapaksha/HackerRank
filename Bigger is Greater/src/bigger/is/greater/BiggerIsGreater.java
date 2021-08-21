/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigger.is.greater;

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
public class BiggerIsGreater {

    static String biggerIsGreater(String w) {
        String returnString = "";
        boolean eligible=false;
        for (int i=w.length()-1;i>0;i--) {
            if(w.charAt(i)>w.charAt(i-1)) {
                eligible = true;
                String before = w.substring(0, i-1);                
                char[] newString=w.substring(i-1).toCharArray();
                char boundary = w.charAt(i-1);
                char currentMaxSelected = w.charAt(i);
                Arrays.sort(newString);
                for (char c: newString) {
                    if (Character.compare(c, boundary) > 0 && Character.compare(c, currentMaxSelected)<0) {
                        currentMaxSelected = c;
                    }
                }
                before+=String.valueOf(currentMaxSelected);
                returnString = before+String.valueOf(newString).replaceFirst(String.valueOf(currentMaxSelected), "");
                System.out.println(returnString);
                return returnString;
            }
        }
        System.out.println("no answer");
        return "no answer";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
