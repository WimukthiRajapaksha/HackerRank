/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge.two.sorted.linked.lists;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author wimukthirajapaksha
 */
public class MergeTwoSortedLinkedLists {

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

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null) {
            return null;
        } else if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }
        if (head1.data > head2.data) {
            head2.next = mergeLists(head1, head2.next);
            return head2;
        } else {
            head1.next = mergeLists(head1.next, head2);
            return head1;
        }
    }
    
    public static void main(String[] args) {
        SinglyLinkedListNode s1 = new SinglyLinkedListNode(4);
        s1.next = new SinglyLinkedListNode(5);
        s1.next.next = new SinglyLinkedListNode(6);
        
        SinglyLinkedListNode s2 = new SinglyLinkedListNode(1);
        s2.next = new SinglyLinkedListNode(2);
        s2.next.next = new SinglyLinkedListNode(10);
        
        SinglyLinkedListNode abc = MergeTwoSortedLinkedLists.mergeLists(s1, s2);
        
        SinglyLinkedListNode temp1 = abc;
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
    }
    
}
