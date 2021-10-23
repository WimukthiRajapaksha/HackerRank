/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funny.string;

/**
 *
 * @author wimukthirajapaksha
 */
class Result {

    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        int[] lis = new int[s.length()-1];
        int prev = (int)s.charAt(0);
        boolean found = true;
        for (int i=1;i<s.length();i++) {
            lis[i-1] = Math.abs(prev-(int)s.charAt(i));
            prev = (int)s.charAt(i);
            System.out.print(lis[i-1] + " ");
            if (i>s.length()/2) {
                if (lis[s.length()-1-i] != lis[i-1]) {
                    found = false;
                }
            }
            
        }
        System.out.println(found);
        return found ? "Funny" : "Not Funny";
        
//        int[] lis = new int[s.length()];
//        for (int i=0;i<s.length();i++) {
//            lis[i] = (int) s.charAt(i);
////            System.out.println(lis[i]);
//        }
//        boolean found = true;
////        System.out.println();
//        for (int j=0;j<s.length()/2;j++) {
//            if (Math.abs(lis[j]-lis[j+1]) != Math.abs(lis[s.length()-1-j] - lis[s.length()-1-j-1])) {
//                found = false;
//                break;
//            }
//        }
////        System.out.println(found);
//        return found ? "Funny" : "Not Funny";
    }

}
public class FunnyString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Result.funnyString("lmnop");
        Result.funnyString("acxz");
        Result.funnyString("bcxz");
    }
    
}
