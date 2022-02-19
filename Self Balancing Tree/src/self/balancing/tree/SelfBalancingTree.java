/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self.balancing.tree;

/**
 *
 * @author wimukthirajapaksha
 */
public class SelfBalancingTree {

    /**
     * @param args the command line arguments
     */
    
    
    static class Node {
        int val;
        int ht;
        Node left;
        Node right;
    }
    
    static void updateHeight(Node node) {
        if (node == null) {
            return;
        }
        node.ht = Math.max(SelfBalancingTree.height(node.left), SelfBalancingTree.height(node.right))+1;
    }
    
    static int height(Node node) {
        return node == null ? -1 : node.ht;
    }
    
    static int balance(Node node) {
        if (node == null) {
            return 0;
        }
        return SelfBalancingTree.height(node.left) - SelfBalancingTree.height(node.right);
    }
    
    static Node leftRotate(Node node) {
        Node nodeRight = node.right;
        Node nodeRightLeft = nodeRight.left;
        
        node.right = nodeRightLeft;
        nodeRight.left = node;
        
        SelfBalancingTree.updateHeight(node);
        SelfBalancingTree.updateHeight(nodeRight);
        return nodeRight;
    }
    
    static Node rightRotate(Node node) {
        Node nodeLeft = node.left;
        Node nodeLeftRight = nodeLeft.right;
        
        nodeLeft.right = node;
        node.left = nodeLeftRight;
        
        SelfBalancingTree.updateHeight(node);
        SelfBalancingTree.updateHeight(nodeLeft);
        
        return nodeLeft;
    }
    
    static Node insert(Node node, int value) {
        if (node == null) {
            Node n = new Node();
            n.val = value;
            // n.ht = 0;
            return n;
        }
        if (node.val<value) {
            node.right = SelfBalancingTree.insert(node.right, value);
        } else if (node.val>value) {
            node.left = SelfBalancingTree.insert(node.left, value);
        } else {
            return node;
        }
        
        SelfBalancingTree.updateHeight(node);
        
        int balance = SelfBalancingTree.balance(node);
        if (balance>1 && value<node.left.val) { // left left
            return SelfBalancingTree.rightRotate(node);
        } else if (balance>1 && value>node.left.val) { // left right
            node.left = SelfBalancingTree.leftRotate(node.left);
            return SelfBalancingTree.rightRotate(node);
        } else if (balance<-1 && value>node.right.val) { // right right
            return SelfBalancingTree.leftRotate(node);
        } else if (balance<-1 && value<node.right.val) { // right left
            node.right = SelfBalancingTree.rightRotate(node.right);
            return SelfBalancingTree.leftRotate(node);
        } 
        return node;
    }
    
    static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        SelfBalancingTree.preOrder(node.left);
        SelfBalancingTree.preOrder(node.right);
    }
    
    public static void main(String[] args) {
        Node root = new Node();
        root.val = 3;
        SelfBalancingTree.insert(root, 2);
        SelfBalancingTree.insert(root, 4);
        SelfBalancingTree.insert(root, 5);
        SelfBalancingTree.insert(root, 6);
        
        SelfBalancingTree.preOrder(root);
    }
    
}
