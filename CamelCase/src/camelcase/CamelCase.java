/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camelcase;

import java.util.regex.Pattern;

class Result {
    public static int camelcase(String s) {
//        int count = 0;
//        for (int i=0; i<s.length(); i++) {
//            if (s.charAt(i) >= 'A' && s.charAt(i)<='Z') {
//                count +=1;
//            }
//        }
//        return count+1;
        return s.split("[A-Z]").length;
//        System.out.println((s.length() - s.replaceAll("[A-Z]", "").length())+1);
//        return (s.length() - s.replaceAll("[A-Z]", "").length())+1;
    }

}

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(Result.camelcase("saveChangesInTheEditor"));
    }
    
}
