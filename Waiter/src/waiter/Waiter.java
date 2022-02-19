/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waiter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */
public class Waiter {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> waiter(List<Integer> number, int q) {
        List<Integer> returnList = new ArrayList<>();
        Queue<Integer> primes = new LinkedList<>();
        Stack<Integer> stackA = new Stack<>();
        
        for (int i: number) {
            stackA.push(i);
        }
        
        int i=2;
        while(primes.size()<q) {
            boolean isPrime = true;
            for (int j=2; j<(i/2)+1; j++) {
                if (i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
            i++;
        }
        System.out.println(primes);
        for (int j: primes) {
            Stack<Integer> stackB = new Stack<>();
            Stack<Integer> stackC = new Stack<>();
            stackC.removeAllElements();
            
            while (!stackA.isEmpty()) {
                int pop = stackA.pop();
                if (pop%j==0) {
                    stackB.add(pop);
                } else {
                    stackC.add(pop);
                }
            }
            stackA = stackC;
            System.out.println(stackB);
            while(!stackB.isEmpty()) {
                returnList.add(stackB.pop());
            }
        }
        System.out.println("----"+stackA);
        while (!stackA.isEmpty()) {
            returnList.add(stackA.pop());
        }
        System.out.println(returnList);
        return returnList;
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 3, 4, 4, 9));
        Waiter.waiter(list1, 2);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 7, 6, 5));
        Waiter.waiter(list2, 1);
        List<Integer> list3 = new ArrayList<>(Arrays.asList(2,3,4,5,6,7));
        Waiter.waiter(list3, 3);
    }
    
}
