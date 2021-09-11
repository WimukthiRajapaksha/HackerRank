/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesar.cipher;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        String returnString = "";
        for (int i=0; i<s.length();i++) {
            String st = String.valueOf(s.charAt(i));
            boolean matching = st.matches("[a-zA-Z]");
            boolean lower = Character.isLowerCase(s.charAt(i));
            char lowerChar = lower ? 'a' : 'A';
            if (matching) {
                int target = (s.charAt(i) + k - lowerChar)%26 + lowerChar ;
                returnString += Character.toString((char)target);
            } else {
                returnString += Character.toString((char)s.charAt(i));
            }
            
        }
         System.out.println(returnString);
        return returnString;
        
        
//        String returnString = "";
//        for (int i=0; i<s.length();i++) {
//            if ((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90) {
//                int target = (int)s.charAt(i)+(k%26) > 90 ? (((int)s.charAt(i)+(k%26)) - 26) : (int)s.charAt(i)+(k%26);
//                returnString += Character.toString((char)target);
//            } else if ((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122) {
//                int target = (int)s.charAt(i)+(k%26) > 122 ? (((int)s.charAt(i)+(k%26)) - 26) : (int)s.charAt(i)+(k%26);
//                returnString += Character.toString((char)target);
//            } else {
//                returnString += Character.toString((char)s.charAt(i));
//            }
//            
//        }
//        // System.out.println(returnString);
//        return returnString;
    }

}

public class CaesarCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.caesarCipher("ABYZ-%abyz", 27);
    }
    
}
