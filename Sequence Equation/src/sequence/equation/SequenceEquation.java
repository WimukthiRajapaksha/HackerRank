/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence.equation;

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

public class SequenceEquation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] list = new int[p.length];
        for (int i=0; i<p.length; i++) {
//            System.out.println((i+1)+"...");
            boolean found = false;
            int elem = -5;
            while(!found) {
                for (int j=0; j<p.length; j++) {
                    if (p[j]==(i+1)) {
                        found = true;
                        elem = j;
                        break;
                    }
                }
            }
//            int elem = Arrays.binarySearch(p, 1);
//            int elem = Arrays.binarySearch(p, (i+1));
//            int elem = Arrays.asList(p).indexOf((i+1));
//            System.out.println(elem+"--");
            list[p[i]-1] = elem+1;
//            System.out.println(p[i]-1+"++");
        }
//        for (int l: list) {
//            System.out.println(l);
//        }
        return list;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

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
