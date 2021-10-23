/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package making.anagrams;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'makingAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int makingAnagrams(String s1, String s2) {
        String minS = (s1.length() < s2.length()) ? s1 : s2;
        String maxS = (s1.length() < s2.length()) ? s2 : s1;
        int count = 0;
        for (int i=0; i<minS.length(); i++) {
            System.out.println(minS.charAt(i));
            System.out.println(maxS.contains(String.valueOf(minS.charAt(i))));
            if (maxS.contains(String.valueOf(minS.charAt(i)))) {
                maxS = (maxS.replaceFirst(String.valueOf(minS.charAt(i)), ""));
                count += 2;
            }
        }
        System.out.println(s1.length()+s2.length()-count);
        return s1.length()+s2.length()-count;
    }

}

public class MakingAnagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.makingAnagrams("cde", "abc");
        Result.makingAnagrams("abc", "amnop");
    }
    
}
