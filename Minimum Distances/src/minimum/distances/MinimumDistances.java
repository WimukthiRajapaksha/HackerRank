/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimum.distances;

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
public class MinimumDistances {
    static int minimumDistances(int[] a) {
        Set<Integer> set = new HashSet<>();
        int minDis = 1000000;
        for (int i=0; i<a.length; i++) {
            int lastIndex = 0;
            if (!set.add(a[i])) {
                lastIndex = i;
                int firstIndex = -1;
//                int firstIndex = Arrays.asList(what).indexOf(i);
                
                for (int j=0; j<Arrays.copyOfRange(a, 0, i).length; j++) {
                    if (a[j]==a[i]) {
                        firstIndex = j;
                        break;
                    }
                }
                
//                System.out.println(firstIndex+"-"+lastIndex);
                if (minDis > (lastIndex-firstIndex)) {
                    minDis = (lastIndex-firstIndex);
                }
            }
        }
//        System.out.println(minDis);
        if (minDis == 1000000) {
            minDis = -1;
        }
        return minDis;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
