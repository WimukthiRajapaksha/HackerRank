/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insert.a.node.at.a.specific.position.in.a.linked.list;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class InsertANodeAtASpecificPositionInALinkedList {

    /**
     * @param args the command line arguments
     */
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
    
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // 2 solutions - normal solution and recursive solution
//        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
//        SinglyLinkedListNode current = llist;
//
//        if (llist == null) {
//            llist = newNode;
//        } else if (position == 1) {
//            current = newNode;
//            current.next = llist;
//        } else {
//            int cur = 0;
//            while (cur < position-1) {
//                current = current.next;
//                cur++;
//            }
//            newNode.next = current.next;
//            current.next = newNode;
//            
//        }
//        return llist;

        if (position == 0) {
            SinglyLinkedListNode current = new SinglyLinkedListNode(data);
            current.next = llist;
            return current;
        }

        llist.next = insertNodeAtPosition(llist.next, data, position-1);
        return llist;
    }
    
    public static void main(String[] args) {
    }
    
}
