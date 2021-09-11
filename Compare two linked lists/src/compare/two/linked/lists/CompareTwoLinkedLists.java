/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compare.two.linked.lists;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author wimukthirajapaksha
 */
public class CompareTwoLinkedLists {

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

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if ((head1.next == null) && (head2.next == null) && (head1.data == head2.data)) {
            System.out.println("true");
            return true;
        } else if (head1.next == null || head2.next == null) {
            System.out.println("false");
            return false;
        } else if (head1.data != head2.data) {
            return false;
        }
        return compareLists(head1.next, head2.next);
        
        
//        while(head1 != null && head2 != null) {
//            if (head1.data != head2.data) {
//                System.out.println("false1");
//                return false;
//            } else {
//                head1 = head1.next;
//                head2 = head2.next;
//            }
//        } 
//        if (head1 == null && head2 == null) {
//            System.out.println("true");
//            return true;
//        }
//        System.out.println("false2");
//        return false;
    }
    
    public static void main(String[] args) {
        SinglyLinkedListNode s11 = new SinglyLinkedListNode(2);
        s11.next = new SinglyLinkedListNode(1);
        
        SinglyLinkedListNode s21 = new SinglyLinkedListNode(2);
        s21.next = new SinglyLinkedListNode(0);
        
        CompareTwoLinkedLists.compareLists(s11, s21);
    }
    
}
