/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalize.the.array;

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

public class EqualizeTheArray {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i: arr) {
            if (h.containsKey(i)) {
//                System.out.println(i+" "+(h.get(i)+1));
                h.put(i, h.get(i)+1);
            } else {
//                System.out.println(i+" "+1);
                h.put(i, 1);
            }
        }
        int max = 0;
        Iterator it = h.entrySet().iterator();
        while (it.hasNext()) {            
            Map.Entry pair = (Map.Entry)it.next();
            if (max<(int)pair.getValue()) {
                max = (int)pair.getValue();
            }
        }
//        for (int i: h) {
//            System.out.println("mm"+h.get(i));
//            if (max < h.get(i)) {
//                max = h.get(i);
//            }
//        }
//        System.out.println(arr.length-max);
        return arr.length-max;
        
        
        
//        Arrays.sort(arr);
//        int max = 0;
//        for (int i=0; i< arr.length; i++) {
//            if (max < Collections.frequency(arr, arr[i])) {
//                max = Collections.frequency(arr, arr[i]);
//            }
//        }
//        return arr.length - max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
