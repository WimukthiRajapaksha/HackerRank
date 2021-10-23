/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.height.of.a.binary.tree;

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

public class TreeHeightOfABinaryTree {

    /**
     * @param args the command line arguments
     */
    
    public static int height(Node root) {
//        ITERATIVE
        if (root == null) {
            return 0;
        }
        int height = -1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            height++;
            int nodeCount = queue.size();
            while(nodeCount > 0) {
                Node node = queue.peek();
                queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                nodeCount--;
            }
        }
        return height;
        
        
        
        
//        RECURSIVE
//        if (root == null) {
//            return -1;
//        }
//        return Math.max(height(root.left) + 1, height(root.right)+1);
        
        
//        if (root == null) {
//            return 0;
//        }
//        int hei = 0;
//        if (root.left != null) {
//            hei = height(root.left) + 1;
//        }
//        if (root.right != null) {
//            hei = Math.max(hei, height(root.right)+1);
//        }
//        return hei;
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
        // TODO code application logic here
    }
    
}
