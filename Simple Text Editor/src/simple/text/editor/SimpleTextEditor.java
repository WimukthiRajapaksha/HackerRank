/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.text.editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 *
 * @author wimukthirajapaksha
 */
public class SimpleTextEditor {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
//        List<String> list1 = Arrays.asList("1 abcde","1 fg", "3 6", "2 5", "4", "3 7", "4", "3 4");
//        SimpleTextEditor.printStuffs(list1);
//        
//        System.out.println("---------");
//        
//        List<String> list2 = Arrays.asList("1 abc", "3 3", "2 3", "1 xy", "3 2", "4", "4", "3 1");
//        SimpleTextEditor.printStuffs(list2);




        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        Stack<String> stack = new Stack<>();
        stack.add("");
        for (int a=0; a<n; a++) {
            String[] split = bufferedReader.readLine().split(" ");
            int first = Integer.parseInt(split[0]);            
            if (first==1) {
                String second = split[1];
                stack.add(stack.peek()+second);
            } else if (first==2) {
                int second = Integer.parseInt(split[1]);
                String sub = "";
                for (int j=0; j<stack.peek().length()-second; j++) {
                    sub+=stack.peek().charAt(j);
                }
                stack.add(sub);
            } else if (first==3) {
                int second = Integer.parseInt(split[1]);
                sb.append(stack.peek().charAt(second-1)+"\n");
            } else {
                stack.pop();
            }
            
        }
        System.out.println(sb);
        // Solution.printStuffs(s);
        bufferedReader.close();
        
//        ALTERNATE
//        Scanner in=new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//        int n=in.nextInt();
//        Stack<String> stack = new Stack<>();
//        stack.add("");
//        // String peek = "";
//        for (int a=0; a<n; a++) {
//            int first = in.nextInt();            
//            if (first==1) {
//                // peek += in.nextLine().trim();
//                stack.add(stack.peek()+in.nextLine().trim());
//            } else if (first==2) {
//                stack.add(stack.peek().substring(0, stack.peek().length()-in.nextInt()));
//            } else if (first==3) {
//                sb.append(stack.peek().charAt(in.nextInt()-1)+"\n");
//            } else {
//                // peek = stack.pop();
//                stack.pop();
//                // peek = stack.isEmpty() ? "" : stack.peek();
//            }
//        }
//        System.out.println(sb);
    }
}