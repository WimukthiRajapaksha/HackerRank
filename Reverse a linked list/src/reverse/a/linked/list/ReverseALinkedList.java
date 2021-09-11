/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.a.linked.list;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class ReverseALinkedList {

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

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        if (llist.next == null) {
            return llist;
        }
        SinglyLinkedListNode ret = reverse(llist.next);
        llist.next.next = llist;
        llist.next = null;
        
        return ret;
        
        
//        SinglyLinkedListNode prev = null;
//        SinglyLinkedListNode next;
//        SinglyLinkedListNode curr = llist;
//        while(curr != null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;              
//        }
//        System.out.println(prev);
//        return prev;
    }
    
    
    public static void main(String[] args) {
        SinglyLinkedListNode l1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode l2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode l3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode l4 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode l5 = new SinglyLinkedListNode(5);
        
        l4.next = l5;
        l3.next = l4;
        l2.next = l3;
        l1.next = l2;
        
        ReverseALinkedList.reverse(l1);
    }
    
}
