/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautiful.binary.string;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'beautifulBinaryString' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING b as parameter.
     */

    public static int beautifulBinaryString(String b) {
//        System.out.println((b.length()-b.replaceAll("010", "").length())/3);
        return (b.length()-b.replaceAll("010", "").length())/3;
        
//        String match ="010";
//        int temp = 0;
//        int count = 0;
//        for (int i=0; i<b.length(); i++) {
//            
//            if (b.charAt(i)==match.charAt(temp)) {
//                if (temp == 2) {
//                    temp = 0;
//                    count++;
//                    System.out.println("- "+count);
//                } else {
//                    temp++;
//                }
//            } else {
//                if (temp == 1) {
//                    i--;
//                }
//                temp = 0;
//            }
//            System.out.println(b.charAt(i) + " " + temp);
//        }
//        System.out.println(count);
//        return count;
    }
}

public class BeautifulBinaryString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.beautifulBinaryString("01001010010"); // 0100000
//        String s = "ababaaa";
//        System.out.println(s.replaceAll("aba", "").length());
    }
    
}
