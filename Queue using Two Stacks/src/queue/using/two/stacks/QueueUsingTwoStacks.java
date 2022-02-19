/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.using.two.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */
public class QueueUsingTwoStacks {

    /**
     * @param args the command line arguments
     */
    
    static class MyQueue<T> {
        Stack<T> stackOne = new Stack<>();
        Stack<T> stackTwo = new Stack<>();
        
        public void enqueue(T i) {
            stackOne.push(i);
        }
        
        private void shiftStacks() {
            if (stackTwo.isEmpty()){
                while (!stackOne.isEmpty()) {
                    stackTwo.push(stackOne.pop());
                }
            }
        }
        
        public T dequeue() {
            this.shiftStacks();
            return this.stackTwo.pop();
        }
        
        public T peek() {
            this.shiftStacks();
            return stackTwo.peek();
        }
    }
    
//    ALTERNATE
//    public static void queue(int[][] list) {
//        System.out.println(list.length);
//        StringBuffer sb = new StringBuffer();
//        Stack<Integer> stackOne = new Stack<>();
//        Stack<Integer> stackTwo = new Stack<>();
//        for (int[] i: list) {
//            if (i[0]==1) {
//                stackOne.add(i[1]);
//            }
//        }
//        while(!stackOne.isEmpty()) {
//            stackTwo.add(stackOne.pop());
//        }
//        for (int[] i: list) {
//            System.out.println(stackTwo);
//            if (i[0]==2) {
//                stackTwo.pop();
//            } else if (i[0]==3) {
//                sb.append(stackTwo.peek());
//            }
//        }
//        System.out.println(sb);
//    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine().trim());
        StringBuffer sb = new StringBuffer();
        QueueUsingTwoStacks.MyQueue<Integer> queue = new QueueUsingTwoStacks.MyQueue<>();
        for (int i=0; i<count; i++) {
            String[] input = bufferedReader.readLine().trim().replaceAll("\\s+$", "").split(" ");
            switch (input[0]) {
                case "3":
                    sb.append(queue.peek()).append("\n");
                    break;
                case "1":
                    queue.enqueue(Integer.parseInt(input[1]));
                    break;
                default:
                    queue.dequeue();
                    break;
            }
        }
        System.out.println(sb);
    }
    
}
