/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big.sorting;

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

public class BigSorting {

    // Complete the bigSorting function below.
    static List<String> bigSorting(List<String> unsorted) {

//        for (int i=0;i<unsorted.size();i++) {
//            for (int j=i+1;j<unsorted.size();j++) {
////                System.out.println(unsorted.get(j));
//                if (unsorted.get(i).length() > unsorted.get(j).length()) {
//                    System.out.println(unsorted.get(i)+" - "+unsorted.get(j));  
//                    String temp = unsorted.get(i);
//                    unsorted.set(i, unsorted.get(j));
//                    unsorted.set(j, temp);
//                } else if (Double.valueOf(unsorted.get(i)).compareTo(Double.valueOf(unsorted.get(j))) > 0) {
//                    System.out.println(unsorted.get(i)+" + "+unsorted.get(j));
//                    String temp = unsorted.get(i);
//                    unsorted.set(i, unsorted.get(j));
//                    unsorted.set(j, temp);
//                }
//            }
//        }

        Collections.sort(unsorted, (a,b)->a.length() > b.length() ? 1 :Double.valueOf(a).compareTo(Double.valueOf(b)));
        for (String i: unsorted) {
            System.out.println(i);
        }
        return unsorted;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        List<String> lis = Arrays.asList("31415926535897932384626433832795", "1", "3", "10", "3", "5");
        BigSorting.bigSorting(lis);
        
        List<String> lis2 = Arrays.asList("1", "2", "100", "12303479849857341718340192371", "3084193741082937", "3084193741082938", "111", "200");
        BigSorting.bigSorting(lis2);
//        lis[1:3];
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] unsorted = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            String unsortedItem = scanner.nextLine();
//            unsorted[i] = unsortedItem;
//        }
//
//        String[] result = bigSorting(unsorted);
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(result[i]);
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}

