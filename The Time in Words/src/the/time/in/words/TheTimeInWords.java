/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.time.in.words;

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
public class TheTimeInWords {

    static String timeInWords(int h, int m) {
        String returnTime;
        
        String[] ones = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        if (m==0) {
            if (h<10) {
                returnTime = ones[h-1];
            } else {
                returnTime = tens[h-10];
            }
            returnTime += " o' clock";
        } else if (m<=30) {
            if (m<10) {
                returnTime = ones[m-1];
                if (m-1==0) {
                    returnTime += " minute"; 
                } else {
                    returnTime += " minutes"; 
                }
                
            } else if (m==15) {
                returnTime = "quarter";
            } else if (m<20) {
                returnTime = tens[m-10];
                returnTime += " minutes"; 
            } else if (m==30) {
                returnTime = "half";
            } else {
                returnTime = tens[tens.length-1]+" "+ones[(m%10)-1];
                returnTime += " minutes"; 
            }
            returnTime += " past ";
            if (h<10) {
                returnTime += ones[h-1];
            } else {
                returnTime += tens[h-10];
            }
            
        } else {
            if (m==45) {
                returnTime = "quarter";
            } else if (m<40) {
                returnTime = tens[tens.length-1]+" "+ones[((60-m)%10)-1];
                returnTime += " minutes"; 
            } else if (m<=50) {
                returnTime = tens[60-m-10];
                returnTime += " minutes"; 
            } else {
                returnTime = ones[60-m-1];
                if (60-m==1) {
                    returnTime += " minute"; 
                } else {
                    returnTime += " minutes"; 
                }
                
            }
            returnTime += " to ";
            if (h<10) {
                returnTime += ones[h];
            } else {
                returnTime += tens[h-9];
            }
        }
        System.out.println(returnTime);
        return returnTime;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
    
}
