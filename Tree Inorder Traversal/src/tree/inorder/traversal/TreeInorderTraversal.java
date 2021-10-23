/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.inorder.traversal;

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

public class TreeInorderTraversal {

    /**
     * @param args the command line arguments
     */
    
    public static void inOrder(Node root) {
//        WITHOUT STACK OR RECURSION
        if (root == null) {
            return;
        }
        Node current, temp;
        current = root;
        while(current != null) {
            if (current.left == null) {
                System.out.print(current.data+" .");
                current = current.right;
            } else {
                temp = current.left;
                while(temp.right != null && temp.right != current) {
                    temp = temp.right;
                }
                if (temp.right == null) {
                    temp.right = current;
                    current = current.left;
                } else {
                    temp.right = null;
                    System.out.print(current.data+" + ");
                    current = current.right;
                }
            }
        }
        
        
//        USING STACK
//        Stack<Node> stack = new Stack<>();
//        Node current = root;
//        while(!stack.isEmpty() || current != null) {
//            if (current == null) {
//                Node temp = stack.pop();
//                System.out.print(temp.data+" ");
//                current = temp.right;
//            } else {
//                stack.push(current);
//                current = current.left;
//            }
//        }
        
        
        
//        RECURSIVE
//        if (root.left != null) {
//            inOrder(root.left);
//        }
//        System.out.print(root.data);
//        if (root.right != null) {
//            inOrder(root.right);
//        }
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
        
        TreeInorderTraversal.inOrder(n1);
    }
    
}
