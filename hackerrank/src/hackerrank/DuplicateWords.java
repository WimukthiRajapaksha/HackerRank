/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wimukthirajapaksha
 */
public class DuplicateWords {
    public static void main(String[] args) {
        String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, 10);
        
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();            
            Matcher m = p.matcher(input);
            while (m.find()) {
                input = input.replaceAll( "[0-9]", "efwfur");
            }            
            System.out.println(input);
        }
        in.close();
    }
}
