/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package red.john.is.back;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */
public class RedJohnIsBack {

    /**
     * @param args the command line arguments
     */
    
    public static int redJohn(int n) {
        int[] arr = new int[n+1];
        for (int i=0; i<=Math.min(3, n); i++) {
            arr[i]=1;
        }
        if (n>=4) {
            arr[4]=2;
        }
        for (int i=5; i<=n; i++) {
            arr[i]=arr[i-1]+arr[i-4];
        }
        for (int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int temp = 0;
        for (int i=2; i<=arr[n]; i++) {
            if (primes(i)) {
                System.out.println("prime "+i);
                temp++;
            }
        }
        System.out.println("---- "+temp);
        return 0;
    }
    
    public static boolean primes(int n) {
        boolean prime = true;
        for (int j=2; j*j<=n; j++) {
            if (n%j==0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    
//    THIS WON'T WORK - TIMEOUTING 
//    public static int cVal(int n, int r) {
//        int ret = 1;
//        for (int i=1; i<=n; i++) {
//            ret*=i;
//        }
//        for (int i=1; i<=n-r; i++) {
//            ret/=i;
//        }
//        for (int i=1; i<=r; i++) {
//            ret/=i;
//        }
//        return ret;
//    }
//    
//    public static int redJohn(int n) {
//        int count = 0;
//        
//        for (int i=0; i<=n/4; i++) {
//            int remaiBri = n-4*i;
//            count+= cVal(remaiBri+i, remaiBri);
//            System.out.println(i+" - "+remaiBri+" "+cVal(remaiBri+i, remaiBri));
//        }
//        int temp = 0;
//        for (int i=2; i<=count; i++) {
//            if (isPrimes(i)) {
//                temp++;
//            }
//        }
//        System.out.println(temp+" temp");
//        return temp;
//    }
//    
//    public static boolean isPrimes(int n) {
//        boolean prime = true;
//        for (int j=2; j*j<=n; j++) {
//            if (n%j==0) {
//                prime = false;
//                break;
//            }
//        }
//        return prime;
//    }
    
    public static void main(String[] args) {
//        primes();
//        redJohn(5);
//        redJohn(10);
        redJohn(8);
    }
}
