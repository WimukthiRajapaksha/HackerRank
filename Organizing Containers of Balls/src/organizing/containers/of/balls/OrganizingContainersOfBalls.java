/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizing.containers.of.balls;

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

public class OrganizingContainersOfBalls {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {
//        List<Integer> list = new ArrayList<>();
        
        int[] particularBox = new int[container.length];
        int[] particularItemCount = new int[container.length];
        
        for (int i=0; i<container.length; i++) {
            for (int j=0; j<container[i].length; j++) {
                particularBox[i] += container[i][j];
                particularItemCount[i] += container[j][i];
            }
        }
        
        Arrays.sort(particularBox);
        Arrays.sort(particularItemCount);
 
        // Linearly compare elements
        for (int i = 0; i < particularBox.length; i++)
            if (particularBox[i] != particularItemCount[i]) {
                System.out.println("Impossible");
                return "Impossible";
            }
        System.out.println("Possible");
        return "Possible";
        
    
              
        
        
        
        
        
        
//        String pos = "Possible";
//        String impos = "Impossible";
//        
//        int boxes = container.length;
//        int[] eachNumberTotalCount = new int[container.length];
//        int[] eachBucketTotalCount = new int[container.length];
//        List<Integer> allItems = new ArrayList<>();
//        
//        int finalCounting = 0;
//        for (int i=0; i< container.length; i++) {
//            int bucketTotalCount = 0;
//            for (int j=0; j< container[i].length; j++) {
//                bucketTotalCount += container[i][j];
//                eachNumberTotalCount[j] += container[i][j];
//            }
//            eachBucketTotalCount[i] = bucketTotalCount;
//            allItems.add(i);
//        }
//        
//        for (int i: eachNumberTotalCount) {
//            System.out.println("each count="+i);
//        }
//        
//        
//        for (int i=0; i< container.length; i++) {
//            int len = container[i].length;
//            int count = 0;
//            int[] detail = container[i];
////            for (int j=0; j<container[i].length; j++) {
////                count += container[i][j];
////                detail[container[i][j]] += + 1;
////            }
//            System.out.println(count);
//            int max = -1;
//            int maxItem = -1;
//            
////            Set<Integer> all = new HashSet<>();
////            int total = 0;
//            for (int j=0; j<detail.length; j++) {
//                if (max<detail[j] && eachNumberTotalCount[j]==eachBucketTotalCount[i]) {
//                    max = detail[j];
//                    maxItem = j;
//                }
////                total += detail[j];
////                if () {
////                    
////                } 
////                System.out.println("items - "+j);
//            }
//            
//            if (max != -1) {
//                allItems.remove(new Integer(maxItem));
//            } else {
//                
//            }
//            
//            System.out.println("matching for "+i+"-"+maxItem+"-max-"+max);
////            System.out.println("total - "+total+"-"+max+"="+(total-max));
////            finalCounting += (total-max);
//        }
//        System.out.println("final - "+ (finalCounting+1)/2.0);
//        return pos;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
