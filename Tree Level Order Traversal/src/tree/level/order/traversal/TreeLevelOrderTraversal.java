/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.level.order.traversal;

import java.util.LinkedList;
import java.util.Queue;

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

public class TreeLevelOrderTraversal {

    /**
     * @param args the command line arguments
     */
    
    public static int height(Node root) {
        if (root==null) {
            return 0;
        }
        return Math.max(height(root.left)+1, height(root.right)+1);
    }
    
    public static void printCurrentLevel(Node root, int level) {
        if (root==null) {
            return;
        }
        if (level == 0) {
            System.out.print(root.data+" ");
        } else {
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }
    
//    RECURSIVE
    public static void levelOrder(Node root) {
        int h = height(root);
        for (int i=0; i<h; i++) {
            printCurrentLevel(root, i);
        }
    }
    
//    USING QUEUE
//    public static void levelOrder(Node root) {        
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while(!queue.isEmpty()) {
//            Node temp = queue.remove();
//            System.out.print(temp.data+" ");
//            if (temp.left!=null) {
//                queue.add(temp.left);
//            }
//            if (temp.right!=null) {
//                queue.add(temp.right);
//            }
//        }
//    }

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
        n1.right = new Node(2);
        n1.right.right = new Node(5);
        n1.right.right.left = new Node(3);
        n1.right.right.left.right = new Node(4);
        n1.right.right.right = new Node(6);
        TreeLevelOrderTraversal.levelOrder(n1);
    }
    
}
