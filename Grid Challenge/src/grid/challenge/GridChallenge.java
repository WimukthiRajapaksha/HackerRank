/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grid.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class GridChallenge {

    /**
     * @param args the command line arguments
     */
    
    public static String gridChallenge(List<String> grid) {
        char[][] str = new char[grid.size()][grid.get(0).length()];
        int i=0;
        for (String s: grid) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            System.out.println(arr);
            str[i]=arr;
            i++;
//            System.out.println(s);
        }
        System.out.println(str);
        boolean bre = false;
        for (int j=0; j<str[0].length; j++) {
            for (int k=0; k<str.length-1; k++) {
                if (Integer.valueOf(str[k][j])>Integer.valueOf(str[k+1][j])) {
                    System.out.println("Errrr");
                    bre = true;
                    break;
                }
            }
            if (bre) {
                break;
            }
        }
//        Collections.sort(grid);
//        System.out.println(grid);
        System.out.println((bre) ? "NO" : "YES");
        return (bre) ? "NO" : "YES";
    }
    
    public static void main(String[] args) {
        GridChallenge.gridChallenge(Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv"));
        String[] s = new String[2];
        s[0]="fworufqruoaa";
        char[] p= s[0].toCharArray();
        Arrays.sort(p);
        System.out.println(s[0]);
        System.out.println(p);
    }
    
}
