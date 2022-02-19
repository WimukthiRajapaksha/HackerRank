/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clique;

/**
 *
 * @author wimukthirajapaksha
 */
public class Clique {

    /**
     * @param args the command line arguments
     */
    
    public static double binarySearch(double n, double m, double r) {
        System.out.println(n+" "+m+" "+r);
//        double k = (1/2.0)*(Math.pow(n, 2)-((n%r)*Math.pow(n/r, 2))-((r-(n%r)))*Math.pow(n/r, 2));
        double k = ((1-1/r)*(Math.pow(n, 2)-Math.pow(1, 2))/2.0)+(1/2.0);
        if (m>k) {
            return r+1;
        } else {
            return binarySearch(n, m, r-1);
        }
    }
    
    public static int clique(int n, int m) {
        if (n*(n-1)/2<m) {
            System.out.println(n+1);
            return n+1;
        }
        double val = binarySearch(n, m, n-1);
        System.out.println(val);
        return 0;
    }
    
    public static void main(String[] args) {
        Clique.clique(3, 2);
//        System.out.println("------");
        Clique.clique(4, 6);
////        System.out.println("------");
        Clique.clique(5, 7);
////        System.out.println("------");
        Clique.clique(15, 144);
        System.out.println("------");
        Clique.clique(31, 459);
//        int j = 10;
//        int n=15;
//        int m=144;
//        System.out.println((j-2)*Math.pow(n, 2)/(2*(j-1))<m);
        
    }
}
