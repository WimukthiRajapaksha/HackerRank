/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author wimukthirajapaksha
 */
public class Encryption {

    static String encryption(String s) {
        String returnString = "";
        s=s.replace(" ", "");
        int root = (int)Math.ceil(Math.sqrt(s.length()));
        for (int i=0;i<root;i++) {
            for (int j=0;j<Math.ceil(s.length()/(float)root)+1;j++) {
                if ((root*j)+i<s.length()) {
                    returnString+=s.charAt((root*j)+i);
                }
            }
            returnString += " ";
        }
        System.out.println(returnString);
        return returnString;
        
        
        
        
//        System.out.println(s);
//        String newS = s.replace(" ", "");
//        int root = (int)Math.ceil(Math.sqrt(newS.length()));
//        ArrayList<String> list = new ArrayList<>();
//        int i=0;
//        while(i<newS.length()) {
//            
//            if (i+root<newS.length()) {
//                System.out.println(s.substring(i, i+root));
//                list.add(s.substring(i, i+root));
//            } else {
//                System.out.println(s.substring(i, newS.length()));
//                list.add(s.substring(i, newS.length()));
//            }
//            i=i+root;
//        }
//        String returnS = "";
//        for (i=0;i<root;i++) {
//            for (String item: list) {
//                if (i<item.length()) {
//                    returnS += item.charAt(i);
//                }
//            }
//            returnS +=" ";
//        }
//        System.out.println(returnS);
//        return returnS;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
