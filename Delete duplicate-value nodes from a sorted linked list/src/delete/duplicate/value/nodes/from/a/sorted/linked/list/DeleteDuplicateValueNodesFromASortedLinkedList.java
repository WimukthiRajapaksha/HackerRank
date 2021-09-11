/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delete.duplicate.value.nodes.from.a.sorted.linked.list;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author wimukthirajapaksha
 */
public class DeleteDuplicateValueNodesFromASortedLinkedList {

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
    
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        if (llist.next == null) {
            return llist;
        }
        SinglyLinkedListNode temp = removeDuplicates(llist.next);
        if (llist.data == temp.data) {
            llist = temp;
        } else {
            llist.next = temp;
        }
        
        return llist;
        
//        SinglyLinkedListNode temp = llist;
//        while (temp.next != null) {
//            if (temp.data == temp.next.data) {
//                temp.next = temp.next.next;
//            } else {
//                temp = temp.next;
//            }
//        }
//        return llist;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
