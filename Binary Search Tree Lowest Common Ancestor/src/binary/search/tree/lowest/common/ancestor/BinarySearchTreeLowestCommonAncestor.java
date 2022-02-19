/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search.tree.lowest.common.ancestor;

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

public class BinarySearchTreeLowestCommonAncestor {

    /**
     * @param args the command line arguments
     */
    
    public static Node lca(Node root, int v1, int v2) {
        if (root == null) {
            return null;
        }
        if (root.data == v1 || root.data == v2) {
            return root;
        }
        Node nl = lca(root.left, v1, v2);
        Node nr = lca(root.right, v1, v2);
        if (nl != null && nr != null) {
            return root;
        } else if (nl != null){
            return nl;
        } else {
            return nr;
        }
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
        Node n = new Node(1);
        n.left = new Node(2);
        n.right = new Node(3);
        n.left.left = new Node(4);
        n.left.right = new Node(5);
        n.right.left = new Node(6);
        n.right.right = new Node(7);
        
        n.left.left.left = new Node(8);
        n.left.left.right = new Node(9);
        n.left.left.left = new Node(10);
        n.left.left.right = new Node(11);
        n.right.left.left = new Node(12);
        n.right.left.right = new Node(13);
        n.right.right.left = new Node(14);
        n.right.right.right = new Node(15);
        
        System.out.println(lca(n, 1, 14).data);
    }
    
}
