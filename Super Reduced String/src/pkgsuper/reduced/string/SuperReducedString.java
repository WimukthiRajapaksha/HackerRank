/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgsuper.reduced.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Result {
    public static String superReducedString(String s) {
//        int i=0;
//        List<String> list = new LinkedList<String>(Arrays.asList(s.split("")));
//        System.out.println(list.size());
//        while(i<list.size()-1) {
//            System.out.println(list.get(i));
//            if (list.get(i).equals(list.get(i+1))) {
//                System.out.println("match");
//                list.remove(i);
//                list.remove(i);
//                if (i>0) {
//                    i--;
//                }
//                
//            } else {
//                i++;
//            }
//        }
//        String returnString = "";
//        if (list.size() == 0) {
//            return "Empty String";
//        }
//        for (String ss: list) {
//            returnString += ss;
//        }
//        System.out.println(returnString);
//        return returnString;
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while(i<sb.length()-1) {
            if (sb.charAt(i) == sb.charAt(i+1)) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                if (i>0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        System.out.println(sb.toString());
        return (sb.length() > 0) ? sb.toString() : "Empty String" ;
    }
}


public class SuperReducedString {
   public static void main(String[] args) {
       Result.superReducedString("aaabccddd");
        Result.superReducedString("abbaccdd");
    }   
}
