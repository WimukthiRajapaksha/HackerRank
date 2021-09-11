/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weighted.uniform.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<String> li = new ArrayList<>();
        boolean[] liss = new boolean[queries.size()];
        int count = 0;
        int prevMatch = 0;
        
        for(int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
            if (count==0) {
                count = 1;
                prevMatch = Character.toLowerCase(s.charAt(i));
                System.out.println(prevMatch);
                System.out.println(count*(prevMatch-96));
                if (queries.contains(count*(prevMatch-96))) {
                    liss[queries.indexOf(count*(prevMatch-96))] = true;
                    System.out.println("yes1");
//                    li.add("YES");
                } else {
                    System.out.println("no1");
//                    li.add("NO");
                }
            } else {
                if (prevMatch == s.charAt(i)) {
                    count++;
                    if (queries.contains(count*(prevMatch-96))) {
                        liss[queries.indexOf(count*(prevMatch-96))] = true;
                        System.out.println("yes2");
//                        li.add("YES");
                    } else {
                        System.out.println("no2");
//                        li.add("NO");
                    }
                } else {
                    prevMatch = Character.toLowerCase(s.charAt(i));
                    count = 1;
                    if (queries.contains(count*(prevMatch-96))) {
                        liss[queries.indexOf(count*(prevMatch-96))] = true;
                        System.out.println("yes3");
//                        li.add("YES");
                    } else {
                        System.out.println("no3");
//                        li.add("NO");
                    }
                }
            }
            
        }
        
        for (boolean ss: liss) {
            li.add(ss == true ? "YES" : "NO");
        }
        System.out.println("--------------");
        for (String i: li) {
            System.out.println(i);
        }
        return li;
    }

}

public class WeightedUniformStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Result.weightedUniformStrings("abccddde", Arrays.asList(1, 3, 12, 5, 9, 10));
        Result.weightedUniformStrings("aaabbbbcccddd", Arrays.asList(9, 7 ,8, 12, 5));
    }
    
}
