/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.love.letter.mystery;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'theLoveLetterMystery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int theLoveLetterMystery(String s) {
        int difference = 0;
        for (int i=0; i<s.length()/2; i++) {
            System.out.println(s.charAt(i) +" " +s.charAt(s.length()-i-1));
            difference += Math.abs((int)s.charAt(i)-(int)s.charAt(s.length()-1-i));
        }
        System.out.println(difference);
        return difference;
    }

}

public class TheLoveLetterMystery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.theLoveLetterMystery("abc"); 
        Result.theLoveLetterMystery("abcba");
        Result.theLoveLetterMystery("abcd");
        Result.theLoveLetterMystery("cba");
    }
    
}
