/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strange.counter;

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
public class StrangeCounter {

    static long strangeCounter(long t) {
        long previousCount = 0;
        long forThisStack = 3;
        long returnValue = 0;
        while(true) {
            if ( previousCount+forThisStack< t) {
                previousCount +=forThisStack;
                forThisStack *= 2;
            } else {
                returnValue = forThisStack - (t-(previousCount+1));
                break;
            }
        }
        System.out.println(returnValue);
        return returnValue;
        
        
        
//        long previousCount = 0;
//        long forThisStack = 0;
//        long returnValue = 0;
//        long counter = 1;
//        while(true) {
//            forThisStack = ((long)3*(long)Math.pow(2, counter-1));
//            if ( previousCount+forThisStack< t) {
//                previousCount +=forThisStack;
//                counter++;
//            } else {
//                returnValue = forThisStack - (t-(previousCount+1));
//                break;
//            }
//        }
//        System.out.println(returnValue);
//        return returnValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
    
}
