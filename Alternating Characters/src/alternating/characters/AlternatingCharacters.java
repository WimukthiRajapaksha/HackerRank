/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alternating.characters;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
        int count = 0;
        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
        
        
//        int count = 0;
//        boolean isPrevA = (s.charAt(0) == 'A');
//        for (int i=1; i<s.length(); i++) {
//            if (s.charAt(i) == 'A' && isPrevA) {
//                count++;
//            } else if (s.charAt(i) == 'B' && !isPrevA) {
//                count++;
//            } else {
//                isPrevA = s.charAt(i) == 'A';
//            }
//        }
//        System.out.println(count);
//        return count;
    }
}

public class AlternatingCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.alternatingCharacters("AAAA");
        Result.alternatingCharacters("BBBBB");
        Result.alternatingCharacters("ABABABAB");
        Result.alternatingCharacters("BABABA");
        Result.alternatingCharacters("AAABBB");
    }
    
}
