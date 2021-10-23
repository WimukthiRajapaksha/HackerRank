/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inserting.a.node.into.a.sorted.doubly.linked.list;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author wimukthirajapaksha
 */
public class InsertingANodeIntoASortedDoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
    
    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
    // Write your code here
        DoublyLinkedListNode nn = new DoublyLinkedListNode(data);
        if (llist == null) {
            return nn;
        } else if (llist.data > nn.data) {
            nn.next = llist;
            llist.prev = nn;
            return nn;
        } else {
            DoublyLinkedListNode dll = sortedInsert(llist.next, data);
            llist.next = dll;
            dll.prev = llist;
        }
        return llist;
    
    
//        DoublyLinkedListNode nn = new DoublyLinkedListNode(data);
//        DoublyLinkedListNode hea = llist;
//        if (llist == null) {
//            return nn;
//        } else if (llist.data > nn.data) {
//            hea = nn;
//            nn.next = llist;
//            llist.prev = nn;
//            return hea;
//        }
//        while (llist.next != null && llist.data < nn.data) {
//            llist = llist.next;
//        }
//        if (llist.data >= nn.data) {
//            llist.prev.next = nn;
//            llist.prev = nn;
//            nn.prev = llist.prev;
//            nn.next = llist;
//        } else {
//            llist.next = nn;
//            nn.prev = llist;
//        }
//        return hea;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
