/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest.rectangle;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */
public class LargestRectangle {

    /**
     * @param args the command line arguments
     */
    
    
    public static long largestRectangle(List<Integer> h) {
        Stack<Integer> stack = new Stack<>();
        long max = Long.MIN_VALUE;
        for (int i=0; i<h.size();) {
            if (stack.isEmpty() || h.get(i)>=h.get(stack.peek())) {
                stack.add(i++);
                // System.out.println(stack+" sss");
            } else if (h.get(i)<h.get(stack.peek())) {
                // System.out.println(stack+" 44");
                long area = 0;
                int temp = stack.pop();
                if (stack.isEmpty()) {
                    area = h.get(temp)*i;
                } else {
                    area = h.get(temp)*(i-temp-1);
                }
                max = Math.max(max, area);
            } else {
                i++;
            }
        }
        int i=h.size();
        // System.out.println(stack+" stack "+ max);
        while(!stack.isEmpty()) {
            long area = 0;
            int temp = stack.pop();
            if (stack.isEmpty()) {
                area = h.get(temp)*i;
            } else {
                area = h.get(temp)*(i-temp-1);
            }
            max = Math.max(max, area);
            // System.out.println(max+"...");
        }
         System.out.println(max+"...");
        return max;
    }
    
//    public static int[] leftStack(List<Integer> h) {
//        Stack<Integer> stack = new Stack<>();
//        int[] limit = new int[h.size()];
//        for (int i=0; i<h.size(); i++) {
//            if (!stack.isEmpty() && h.get(stack.peek())>=h.get(i)) {
//                while(!stack.isEmpty() && h.get(stack.peek())>=h.get(i)) {
//                    stack.pop();
//                }
//            }
//            limit[i] = stack.isEmpty() ? 0 : stack.peek()+1;
//            stack.add(i);
//        }
//        for (int j: limit) {
//            System.out.print(j+" ");
//        }
//        return limit;
//    }
//    
//    public static int[] rightStack(List<Integer> h) {
//        Stack<Integer> stack = new Stack<>();
//        int[] limit = new int[h.size()];
//        for (int i=h.size()-1; i>=0; i--) {
//            if (stack.isEmpty()) {
//            } else if (h.get(i+1)>=h.get(i)) {
//                while(!stack.isEmpty() && h.get(stack.peek())>=h.get(i)) {
//                    stack.pop();
//                }
//            } else {
//                
//            }
//            limit[i] = stack.isEmpty() ? h.size()-1 : stack.peek()-1;
//            stack.add(i);
//        }
//        for (int j: limit) {
//            System.out.print(j+" ");
//        }
//        return limit;
//    }
//    
//    public static long largestRectangle(List<Integer> h) {
//        int[] left = LargestRectangle.leftStack(h);
//        System.out.println("---------");
//        int[] right = LargestRectangle.rightStack(h);
//        long max = Integer.MIN_VALUE;
//        System.out.println();
//        for (int i=0; i<h.size(); i++) {
//            long temp = h.get(i)*(-left[i]+right[i]+1);
//            System.out.println(temp);
//            if (temp>max) {
//                max = temp;
//            }
//        }
//        System.out.println(max);
//        return max;
//    }
    
    
//    ALTERNATE - NOT OPTIMAL
//    public static int sizeBackward(List<Integer> h, int value, int place) {
//        if (place<0 || value>h.get(place)) {
//            return 0;
//        }
//        return LargestRectangle.sizeBackward(h, value, --place)+1;
//    }
//    
//    public static int size(List<Integer> h, int value, int place) {
//        if (place>=h.size() || value>h.get(place)) {
//            return 0;
//        }
//        return LargestRectangle.size(h, value, place+1)+1;
//    }
//    
//    public static long largestRectangle(List<Integer> h) {
//        long min = 0;
//        for (int i=0; i<h.size(); i++) {
//            int width = LargestRectangle.size(h, h.get(i), i)+LargestRectangle.sizeBackward(h, h.get(i), i)-1;
//            System.out.println(width+" "+h.get(i));
//            if (min<width*h.get(i)) {
//                min = width*h.get(i);
//            }
//        }
//        return min;
//    }
    
    public static void main(String[] args) {
        System.out.println(LargestRectangle.largestRectangle(Arrays.asList(1,2,3,4,5,6)));
//        LargestRectangle.largestRectangle(Arrays.asList(2,1,2,3,1));
//        LargestRectangle.largestRectangle(Arrays.asList(1,2,3,3,3));
//        LargestRectangle.largestRectangle(Arrays.asList(11, 11, 10, 10, 10));
//        LargestRectangle.largestRectangle(Arrays.asList(1, 3, 5, 9, 11));
    }
}
