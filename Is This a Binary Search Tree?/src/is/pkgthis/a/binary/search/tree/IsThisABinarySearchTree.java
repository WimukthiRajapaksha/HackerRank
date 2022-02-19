/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.pkgthis.a.binary.search.tree;

/**
 *
 * @author wimukthirajapaksha
 */
public class IsThisABinarySearchTree {

    /**
     * @param args the command line arguments
     */
    class Node {
        int data;
        Node left;
        Node right;
    }
    
    boolean check(Node root, int leftMax, int rightMin) {
        System.out.println();
        if (root==null) {
            return true;
        }
        if (root.data<leftMax || root.data>rightMin) {
            return false;
        } else {
            return check(root.left, leftMax, root.data-1) && check(root.right, root.data+1, rightMin);
        }
    }
    
    boolean checkBST(Node root) {
        return check(root, 0, Integer.MAX_VALUE);
        
        
//        ALTERNATIVE
//        if (root==null) {
//            return true;
//        }
//        boolean left = true;
//        if (root.left != null) {
//            Node temp = root.left;
//            while(temp.right != null) {
//                temp = temp.right;
//            }
//            if (root.data <= temp.data) {
//                left = false;
//            }
//        }
//        boolean right = true;
//        if (root.right != null) {
//            Node temp = root.right;
//            while(temp.left != null) {
//                temp = temp.left;
//            }
//            if (root.data >= temp.data) {
//                right = false;
//            }
//        }
//        if(left && right) {
//            return checkBST(root.left) && checkBST(root.right);
//        } else {
//            return false;
//        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
