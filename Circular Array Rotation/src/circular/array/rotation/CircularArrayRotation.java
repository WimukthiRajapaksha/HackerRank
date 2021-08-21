/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular.array.rotation;

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
import java.util.stream.IntStream;

public class CircularArrayRotation {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] newLi = new int[queries.length];
        int[] list = new int[a.length];
        int pla = 0;
        for (int i=0; i<a.length; i++) {
            pla = (i+k)%a.length;
            list[pla] = a[i];
//            boolean contains = IntStream.of(queries).anyMatch(x -> x == pla);
            for (int j=0; j<queries.length; j++) {
                if (queries[j]==pla) {
                    newLi[j] = a[i];
                }
            }
        }
        
        
//        return list;

//        int[] list = new int[a.length];
//        int pla = 0;
//        for (int i=0; i<queries.length; i++) {
//            pla = (i+k)%a.length;
//            list[pla] = a[i];
//        }
//        System.out.println(list);
        for (int i: newLi) {
            System.out.println(i);
        }
        return  newLi;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
            }
        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
