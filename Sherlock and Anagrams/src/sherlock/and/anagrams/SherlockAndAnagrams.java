/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlock.and.anagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int k=1; k<s.length(); k++) {
            for (int i=0; i<s.length()-k+1; i++) {
                char[] charArr = s.substring(i, i+k).toCharArray();
                Arrays.sort(charArr);
                if (map.keySet().contains(String.valueOf(charArr))) {
                    map.replace(String.valueOf(charArr), map.get(String.valueOf(charArr))+1);
                } else {
                    map.put(String.valueOf(charArr), 1);
                }
            }
        }
        
        for (int i: map.values()) {
            count+= (i*(i-1)/2);
        }
        System.out.println(map);
        System.out.println(count);
        return count;
    }
}

public class SherlockAndAnagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Result.sherlockAndAnagrams("abba");
//        Result.sherlockAndAnagrams("ifailuhkqq");
        Result.sherlockAndAnagrams("kkkk");
    }
    
}
