/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package down.to.zero.ii;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */
public class DownToZeroII {

    /**
     * @param args the command line arguments
     */
    
    static int[] list = new int[(int)Math.pow(10, 6)+1];
    
    public static void init() {
        list[0]=0;
        list[1]=1;
        list[2]=2;
        for (int i=3; i<list.length; i++) {
            list[i]=list[i-1]+1;
            for (int j=2; j*j<=i; j++) {
                if (i%j==0) {
                    list[i] = Math.min(list[i/j]+1, list[i]);
                }
            }
        }
    }
    
    public static int downToZero(int n) {
        return list[n];
    }
    
    
    
    public static void main(String[] args) {
        DownToZeroII.init();
        System.out.println(DownToZeroII.downToZero(3));
        System.out.println("---------");
        System.out.println(DownToZeroII.downToZero(4));
        System.out.println("---------");
        System.out.println(DownToZeroII.downToZero(60));
    }
}
