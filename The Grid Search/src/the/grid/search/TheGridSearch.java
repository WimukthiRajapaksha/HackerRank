/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.grid.search;

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
public class TheGridSearch {

    static String gridSearch(String[] G, String[] P) {
//        int pCount = 0;
//        boolean found = false;
//        System.out.println(Pattern.matches("\\d*"+P[pCount]+"\\d*", G[i]));
//        System.out.println(Pattern.matches("[amn]", "amn"));
//        for (int i=0;i<G.length;i++) {
////            System.out.println(Pattern.matches("\\d*"+P[pCount]+"\\d*", G[i]));
//            if (Pattern.matches("\\d*"+P[pCount]+"\\d*", G[i])) {
//                
//                pCount++;
//            } else {
//                pCount = 0;
//            }
//            if (pCount == P.length) {
//                found = true;
//                break;
//            }
//        }
//        if (found) {
//            System.out.println("true");
//            return "YES";
//        } else {
//            System.out.println("false");
//            return "NO";
//        }

//        System.out.println("abcdecfg".indexOf("c", 3));
        int tracker = 0;
        int temp = 0;
        int i=0;
        int indexTracker = 0;
        while (i<G.length) {  
            if (tracker<P.length) {
                if (G[i].indexOf(P[tracker], indexTracker)>=0) {
                    System.out.println("Found");
                    if (tracker==0) {
                        indexTracker = G[i].indexOf(P[tracker], indexTracker);
                        tracker++;
                        i++;
                    } else if (indexTracker != G[i].indexOf(P[tracker], indexTracker)) {
                        i = temp;
                        tracker = 0;
                        indexTracker = G[i].indexOf(P[tracker], indexTracker)+1;
                    } else {
                        tracker++;
                        i++;
                    }
                } else {
                    System.out.println("Restart"+tracker+" "+i);
                    if (tracker == P.length) {
                        break;
                    }
                    if (tracker == 0) {
                        temp++;
                    } else {
                        tracker = 0;
                        temp++;
                    }
                    i=temp;
                    indexTracker = 0;
                    
                }
            } else {
                break;
            } 
        }
        if (tracker == P.length) {
            System.out.println("True");
            return "YES";
        } else {
            System.out.println("False");
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
    
}
