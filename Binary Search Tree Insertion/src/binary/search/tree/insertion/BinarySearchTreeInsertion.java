/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search.tree.insertion;

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

public class BinarySearchTreeInsertion {

    /**
     * @param args the command line arguments
     */
    
    public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }
    
    public static Node insert(Node root,int data) {
        if (root==null) {
            return new Node(data);
        }
        Node temp = root;
        Node curr = null;
        while(temp!=null) {
            curr = temp;
            if (data>temp.data) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        if(curr.data<data) {
            curr.right = new Node(data);
        } else {
            curr.left = new Node(data);
        }
        return root;
        
        
//        RECURSIVE
//        if (root==null) {
//            return new Node(data);
//        } else {
//            if (root.data > data) {
//                root.left = insert(root.left, data);
//            } else {
//                root.right = insert(root.right, data);
//            }
//            return root;
//        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
