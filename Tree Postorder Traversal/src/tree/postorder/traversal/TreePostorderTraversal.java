/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.postorder.traversal;

import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class TreePostorderTraversal {

    /**
     * @param args the command line arguments
     */
    
    public static void postOrder(Node root) {
//        USING TWO STACKS
        Stack<Node> sta1 = new Stack<>();
        Stack<Node> sta2 = new Stack<>();
        sta1.add(root);
        while(!sta1.isEmpty()) {
            Node temp = sta1.pop();
            sta2.push(temp);
            if (temp.left!=null) {
                sta1.push(temp.left);
            }
            if (temp.right!=null) {
                sta1.push(temp.right);
            }
        }
        while(!sta2.isEmpty()) {
            System.out.print(sta2.pop().data+" ");
        }
        
        
//        ITERATIVE USING ONE STACK
//        Stack<Node> stack = new Stack<>();
//        if (root == null) {
//            return;
//        }
//        Node current = root;
//        while (!stack.isEmpty() || current != null) {
//            if (current != null) {
//                stack.add(current);
//                current = current.left;
//            } else {
//                Node temp = stack.peek().right;
//                if (temp==null) {
//                    temp = stack.pop();
//                    System.out.print(temp.data+" ");
//                    while(!stack.isEmpty() && temp == stack.peek().right) {
//                        temp = stack.pop();
//                        System.out.print(temp.data +" ");
//                    }
//                } else {
//                    current = temp;
//                }
//            }
//        }

        
        
        
//        RECURSIVE
//        if (root==null) {
//            return;
//        }
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data+" ");
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
        
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        
        TreePostorderTraversal.postOrder(n1);
    }
}
