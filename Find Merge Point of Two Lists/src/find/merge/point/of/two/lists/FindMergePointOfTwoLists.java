/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.merge.point.of.two.lists;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */
public class FindMergePointOfTwoLists {

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

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//        3rd solution
//        while(head1.next != null) {
//            SinglyLinkedListNode ne = head1.next;
//            head1.next = null;
//            head1 = ne;
//        }
//        while(head2.next != null) {
//            head2 = head2.next;
//        }
//        return head2.data;
        
        SinglyLinkedListNode n1 = head1;
        SinglyLinkedListNode n2 = head2;
        
        while(n1!=n2) {
            if (n1.next == null) {
                n1 = head2;
            } else {
                n1 = n1.next;
            }
            if (n2.next == null) {
                n2 = head1;
            } else {
                n2 = n2.next;
            }
        }
        return n1.data;
        
//        2nd solution
//        Set<SinglyLinkedListNode> node = new HashSet<>();
//        while(head1 != null) {
//            node.add(head1);
//            head1 = head1.next;
//        }
//        while(true) {
//            if (node.contains(head2)) {
//                return head2.data;
//            }
//            head2 = head2.next;
//        }
    }
    
    
    public static void main(String[] args) {
    }
}
