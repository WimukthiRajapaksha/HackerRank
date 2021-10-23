/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two.characters;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {
    public static int alternate(String s) {
        char[][] matrix = new char[26][26];
        int[][] countMatrix = new int[26][26];
        int max = 0;
        
        for (int i=0; i<s.length(); i++) {
//            System.out.println(((int)s.charAt(i)-97));
            int a = ((int)s.charAt(i)-97);
//            matrix[((int)s.charAt(i)-97)];
            for (int j=0; j<26; j++) {
//                System.out.println(matrix[((int)s.charAt(i)-97)][j]);
//                if (matrix[((int)s.charAt(i)-97)][j] == '\u0000') {
//                    matrix[((int)s.charAt(i)-97)][j] = Character.MIN_VALUE;
//                }
                if (matrix[((int)s.charAt(i)-97)][j] != 'X') {
                    if (matrix[((int)s.charAt(i)-97)][j] != s.charAt(i)) {
                        matrix[((int)s.charAt(i)-97)][j] = s.charAt(i);
                        countMatrix[((int)s.charAt(i)-97)][j]++; 
                    } else {
                        matrix[((int)s.charAt(i)-97)][j] = 'X';
                        countMatrix[((int)s.charAt(i)-97)][j] = 0;
                    }
                }
//                if (matrix[j][((int)s.charAt(i)-97)] == '\u0000') {
//                    matrix[j][((int)s.charAt(i)-97)] = Character.MIN_VALUE;
//                }
                if (matrix[j][((int)s.charAt(i)-97)] != 'X') {
                    if (matrix[j][((int)s.charAt(i)-97)] != s.charAt(i)) {
                        matrix[j][((int)s.charAt(i)-97)] = s.charAt(i);
                        countMatrix[j][((int)s.charAt(i)-97)]++;
                    } else {
                        matrix[j][((int)s.charAt(i)-97)] = 'X';
                        countMatrix[j][((int)s.charAt(i)-97)] = 0;
                    }
                }
                
//                for (int k=0; k<26; k++) {
//                    
//                }
            }
        }
        for (int i=0; i<matrix.length-1; i++) {
            for (int j=i+1;j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (max<countMatrix[i][j]) {
                    max = countMatrix[i][j];
                }
            }
            System.out.println();
        }
        
//        System.out.println("\n\n\n");
//        for (int[] c: countMatrix) {
//            for (int cc: c) {
//                if (max<cc) {
//                    max = cc;
//                }
//                System.out.print(cc + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("\n\n\n\n\n\n");
//        System.out.println(max);
        return max == 1 ? 0 : max;
    }
}

public class TwoCharacters {
    public static void main(String[] args) {
        Result.alternate("abcabcabca");
    }
}
