/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.construction;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'stringConstruction' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int stringConstruction(String s) {
        char[] charArr = s.toCharArray();
        Set<Character> chara = new HashSet<>();
        for (char c: charArr) {
            chara.add(c);
        }
        System.out.println(chara.size());
        return chara.size();
    }

}

public class StringConstruction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.stringConstruction("abcd");
        Result.stringConstruction("abab");
    }
}
