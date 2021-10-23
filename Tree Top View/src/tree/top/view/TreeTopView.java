/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.top.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

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

public class TreeTopView {

    /**
     * @param args the command line arguments
     */
    
    public static void topView(Node root) {
        class InnerNode {
            int id;
            Node node;
            
            InnerNode(int id, Node node) {
                this.id = id;
                this.node = node;
            }
        }
        if (root == null) {
            return;
        }
        Queue<InnerNode> queue = new LinkedList<>();
        Map<Integer, Node> map = new TreeMap<>();
        queue.add(new InnerNode(0, root));
        while(!queue.isEmpty()) {
            InnerNode poll = queue.poll();
            if (!map.containsKey(poll.id)) {
                map.put(poll.id, poll.node);
            }
            if (poll.node.left != null) {
                queue.add(new InnerNode(poll.id-1, poll.node.left));
            }
            if (poll.node.right != null) {
                queue.add(new InnerNode(poll.id+1, poll.node.right));
            }
        }
        for (Node node: map.values()) {
            System.out.print(node.data+" ");
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
        // TODO code application logic here
    }
    
}
