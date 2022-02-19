/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximum.element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */
public class MaximumElement {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackMax = new Stack<>();
        List<Integer> retList = new ArrayList<>();
        int max = 0;
        for (String s: operations) {
            String[] arr = s.split(" ");
            switch (Integer.parseInt(arr[0])) {
                case 1:
                    if (max<=Integer.parseInt(arr[1])) {
                        stackMax.push(Integer.parseInt(arr[1]));
                        max = Integer.parseInt(arr[1]);
                    }
                    stack.push(Integer.parseInt(arr[1]));
                    break;
                case 2:
                    if (stack.peek() == max) {
                        stackMax.pop();
                        max = stackMax.isEmpty() ? 0 : stackMax.peek();
                    }
                    stack.pop();
                    break;
                default:
                    retList.add(stackMax.peek());
                    break;                
            }
        }
        System.out.println(retList);
        return retList;
    }
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1 97", "2", "1 20", "2", "1 26", "1 20", "2", "3", "1 91", "3"));
        MaximumElement.getMax(list);
    }
    
}
