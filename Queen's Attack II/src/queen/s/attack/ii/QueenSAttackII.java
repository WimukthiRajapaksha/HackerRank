/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queen.s.attack.ii;

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

public class QueenSAttackII {
    
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {   
        int maxDisLeft = c_q-1;
        int maxDisRight = n-c_q;
        int maxDisTop = n-r_q;
        int maxDisBottom = r_q-1;
        System.out.println("=="+maxDisBottom);
        int maxDisLeftBott = Math.min(c_q-1, r_q-1);
//        if (r_q-1>c_q-1) {
//            maxDisLeftBott = c_q-1;
//        } else {
//            maxDisLeftBott = r_q-1;
//        }
//        int[] leftBottom = {r_q-maxDisLeftBott-1, c_q-maxDisLeftBott-1};
        
        int maxDisLeftTop = Math.min(c_q-1, n-r_q);
//        if (n-r_q>c_q-1) {
//            maxDisLeftTop = c_q-1;
//        } else {
//            maxDisLeftTop = n-r_q;
//        }
//        int[] leftTop = {r_q+maxDisLeftTop+1, c_q-maxDisLeftTop-1};
        
        int maxDisRightBott = Math.min(r_q-1, n-c_q);
//        if (n-c_q>r_q-1) {
//            maxDisRightBott = r_q-1;
//        } else {
//            maxDisRightBott = n-c_q;
//        }
//        int[] rightBottom = {r_q-maxDisRightBott-1, c_q+maxDisRightBott+1};
        
        int maxDisRightTop=Math.min(n-r_q, n-c_q);
//        if (n-c_q>n-r_q) {
//            maxDisRightTop = n-r_q;
//        } else {
//            maxDisRightTop = n-c_q;
//        }
//        int[] rightTop = {r_q+maxDisRightTop+1, c_q+maxDisRightTop+1};
        for (int[] obstacle : obstacles) {
            if (obstacle[0] == r_q) {
                if (obstacle[1] < c_q) {
                    maxDisLeft = Math.min(maxDisLeft, Math.abs(obstacle[1]-c_q)-1);
//                    if (maxDisLeft>Math.abs(-obstacles[i][1]+c_q-1)) {
//                        maxDisLeft = Math.abs(-obstacles[i][1]+c_q-1);
//                    }
                } else if (obstacle[1] > c_q) {
                    maxDisRight = Math.min(maxDisRight, Math.abs(obstacle[1]-c_q)-1);
//                    if (maxDisRight>Math.abs(obstacles[i][1]-c_q-1)) {
//                        maxDisRight = Math.abs(obstacles[i][1]-c_q-1);
//                    }
                } else {
                    maxDisLeft = 0;
                    maxDisRight = 0;
                    maxDisLeftTop = 0;
                    maxDisLeftBott = 0;
                    maxDisRightTop = 0;
                    maxDisRightBott = 0;
                }
            } else if (obstacle[1] == c_q) {
                if (obstacle[0] < r_q) {
                    maxDisBottom = Math.min(maxDisBottom, Math.abs(obstacle[0] - r_q)-1);
                    System.out.println("++"+maxDisBottom);
//                    if (maxDisBottom>Math.abs(-obstacles[i][0]+r_q-1)) {
//                        maxDisBottom = Math.abs(-obstacles[i][0]+r_q-1);
//                    }
                } else if (obstacle[0] > r_q) {
                    maxDisTop = Math.min(maxDisTop, Math.abs(obstacle[0] - r_q)-1);
//                    if (maxDisTop>Math.abs(obstacles[i][0]-r_q-1)) {
//                        maxDisTop = Math.abs(obstacles[i][1]-r_q-1);
//                    }
                } else {
                    maxDisTop = 0;
                    maxDisBottom = 0;
                }
            } else if (Math.abs(obstacle[0] - r_q) == Math.abs(obstacle[1] - c_q)) {
                if (obstacle[0] > r_q && obstacle[1] > c_q) {
                    maxDisRightTop = Math.min(maxDisRightTop, Math.abs(obstacle[1] - c_q)-1);
//                    if (maxDisRightTop>obstacles[i][0]-r_q) {
//                        maxDisRightTop = obstacles[i][0]-r_q;
//                    }
                } else if (obstacle[0] > r_q && obstacle[1] < c_q) {
                    maxDisLeftTop = Math.min(maxDisLeftTop, Math.abs(obstacle[1] - c_q)-1);
//                    if (maxDisLeftTop>Math.abs(obstacles[i][0]-r_q)) {
//                        maxDisLeftTop = Math.abs(obstacles[i][0]-r_q);
//                    }
                } else if (obstacle[0] < r_q && obstacle[1] < c_q) {
                    maxDisLeftBott = Math.min(maxDisLeftBott, Math.abs(obstacle[1] - c_q)-1);
//                    if (maxDisLeftBott>Math.abs(obstacles[i][0]-r_q)) {
//                        maxDisLeftBott = Math.abs(obstacles[i][0]-r_q);
//                    }
                } else if (obstacle[0] < r_q && obstacle[1] > c_q) {
                    maxDisRightBott = Math.min(maxDisRightBott, Math.abs(obstacle[1] - c_q)-1);
//                    if (maxDisRightBott>Math.abs(obstacles[i][0]-r_q)) {
//                        maxDisRightBott = Math.abs(obstacles[i][0]-r_q);
//                    }
                } else {
                    maxDisLeftTop = 0;
                    maxDisLeftBott = 0;
                    maxDisRightTop = 0;
                    maxDisRightBott = 0;
                }
            }
        }
        System.out.println(maxDisTop);
        System.out.println(maxDisRightTop);
        System.out.println(maxDisRight);
        System.out.println(maxDisRightBott);
        System.out.println(maxDisBottom);
        System.out.println(maxDisLeftBott);
        System.out.println(maxDisLeft);
        System.out.println(maxDisLeftTop);
        
        System.out.println("--"+(maxDisTop+maxDisRightTop+maxDisRight+maxDisRightBott+maxDisBottom+maxDisLeftBott+maxDisLeft+maxDisLeftTop));
        
        return 0;
    }

    // Complete the queensAttack function below.
//    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
//        int vari = 2000000000;
//        int count = 0;
//        int[] fir = {r_q, 0}; // for left
//        int[] sec = {r_q, vari}; // right
//        int[] thi = {0, c_q}; // bottom
//        int[] fort = {vari, c_q}; // top
//        int[] fif = {r_q+vari, c_q+vari}; // left bottom
//        int[] six = {r_q-vari, c_q-vari}; // right top
//        int[] sev = {r_q+vari, c_q-vari}; // right bottom
//        int[] eig = {r_q-vari, c_q+vari}; // left top
//        
//        for (int i=0; i<obstacles.length; i++) {
//            if(obstacles[i][0]==r_q) { // same row
//                if(obstacles[i][1]>c_q) { // obs in right
//                    if (obstacles[i][1]-c_q < sec[1]-c_q) {
//                        sec = obstacles[i];
//                    }
//                } else { // obs in left
//                    if (c_q-obstacles[i][1] < c_q-fir[1]) {
//                        fir = obstacles[i];
//                    }
//                }
//                count +=1;
//            } else if (obstacles[i][1]==c_q) { // column
//                if(obstacles[i][0]>r_q) { // obs in top
//                    if (obstacles[i][0]-r_q<fort[0]-r_q) {
//                        fort = obstacles[i];
//                    }
//                } else { // obs in bottom
//                    if (r_q-obstacles[i][0]<r_q-thi[0]) {
//                        thi  = obstacles[i];
//                    }
//                }
//                count +=1;
//            } else if (obstacles[i][0]-r_q == obstacles[i][1]-c_q) { // top right
//                if (obstacles[i][0]-r_q<fif[0]-r_q) {
//                    fif = obstacles[i];
//                }
//                count +=1;
//            } else if (obstacles[i][0]-r_q == c_q-obstacles[i][1]) { // top left
//                if (obstacles[i][0]-r_q<sev[0]-r_q) {
//                    sev = obstacles[i];
//                }
//                count +=1;
//            } else if (r_q-obstacles[i][0] == obstacles[i][1]-c_q) { // bottom right
//                if (r_q-obstacles[i][0]<eig[1]-c_q) {
//                    eig = obstacles[i];
//                }
//                count +=1;
//            } else if (r_q-obstacles[i][0] == c_q-obstacles[i][1]) { // bottom left
//                if(r_q-obstacles[i][0]<c_q-six[1]) {
//                    six = obstacles[i];
//                }
//                count +=1;
//            }
//        }
//        System.out.println(fir[0]+"-"+fir[1]);
//        System.out.println(sec[0]+"-"+sec[1]);
//        System.out.println(thi[0]+"-"+thi[1]);
//        System.out.println(fort[0]+"-"+fort[1]);
//        System.out.println(fif[0]+"-"+fif[1]);
//        System.out.println(six[0]+"-"+six[1]);
//        System.out.println(sev[0]+"-"+sev[1]);
//        System.out.println(eig[0]+"-"+eig[1]);
//        
//        int m = 0;
//        if (fir[1]!=0) {
//           m += c_q-fir[1]-1;
//        } else {
//            m+=c_q-1;
//        }
//        if (sec[1]!=vari) {
//            m += sec[1]-c_q-1;
//        } else {
//            m+=n-c_q;
//        }
//        if (thi[0]!=0) {
//            m+=r_q-thi[0]-1;
//        } else {
//            m+=r_q-1;
//        }
//        if (fort[0]!=vari) {
//            m+=fort[0]-r_q-1;
//        } else {
//            m+=n-r_q;
//        }
//        if (fif[0]!=r_q+vari) {
//            m+=fif[0]-r_q-1;
//        } else {
//            if (r_q-1>c_q-1) {
//                m+=c_q-1;
//            } else {
//                m+=r_q-1;
//            }
////            m+=n-r_q;
//        }
//        if (six[0]!=r_q-vari) {
//            m+=r_q-six[0]-1;
//        } else {
//            if (n-r_q>n-c_q) {
//                m+=n-c_q;
//            } else {
//                m+=n-r_q;
//            }
////            m+=r_q-1;
//        }
//        if (sev[0]!=r_q+vari) {
//            m+=sev[0]-r_q-1;
//        } else {
//            if (n-c_q>r_q-1) {
//                m+=r_q-1;
//            } else {
//                m+=n-c_q;
//            }
////            m+=n-c_q;
//        }
//        if (eig[0]!=r_q-vari) {
//            m+=r_q-eig[0]-1;
//        } else {
//            if (n-r_q>c_q-1) {
//                m+=c_q-1;
//            } else {
//                m+=n-r_q;
//            }
////            m+=c_q-1;
//        }
//        
//        System.out.println(count);
//        System.out.println("m-"+m);
//        return 0;
//    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
