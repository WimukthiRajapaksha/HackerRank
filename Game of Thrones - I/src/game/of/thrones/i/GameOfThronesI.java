/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.of.thrones.i;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'gameOfThrones' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String gameOfThrones(String s) {
        Set<Character> set = new HashSet<>();
        if (s.length()%2 == 0) {
            int i=0;
            while (i<s.length()) {
//                System.out.println(s.charAt(i));
//                System.out.println(set.add(s.charAt(i)));
                if (set.add(s.charAt(i))) {
                    int len = s.length();
                    s = s.replaceAll(String.valueOf(s.charAt(i)), "");
                    int newLen = s.length();
                    if ((len-newLen)%2 != 0) {
                        System.out.println("NO");
                        return "NO";
                    }
                } else {
                    i++;
                }
            }
        } else {
            int oddCount = 0;
            int i=0;
            while (i<s.length()) {
                System.out.println(s.charAt(i));
//                System.out.println(set.add(s.charAt(i)));
//                System.out.println(set.size());
                if (set.add(s.charAt(i))) {
                    int len = s.length();
                    s = s.replaceAll(String.valueOf(s.charAt(i)), "");
                    int newLen = s.length();
                    if ((len-newLen)%2 != 0 && oddCount == 0) {
                        oddCount++;
                    } else if ((len-newLen)%2 != 0) {
                        System.out.println("NO");
                        return "NO";
                    }
                } else {
//                    System.out.println("already have " +s.charAt(i));
                    i++;
                }
            }
        }
        System.out.println("YES");
        return "YES";
    }
}

public class GameOfThronesI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Result.gameOfThrones("abcddcba");
//        Result.gameOfThrones("aaabbbb");
        Result.gameOfThrones("cdefghmnopqrstuvw");
        Result.gameOfThrones("cdcdcdcdeeeef");
//        Result.gameOfThrones("abccbbaa");
//        Set<Character> set = new HashSet<>();
//        System.out.println(set.add('a'));
//        System.out.println(set.add('a'));
    }
    
}
