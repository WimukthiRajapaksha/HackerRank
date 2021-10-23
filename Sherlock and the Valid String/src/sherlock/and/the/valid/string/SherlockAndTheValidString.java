/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlock.and.the.valid.string;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int min = 1000000;
        int max = 0;
        for (int i=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.replace(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
            if (max<map.get(s.charAt(i))) {
                max = map.get(s.charAt(i));
            }
        }
        System.out.println(map);
//        System.out.println(max);
//        System.out.println(min);
        int minCount = 0;
        int maxCount = 0;
        
        for (int i: map.values()) {
//            System.out.print(i);
            if (max == i) {
//                System.out.println(" 1");
                maxCount++;
            } else if (min>i) {
//                System.out.println(" 2");
                min = i;
                minCount = 1;
            } else if (min == i) {
//                System.out.println(" 3");
                minCount++;
            }
        }
        System.out.println(maxCount);
        System.out.println(minCount);
        if ((minCount*min)+(maxCount*max) != s.length()) {
            System.out.println("NO");
            return "NO";
        } else if (minCount == 0 || (minCount == 1 && min == 1 && max == min+1)) {
            System.out.println("YES");
            return "YES";
        } else if (maxCount == 1 && max == min+1) {
            System.out.println("YES");
            return "YES";
        } else {
            System.out.println("NO");
            return "NO";
        }
    }
}

public class SherlockAndTheValidString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Result.isValid("abc");
//        Result.isValid("abcc");
//        Result.isValid("aabbcd");
//        Result.isValid("aabbccddeefghi");
        Result.isValid("abcdefghhgfedecba");
//        Result.isValid("aaabbbcccdd");
//        Result.isValid("abbbbccccdddd");
    }
}
