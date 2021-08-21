/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halloween.sale;

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
public class HalloweenSale {

    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
//        p+(n-1)d=m
//        int iterrations = 0;
//        d = -d;
//        int n = (int)((m-p)/(float)d)+1;
//        System.out.println("n " + n);
//        float sn = ((n)/(float)2)*((2*p)+((n-1)*d));
//        System.out.println("sn "+ sn);
//        if (sn>s) {
//            iterrations = (int)(((sn*2/(float)n)-(2*p))/(float)d)+1;/// sn = n/2(2a+(n-1)d)
//        } else if (sn==s) {
//            iterrations = n;
////            for (int i=n; i>=1; i--) {
////                sn = (i/(float)2)*((2*p)+((i-1)*d));
////                if (sn)
////            }
//        } else {
//            int value = (int)(s-sn)/m;
//            System.out.println("value "+value);
//            iterrations = n + value;
//        }
//        
//        System.out.println(iterrations);
////                ((t-a)/d)+1 < n
        
        int total = p;
        int count = 1;
        while(true) {            
            System.out.println(total+"-"+count);
            if (total>s) {
                break;
            }
            p = Math.max(p-d, m);
            total += p;
            count++;
//            System.out.println("");
        }
        System.out.println(count-1);
        return count-1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

//        bufferedWriter.write(String.valueOf(answer));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
    
}
