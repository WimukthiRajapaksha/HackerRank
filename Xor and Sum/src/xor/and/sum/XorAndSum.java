/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xor.and.sum;

/**
 *
 * @author wimukthirajapaksha
 */
public class XorAndSum {

    /**
     * @param args the command line arguments
     */
    
    public static int xorAndSum(String a, String b) {
        int count = 0;
        for (int i=0; i<=314159; i++) {
            count+=Integer.parseInt(a)^(Integer.parseInt(b)<<i);
        }
        System.out.println(count%(int)(Math.pow(10, 9))+7);
        
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(5<<33));
        System.out.println(5<<3);
        
        return 0;
    }
    
    public static void main(String[] args) {
        xorAndSum("10", "1010");
    }
    
}
