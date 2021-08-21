/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flatland.space.stations;

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
public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {
        int max = 0;
        boolean firstFound = false;
        boolean lastFound = false;
        
        if (Arrays.stream(c).anyMatch(x-> x==0)) {
            firstFound = true;
        } else {
            c = Arrays.copyOf(c, c.length+1);
            c[c.length-1] = 0;
        } 
        if (Arrays.stream(c).anyMatch(x-> x==n-1)) {
            lastFound = true;
        } else {
            c = Arrays.copyOf(c, c.length+1);
            c[c.length-1] = n-1;
        }
        
        Arrays.sort(c);
        for (int i=0; i<c.length-1; i++) {
            if ((i==0 && !firstFound) || (i==c.length-2 && !lastFound)) {
                if (max < ((int)Math.abs(c[i]-c[i+1]))) {
                    max = (int)Math.abs(c[i]-c[i+1]);
                }
            } else {
                if (max < ((int)Math.abs(c[i]-c[i+1])/2)) {
                    max = (int)Math.abs(c[i]-c[i+1])/2;
                }
                System.out.println("max"+max);
            }
        }
        System.out.println(max);
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
    
}
