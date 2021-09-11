/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print.the.elements.of.a.linked.list;

/**
 *
 * @author wimukthirajapaksha
 */
public class PrintTheElementsOfALinkedList {
    
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

    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    public static void main(String[] args) {
        SinglyLinkedList sing = new SinglyLinkedList();
        sing.insertNode(16);
        sing.insertNode(13);
        sing.insertNode(3);
        sing.insertNode(1);
        printLinkedList(sing.head);
    }
    
}
