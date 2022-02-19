/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equal.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */
public class EqualStacks {

    /**
     * @param args the command line arguments
     */
    
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int max = 0;
        Stack<Integer> fir = new Stack<>();
        Stack<Integer> sec = new Stack<>();
        Stack<Integer> thir = new Stack<>();
        
        int temp = 0;
        for (int i=h1.size()-1; i>=0; i--) {
            temp+=h1.get(i);
            fir.add(temp);
        }
        System.out.println(fir);
        
        temp = 0;
        for (int i=h2.size()-1; i>=0; i--) {
            temp+=h2.get(i);
            sec.add(temp);
        }

        System.out.println(sec);
        
        temp = 0;
        for (int i=h3.size()-1; i>=0; i--) {
            temp+=h3.get(i);
            thir.add(temp);
        }
        System.out.println(thir);
        
        
        while(!fir.isEmpty() && !sec.isEmpty() && !thir.isEmpty()) {
            int first = fir.peek();
            int second = sec.peek();
            int third = thir.peek();
            int min = Math.min(first, Math.min(second, third));
            if (min == first && min == second && min == third) {
                max = min;
                break;
            }
            if (min < first) {
                fir.pop();
            }
            if (min<second) {
                sec.pop();
            }
            if (min<third) {
                thir.pop();
            }
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        List<Integer> h1 = new ArrayList<>(Arrays.asList(3, 2, 1, 1, 1));
        List<Integer> h2 = new ArrayList<>(Arrays.asList(4, 3, 2));
        List<Integer> h3 = new ArrayList<>(Arrays.asList(1, 1, 4, 1));
        
        EqualStacks.equalStacks(h1, h2, h3);
        
        
    }
    
}
