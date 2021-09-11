/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pangrams;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        Set<Character> sett = new HashSet<>();
        for(char i: s.toLowerCase().toCharArray()) {
            if (Character.isLetter(i)) {
                sett.add(i);
            }
        }
        return (sett.size() == 26) ?  "pangram" : "not pangram";
        
        
//        String alpha = "abcdefghijklmnopqrstuvwxyz";
//        for (char i: alpha.toLowerCase().toCharArray()) {
//            if (Character.isLetter(i) && s.toLowerCase().indexOf(i) < 0) {
//                return "not pangram";
//            }
//        }
//        return "pangram";
    }
}

public class Pangrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.pangrams("We promptly judged antique ivory buckles for the prize");
        Result.pangrams("We promptly judged antique ivory buckles for the next prize");
    }
    
}
