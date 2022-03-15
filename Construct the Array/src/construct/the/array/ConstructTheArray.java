/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construct.the.array;

/**
 *
 * @author wimukthirajapaksha
 */
public class ConstructTheArray {

    /**
     * @param args the command line arguments
     */
    
    public static long countArray(int n, int k, int x) {
        long[] a = new long[n];
        long[] b = new long[n];
        if (x==1) {
            a[0]=1;
        } else {
            b[0]=1;
        }
        for (int i=1; i<n; i++) {
            a[i]=b[i-1];
            b[i]=((a[i-1]*(k-1))+(b[i-1]*(k-2)))%(int)(Math.pow(10, 9)+7);
        }
//        for (int i=0; i<n; i++) {
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        for (int i=0; i<n; i++) {
//            System.out.print(b[i]+" ");
//        }
        System.out.println(a[n-1]);
        return a[n-1];
    }
    
    public static void main(String[] args) {
//        countArray(4, 3, 2);
        countArray(5, 4, 3);
    }
}
