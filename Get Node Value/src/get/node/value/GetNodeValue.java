/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get.node.value;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author wimukthirajapaksha
 */
public class GetNodeValue {

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
    
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        int index = 0;
        SinglyLinkedListNode temp = llist;
        SinglyLinkedListNode ret = llist;
        while(temp != null) {
            temp = temp.next;
            if (index <= positionFromTail) {
                index++;
            } else {
                ret = ret.next;
            }
        }
        return ret.data;
    }
    
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while(i<10) {
            if (i<j++) {
                System.out.println(j+"-");
            } else {
                System.out.println(j);
            }
            i++;
        }
    }
    
}
