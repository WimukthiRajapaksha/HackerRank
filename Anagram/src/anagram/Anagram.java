/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.regex.Pattern;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
        if (s.length()%2==1) {
            System.out.println(-1);
            return -1;
        } else {
            String pre = s.substring(0, s.length()/2);
            String post = s.substring(s.length()/2, s.length());
            int count = 0;
            int i = 0;
            while (i<pre.length()) {
                if (!post.contains(pre.charAt(i)+"")) {
                    count++;
                } else {
                    post = post.replaceFirst(pre.charAt(i)+"", "");
                }
                i++;
            }
            return count;
        }
    }
}


public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Result.anagram("aaabbb");
//        Result.anagram("ab");
//        Result.anagram("abc");
//        Result.anagram("mnop");
        Result.anagram("xyyx");
        Result.anagram("xaxbbbxx");
    }
}
