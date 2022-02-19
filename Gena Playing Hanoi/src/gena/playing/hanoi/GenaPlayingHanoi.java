/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gena.playing.hanoi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */
public class GenaPlayingHanoi {

    /**
     * @param args the command line arguments
     */
    
    public static int hanoi(List<Integer> posts) {
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        Stack<Integer> third = new Stack<>();
        Stack<Integer> forth = new Stack<>();
//        int[] places = new int[posts.size()];
        for (int i=posts.size()-1; i>=0; i--) {
            switch (posts.get(i)) {
                case 1:
                    first.add(i+1);
//                    places[posts.size()-1-i]=1;
                    break;
                case 2:
                    second.add(i+1);
//                    places[posts.size()-1-i]=2;
                    break;
                case 3:
                    third.add(i+1);
//                    places[posts.size()-1-i]=3;
                    break;
                default:
                    forth.add(i+1);
//                    places[posts.size()-1-i]=4;
                    break;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(forth);
//        for (int i: places) {
//            System.out.print(i+" ");
//        }
        
        while(true) {
            if (posts.get(posts.size()-1)==1) {
                if (second.get(0)>third.get(0) && second.get(0)>forth.get(0)) { // second is the biggest
                    
                } else if ()
            } else {
                
            }
            
            return 0;
        }
        
//        return 0;
    }
    
    public static void arrange(Stack<Integer> first) {
        
    }
    
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(4,2,2,1));
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,1,1,2,3,3,2,1,1));
        GenaPlayingHanoi.hanoi(list);
    }
}
