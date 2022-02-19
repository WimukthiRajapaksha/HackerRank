/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.modified;

import java.math.BigInteger;

/**
 *
 * @author wimukthirajapaksha
 */
public class FibonacciModified {

    /**
     * @param args the command line arguments
     */
    
    public static BigInteger fibonacciModified(int t1, int t2, int n) {
        BigInteger a = BigInteger.valueOf(t1);
        BigInteger b = BigInteger.valueOf(t2);
        for (int i=1; i<n-1; i++) {
            BigInteger temp = a.add(b.multiply(b));
            a = b;
            b = temp;
            System.out.println(i+2+" "+b);
        }
        System.out.println(b);
        return b;
    }
    
    public static void main(String[] args) {
        FibonacciModified.fibonacciModified(0, 1, 10);
    }
}
