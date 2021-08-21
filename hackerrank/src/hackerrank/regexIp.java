/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    String pattern = "^(((([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])[.]){3})((([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])){1}))$";
}
