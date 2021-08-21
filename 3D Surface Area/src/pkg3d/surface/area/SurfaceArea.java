/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3d.surface.area;

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
public class SurfaceArea {
    
    
//   x   x   x   x   x   x
// x 1 x 1 x 1 x 1 x 1 x 1 x -  i
//   x   x   x   x   x   x
// x 1 x 1 x 1 x 1 x 1 x 1 x -
//   x   x   x   x   x   x
// x 1 x 1 x 1 x 1 x 1 x 1 x -
//   x   x   x   x   x   x
// x 1 x 1 x 1 x 1 x 1 x 1 x -
//   x   x   x   x   x   x 
//  j

    static int surfaceArea(int[][] A) {
        int pairs = 0;
        int totalCount = 0;
        for (int i=0;i<A.length;i++) {
            for (int j=0;j<A[i].length-1;j++) {
                pairs+=Math.min(A[i][j], A[i][j+1]);
                
                totalCount+=A[i][j];
                pairs+=A[i][j]-1;
                if (j==A[i].length-2) {
                    totalCount+=A[i][j+1];
                    pairs+=A[i][j+1]-1;
                }
            }
        } 
        for (int i=0;i<A[0].length;i++) {
            for (int j=0;j<A.length-1;j++) {
                pairs+=Math.min(A[j][i], A[j+1][i]);
            }
        }
        
        System.out.println(totalCount);
        System.out.println(pairs);
        System.out.println((totalCount*6)-(2*pairs));
        return (totalCount*6)-(2*pairs);
        
        
        
        
        
        
        
        
        
//        int total=0;
//        for (int i=0;i<A.length;i++) {
//            for (int j=0;j<A[i].length;j++) {
//                total+=A[i][j];
//            }
//        }
//        System.out.println(total);
//        System.out.println((6*total)-(2*(total)));
//        return (6*total)-(2*(total));
//        return 0;
        
        
        
        
        
        
//        for(int i=0;i<=0;i++) {
//            System.out.println("ii "+i);
//        }
//        int count = 0;
//        int zeroCount = 0;
//        if (A.length>1 && A[0].length>1) {
//            for (int i=0; i<A.length; i++) {
//                for (int j=0; j<A[i].length; j++) {
//                    if (i==0||i==A.length-1) {
//                        count+=A[i][j];
//                    } 
//                    if (i!=A.length-1) {
//                        count+=(int)Math.abs(A[i][j]-A[i+1][j]);
//                    }
//                    if (A[i][j]==0) {
//                        zeroCount++;
//                    }
//                }
//            }
//            System.out.println(count);
//            for (int i=0; i<A[0].length; i++) {
//                for (int j=0; j<A.length; j++) {
//                    if (i==0||i==A.length-1) {
//                        count+=A[j][i];
//                    } 
//                    if (i!=A.length-1) {
//                        count+=(int)Math.abs(A[j][i]-A[j][i+1]);
//                    }
//                    if (A[j][i]==0) {
//                        zeroCount++;
//                    }
//                }
//            }
//
//            count+=(((A.length*A[0].length)-zeroCount)*2);
//        } else if (A.length==1 && A[0].length>1) {
////            for (int i=0; i<A.length; i++) {
//            for (int j=0; j<A[0].length; j++) {
//                if (j==0||j==A.length-1) {
//                    count+=(A[0][j]*3);
//                } else {
//                    count+=(A[0][j]*2);
//                }
//                if (j!=A[0].length-1) {
//                    count+=(int)Math.abs(A[0][j]-A[0][j+1]);
//                }
//                if (A[0][j]==0) {
//                    zeroCount++;
//                }
//            }
//            count+=((A[0].length-zeroCount)*2);
////            }
//        } else if (A[0].length==1 && A.length>1) {
//            for (int j=0; j<A.length; j++) {
//                if (j==0||j==A.length-1) {
//                    count+=(A[j][0]*3);
//                } else {
//                    count+=(A[j][0]*2);
//                }
//                if (j!=A.length-1) {
//                    count+=(int)Math.abs(A[j][0]-A[j+1][0]);
//                }
//                if (A[j][0]==0) {
//                    zeroCount++;
//                }
//            }
//            count+=((A.length-zeroCount)*2);
//        } else {
//            count=6;
//        }
//        
//        System.out.println(count);
//        return count;
        
        
        
        
        
        
        
        
        
        
        
//        int total = 0;
//        int zeroCount = 0;
//        
//        
////  y   y   y   y   y   y 
////  1 x 1 x 1 x 1 x 1 x 1  -  i
////   
////  1 x 1 x 1 x 1 x 1 x 1  -  i
////   
////  1 x 1 x 1 x 1 x 1 x 1  -  i
////   
////  1 x 1 x 1 x 1 x 1 x 1  -  i
////  y   y   y   y   y   y 
////  j   j   j   j   j
//
//        int iCount = 0;
//        int jCount = 0;
//        for (int i=0; i<A.length; i++) {
//            for (int j=0; j<A[i].length-1; j++) {
//                iCount+=Math.abs(A[i][j]-A[i][j+1]);
//                if(i==0||i==A.length-1) {
//                    jCount+=A[i][j];
//                    if (j==A[i].length-2) {
//                        jCount+=A[i][j+1];
//                    }
//                }
//                if (A[i][j]==0) {
//                    zeroCount++;
//                }
//            }
//            if (A[i].length==1) {
//                iCount=2;
//            }
////            total+=iCount;
//        }
//        
//        for (int i=0; i<A[0].length; i++) {
//            for (int j=0; j<A.length-1; j++) {
//                jCount+=Math.abs(A[j][i]-A[j+1][i]);
//                if (i==0||i==A[0].length-1) {
//                    iCount+=A[j][i];
//                    if (j==A[i].length-2) {
//                        iCount+=A[j+1][i];
//                    }
//                }
//            }
//            if (A.length==1) {
//                jCount=2;
//            }
////            total+=count;
//        }
//        System.out.println("i count "+iCount);
//        System.out.println("j count "+jCount);
//        total= iCount+ jCount+ ((A.length*A[0].length)-zeroCount)*2;
//        System.out.println("count "+total);
//        System.out.println(total);
//        return total;
        
        
        
        
        
        
        
        
        
        
        
//        22, 20
//        14, 15



//        int count = 0;
//        for (int i=0; i<A.length; i++) {
//            Arrays.sort(A[i]);
//            count=count+(A[i][A[i].length-1]*2);
//        } 
//        for (int i=0; i<A[0].length; i++) {
//            int[] list = new int[A.length];
//            for (int j=0; j<A.length; j++) {
//                list[j] = A[j][i];
//            }
//            
//            Arrays.sort(list);
//            count=count+(list[list.length-1]*2);
//        }
//        count=count+(A.length*A[0].length*2);
//        System.out.println(count);
//        return count;

//   x   x   x   x   x   x
// x 1 x 1 x 1 x 1 x 1 x 1 x -  i
//   x   x   x   x   x   x
// x 1 x 1 x 1 x 1 x 1 x 1 x -
//   x   x   x   x   x   x
// x 1 x 1 x 1 x 1 x 1 x 1 x -
//   x   x   x   x   x   x
// x 1 x 1 x 1 x 1 x 1 x 1 x -
//   x   x   x   x   x   x 
//  j
//        int totalCount = 0;
//        int zeroFromTopCount = 0;
//        for (int i=0; i<A.length; i++) {
//            int count = A[i][0];
////            int count = 0;
//            count += A[i][A[i].length-1];
//            
//            for (int j=0; j<A[i].length-1; j++) {
//                count += Math.abs(A[i][j]-A[i][j+1]);
//                if (i==0 || i==A.length-1) {
//                    count+=A[i][j];
//                }
//                if (j==A.length-2 && (i==0 || i==A.length-1)) {
//                    count+=A[i][A.length-1];
//                }
//                if (i!=A.length-1) {
//                    count += Math.abs(A[i][j]-A[i+1][j]);
//                }
//                if (A[i][j]==0) {
//                    zeroFromTopCount++;
//                }
//            }
////            count+=A[i][A[i].length-1];
//            totalCount += count;
//        }
//        totalCount+=(((A.length*A[0].length)-zeroFromTopCount)*2);
//        System.out.println(totalCount);
//        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] HW = scanner.nextLine().split(" ");

        int H = Integer.parseInt(HW[0]);

        int W = Integer.parseInt(HW[1]);

        int[][] A = new int[H][W];

        for (int i = 0; i < H; i++) {
            String[] ARowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < W; j++) {
                int AItem = Integer.parseInt(ARowItems[j]);
                A[i][j] = AItem;
            }
        }

        int result = surfaceArea(A);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
    
}
