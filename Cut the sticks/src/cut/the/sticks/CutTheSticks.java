/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cut.the.sticks;

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

public class CutTheSticks {

    // Complete the cutTheSticks function below.
//    static int[] cutTheSticks(int[] arr) {
//        List<Integer> listA = new ArrayList<>();
//        int min = 10000;
//        int count = arr.length;
//        List<Integer> ori = new ArrayList<>();
//        for (int i: arr) {
//            ori.add(i);
//        }
//        listA.add(arr.length);
//        while (count>0) {
//            int minCount = 0;
//            min = 1000;
//            for (int i=0; i<ori.size(); i++) {
//                if (min>ori.get(i)) {
//                    minCount = 0;
//                    min = ori.get(i);
//                } else if (min==ori.get(i)) {
//                    minCount += 1;
//                }
//            }
//            
//            if (minCount == ori.size()) {
//                listA.add(minCount);
////                System.out.println("--");
//                count = 0;
//            } else {
//                List<Integer> li = new ArrayList<>();
//                for (int i=0; i<ori.size(); i++) {
//                    if (ori.get(i)-min > 0) {
//                        li.add(ori.get(i)-min);
//                    }
//                }
//                if (li.size()>0) {
//                    listA.add(li.size());
//                    count--;
//                } else {
////                    System.out.println("--");
//                    count = 0;
//                }
////                for (int i: li) {
////                    System.out.println("----"+i);
////                }
//                ori = li;
//            }
//            
//            
//            
////            List<Integer> li = new ArrayList<>();
////            for (int i=0; i<ori.size(); i++) {
////                if (ori.get(i)-min > 0) {
////                    li.add(ori.get(i)-min);
////                }
////            }
////            
////            System.out.println(minCount+"====");
////            System.out.println(ori.size());
////            if (li.size()>0) {
////                listA.add(arr.length-count+1, li.size());
////                count--;
////            } else {
////                if (minCount == ori.size()) {
////                    listA.add(arr.length-count+1, minCount);
////                }
////                count = 0;
////            } 
////            ori = li;
//        }
//        int[] list = new int[listA.size()];
//        for (int i=0; i<listA.size(); i++) {
////            System.out.println(listA.get(i));
//            list[i] = listA.get(i);
//        }
//        return list;
//    }
    
    static int[] cutTheSticks(int[] arr) {
        List<Integer> li = new ArrayList<>();
        
        Arrays.sort(arr);
        for (int i = 0; i< arr.length; i++) {
            if (i==0 || arr[i] != arr[i-1]) {
                li.add(arr.length-i);
            }
        }
        int[] ret = new int[li.size()];
        for (int i = 0; i<li.size(); i++) {
            ret[i] = li.get(i);
        }
        return ret;
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

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
            }
        }

//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
