/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautiful.triplets;

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
public class BeautifulTriplets {

    static int beautifulTriplets(int d, int[] arr) {
//        System.out.println(d+"-"+arr);
        int count = 0;
        for (int item: arr) {
//            System.out.println("item "+item);
//            System.out.println(Arrays.asList(arr).contains(item+d)+"+");
//            System.out.println(Arrays.asList(arr).contains(item+(2*d))+"-");
//            System.out.println(Arrays.binarySearch(arr, 4)+"+");
//            System.out.println(Arrays.binarySearch(arr, 11)+"-");
            if (Arrays.binarySearch(arr, item+d)>0 && Arrays.binarySearch(arr, item+(2*d))>0) {
//                System.out.println(item+" found");
                count++;
            }
        }
//        System.out.println(count+"--");
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
    
}
