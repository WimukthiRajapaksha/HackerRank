/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap.nodes.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author wimukthirajapaksha
 */
public class SwapNodesAlgo {

    /**
     * @param args the command line arguments
     */
    
    static class Node {
        int node;
        Node left;
        Node right;

        public Node(int node) {
            this.node = node;
        }
    }
    
    public static Node createTree(List<List<Integer>> indexes) {
        Node root=new Node(1);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        for (List<Integer> i: indexes) {
            Node temp = queue.remove();
            if (i.get(0)!=-1) {
                Node left = new Node(i.get(0));
                temp.left = left;
                queue.add(left);
            }
            if (i.get(1)!=-1) {
                Node right = new Node(i.get(1));
                temp.right = right;
                queue.add(right);
            }
        }
        return root;
    }
    
    public static void printNodes(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        SwapNodesAlgo.printNodes(root.left, list);
        System.out.print(root.node+" ");
        list.add(root.node);
        SwapNodesAlgo.printNodes(root.right, list);
    }
    
    public static Node swap(Node root, int val, int currLevel) {
        if (root == null) {
            return null;
        }
        if (currLevel%val==0) {
//            System.out.println(root.node);
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        SwapNodesAlgo.swap(root.left, val, currLevel+1);
        SwapNodesAlgo.swap(root.right, val, currLevel+1);
        return root;
    }
    
    public static List<List<Integer>> swapNodes(List<List<Integer>> indexes, List<Integer> queries) {
        List<List<Integer>> ret = new ArrayList<>();
        Node root = SwapNodesAlgo.createTree(indexes);
        System.out.println();
        for (int i: queries) {
            root = SwapNodesAlgo.swap(root, i, 1);
            List<Integer> list = new ArrayList<>();
            SwapNodesAlgo.printNodes(root, list);
            ret.add(list);
            System.out.println();
        }        
        return ret;
    }
    
    
    
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2,3));
        list.add(Arrays.asList(4,-1));
        list.add(Arrays.asList(5,-1));
        list.add(Arrays.asList(6,-1));
        list.add(Arrays.asList(7,8));
        list.add(Arrays.asList(-1,9));
        list.add(Arrays.asList(-1,-1));
        list.add(Arrays.asList(10,11));
        list.add(Arrays.asList(-1,-1));
        list.add(Arrays.asList(-1,-1));
        list.add(Arrays.asList(-1,-1));
        SwapNodesAlgo.swapNodes(list, Arrays.asList(2,4));
//        Node n1 = new Node(1);
//        n1.left = new Node(2);
//        n1.right = new Node(3);
//        
//        Node n2 = new Node(4);
//        n2.left = new Node(5);
//        n2.right = new Node(6);
//        n1.left.left = n2;
//        
//        Node n3 = new Node(7);
//        n3.left = new Node(8);
//        n3.right = new Node(9);
//        n1.left.right = n3;
//        
//        Node n4 = new Node(10);
//        n4.left = new Node(11);
//        n4.right = new Node(12);
//        n1.right.left = n4;
//        
//        Node n5 = new Node(13);
//        n5.left = new Node(14);
//        n5.right = new Node(15);
//        n1.right.right = n5;
//        SwapNodesAlgo.inOrder(n1);
    }
}
