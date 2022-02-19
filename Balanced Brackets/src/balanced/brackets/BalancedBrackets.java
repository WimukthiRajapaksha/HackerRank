/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanced.brackets;

import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */
public class BalancedBrackets {

    /**
     * @param args the command line arguments
     */
    
    public static String isBalanced(String s) {
        if (s.length()%2!=0) {
            return "NO";
        }
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return "NO";
            } else if (c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return "NO";
                }
            } else if (s.charAt(i) == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return "NO";
                }
            } else if (c == '}'){
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return "NO";
                }
            } else {
                return "NO";
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
        
        
        
//        WITHOUT USING STACK
//        int l=s.length();
//        while(true) {
//            s = s.replaceAll("\\(\\)", "");
//            s = s.replaceAll("\\[\\]", "");
//            s = s.replaceAll("\\{\\}", "");
//            if (l == s.length()) {
//                return "NO";
//            } else if (s.length() == 0) {
//                return "YES";
//            }
//            l = s.length();
//        }
    }
    public static void main(String[] args) {
        System.out.println(BalancedBrackets.isBalanced("{[()]}"));
        System.out.println(BalancedBrackets.isBalanced("{[(])}"));
        System.out.println(BalancedBrackets.isBalanced("{{[[(())]]}}"));
        System.out.println(BalancedBrackets.isBalanced("[[[{{{({[{[()]}]})}}}]]]"));
    }
    
}
