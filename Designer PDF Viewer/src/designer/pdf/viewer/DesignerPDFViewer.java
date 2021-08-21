/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designer.pdf.viewer;

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

class DesignPDFViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        word = word.toLowerCase();
        char[] ch  = word.toCharArray();
//        List<Integer> valList = new ArrayList<>();
        int max = -100;
        for(char c : ch){
            int val = 0;
            int temp = (int)c;
            int temp_integer = 96;
            if(temp<=122 & temp>=97) {
                val = temp-temp_integer;
//                valList.add(val);
                if (max < h[val-1]) {
//                    System.out.println(val-1);
                    max = h[val-1];
                }
            }
        } 
//        System.out.println(max*ch.length);
        return max*ch.length;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
