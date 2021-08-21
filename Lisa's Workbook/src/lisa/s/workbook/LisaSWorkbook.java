/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisa.s.workbook;

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
public class LisaSWorkbook {

    static int workbook(int n, int k, int[] arr) {
        int previousPageCount = 0;
        int specialProblemCount = 0;
        for (int i=0; i<arr.length; i++) {
            int forThisChapterPages = (int)Math.ceil(arr[i]/(float)k);
            System.out.println("previous page count "+previousPageCount);
            System.out.println("for this chapter "+forThisChapterPages);
            for (int j=1; j<=forThisChapterPages; j++) {
                previousPageCount += 1;
                if ((previousPageCount<=k*j) && (previousPageCount>k*(j-1)) && (previousPageCount<=arr[i])) {
                    System.out.println("For "+arr[i]);
                    specialProblemCount += 1;
                }
            }
//            previousPageCount += forThisChapterPages;
//            pageCount += (int)Math.ceil(arr[i]);
//            if (previousPageCount<=arr[i]){
//                specialProblemCount += 1; 
//            }
//            previousPageCount = pageCount;
        }
        System.out.println(specialProblemCount);
        return specialProblemCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = workbook(n, k, arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
    
}
