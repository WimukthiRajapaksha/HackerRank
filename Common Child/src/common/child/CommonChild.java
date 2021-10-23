/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.child;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */
public class CommonChild {

    /**
     * @param args the command line arguments
     */
    
    public static int commonChild(String s1, String s2) {
        char[] x1 = s1.toCharArray();
        char[] x2 = s2.toCharArray();
        int[][] arr = new int[s1.length()+1][s2.length()+1];
        for (int i=0; i<s1.length()+1; i++) {
            for (int j=0; j<s2.length()+1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0; i<s1.length()+1; i++) {
            for (int j=0; j<s2.length()+1; j++) {
                if (i==0 || j == 0) {
                    arr[i][j] = 0;
                } else if (x1[i-1]==x2[j-1]) {
                    arr[i][j] = arr[i-1][j-1]+1;
                } else {
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        System.out.println(arr[s1.length()][s2.length()]);        
        return arr[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
        CommonChild.commonChild("SHINCHAN", "NOHA");
    }
    
}
