/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i=0; i<Math.max(s1.length(), s2.length()); i++) {
            if (i<s1.length()) {
                set1.add(s1.charAt(i));
            }
            if (i<s2.length()) {
                set2.add(s2.charAt(i));
            }
            
        }
        set1.retainAll(set2);
        return  set1.size() > 0 ? "YES" : "NO";
        
//        String min = s1.length() < s2.length() ? s1 : s2;
//        String max = s1.length() < s2.length() ? s2 : s1;
//        Set<Character> set = new HashSet<>();
//        for (int i=0; i<min.length(); i++) {
//            if (set.add(min.charAt(i)) && max.indexOf(min.charAt(i)) >= 0) {
//                System.out.println("yes");
//                return "YES";
//            }
//        }
//        System.out.println("no");
//        return "NO";
    }

}

public class TwoStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Result.twoStrings("hello", "world"));
        System.out.println(Result.twoStrings("hi", "world"));
    }
    
}
