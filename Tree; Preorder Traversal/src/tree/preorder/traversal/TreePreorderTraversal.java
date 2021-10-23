/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.preorder.traversal;

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

public class TreePreorderTraversal {

    /**
     * @param args the command line arguments
     */
    
    public static void preOrder(Node root) {
//        WITHOUT STACK
        if (root == null) {
            return;
        }
        Node curr = root;
        while(curr != null) {
            if (curr.left == null) {
                System.out.print(curr.data + " ");
                curr = curr.right;
            } else {
                Node prev = curr.left;
                while(prev.right != curr && prev.right != null) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = curr;
                    System.out.print(curr.data+" ");
                    curr = curr.left;
                } else {
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }
        
//        USING STACK
//        Stack<Node> stack = new Stack<>();
//        Node node = root;
//        while(node != null || !stack.isEmpty()) {
//            while(node != null) {
//                System.out.print(node.data+" ");
//                if(node.right!=null) {
//                    stack.push(node.right);
//                }
//                node = node.left;
//            }
//            if (!stack.isEmpty()) {
//                node = stack.pop();
//            }
//        }
        
        
        
//        NON RECURSIVE 
//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            Node pop = stack.pop();
//            System.out.print(pop.data+" ");
//            if (pop.right != null) {
//                stack.push(pop.right);
//            }
//            if (pop.left != null) {
//                stack.push(pop.left);
//            }
//        }
        
        
        
        
//        RECURSIVE
//        if (root==null) {
//            return;
//        }
//        System.out.print(root.data+" ");
//        preOrder(root.left);
//        preOrder(root.right);
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
        Node n1 = new Node(3);
        n1.right = new Node(2);
        n1.right.right = new Node(5);
        n1.right.right.left = new Node(3);
        n1.right.right.left.right = new Node(4);
        n1.right.right.right = new Node(6);
        
        TreePreorderTraversal.preOrder(n1);
    }
}
