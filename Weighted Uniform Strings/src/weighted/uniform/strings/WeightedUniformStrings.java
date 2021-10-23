/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weighted.uniform.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'weightedUniformStrings' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY queries
     */

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        Set<Integer> sum = new HashSet<>();
        List<String> returnList = new ArrayList<>();
        
        char prev = s.charAt(0);
        int counter = 1;
        for (int i=0; i<s.length(); i++) {
            if (i==0) {
                counter = 1;
            } else {
                if (s.charAt(i-1)==s.charAt(i) && prev == s.charAt(i)) {
                    counter++;
                } else if (s.charAt(i-1)==s.charAt(i) && prev != s.charAt(i)) {
                    counter = 0;
                } else {
                    counter = 1;
                    prev = s.charAt(i);
                }
            }
            System.out.println(counter*(Character.toLowerCase(s.charAt(i))-96));
            sum.add(counter*(Character.toLowerCase(s.charAt(i))-96));
        }
        
        System.out.println(sum);
        for (int q: queries) {
            System.out.println(sum.contains(q) ? "Yes" : "No");
            returnList.add(sum.contains(q) ? "Yes" : "No");
        }
        return returnList;
    }

}

public class WeightedUniformStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Result.weightedUniformStrings("abccddde", Arrays.asList(1, 3, 12, 5, 9, 10));
        Result.weightedUniformStrings("abbcccdccxxxx", Arrays.asList(9, 7 ,8, 12, 5));
    }
    
}
