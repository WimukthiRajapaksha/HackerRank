/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolate.feast;

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
public class ChocolateFeast {

    static int chocolateFeast(int n, int c, int m) {
        
//        int initialCount = n/c;
//        int count = initialCount;
//        System.out.println("count "+count);
//        while(count>m) {
//            System.out.println("inside");
//            initialCount += count/m;
//            count = (int)Math.ceil(count/(float)m);
//        }
//        if (count == m) {
//            initialCount += 1; 
//        }
//        System.out.println(initialCount);
//        return initialCount;

        int initialCount = n/c;
        int count = n/c;
//        int remainder = 0;
        while(true) {
            int nextCount = (count/m) + (count%m);
            initialCount += (count/m);
            if (nextCount<m) {
                break;
            } else {
                count = nextCount;
            }
//            if (remainder/m > 0) {
//                initialCount += remainder/m;
//                remainder = remainder%m;
//            }
//            if (remainder<m && )
        }
        System.out.println(initialCount);
        return initialCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
    
}
