/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.icpc.team;

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

public class ACMICPCTeam {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
//        char[] ch = topic[0].toCharArray();
//        byte[] arr = topic[0].getBytes();
//        for (byte b: arr) {
//            System.out.println(b);
//        }
//        byte[] byt = new byte[topic[0].length()];
//        for (char s: topic[0].toCharArray()) {
//            byt[0] = 
//        }
        int max = 0;
        int maxCount = 1;
        for (int i=0; i<topic.length-1; i++) {
            char[] ch = topic[i].toCharArray();
            for (int j=i+1; j<topic.length; j++) {
//                System.out.println("a "+topic[i]);
//                System.out.println("b "+topic[j]);
                int count=0;
                char[] ch2 = topic[j].toCharArray();
                for (int k=0;k<ch2.length;k++) {
                    int kk = Character.getNumericValue(ch[k]);
                    int kkk = Character.getNumericValue(ch2[k]);
                    if ((kk|kkk) == 1) {
                        count += 1;
                    }
                }
//                System.out.println("count-"+count);
                if (count>max) {
                    max = count;
                    maxCount = 1;
                } else if (count == max) {
                    maxCount += 1;
                }
            }
        }
//        System.out.println("max-"+max);
//        System.out.println("max count"+maxCount);
        int[] intt = {max, maxCount};
        return intt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));

//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
