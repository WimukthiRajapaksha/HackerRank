/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insert.a.node.at.the.tail.of.a.linked.list;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author wimukthirajapaksha
 */
public class InsertANodeAtTheTailOfALinkedList {

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

        public SinglyLinkedList() {
            this.head = null;
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
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) throws IOException {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head == null) {
            head = node;
        } else {
            if (head.next == null) {
                head.next = node;
            } else {
                insertNodeAtTail(head.next, data);
            }
            
        }        
        return head;
    }
    
    public static void main(String[] args) {
    }
    
}
