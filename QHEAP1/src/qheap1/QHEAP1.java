/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qheap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author wimukthirajapaksha
 */
public class QHEAP1 {

    /**
     * @param args the command line arguments
     */
    
    private static int[] heap;
    private static int size;
    private static int index;
    
    public static int parent(int i) {
        return (i-1)/2;
    }
    
    public static int leftChild(int i) {
        return 2*i+1;
    }
    
    public static int rightChild(int i) {
        return 2*i+2;
    }
    
    public static void swap(int current, int parent) {
        int temp = heap[current];
        heap[current] = heap[parent];
        heap[parent] = temp;
    }
    
    public static void insert(int element) {
        if (index>=size) {
            return;
        }
        heap[index]=element;
        int current = index;
        while(heap[current]<heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        for (int i: heap) {
            System.out.print(i+" ");
        }
        System.out.println();
        index++;
    }
    
    public static int remove() {
        int ret = heap[0];
        heap[0] = heap[--index];
        return ret;
    }
    
    public static void removeValue(int value, int i) {
        if (i>=size) {
            return;
        }
        if (heap[i]==value) {
            if (heap[rightChild(i)]<heap[leftChild(i)] && heap[rightChild(i)]!=0) {
                heap[i]=heap[rightChild(i)];
                minHeapify(rightChild(i));
            } else if (heap[leftChild(i)] != 0) {
                heap[i]=heap[leftChild(i)];
                minHeapify(leftChild(i));
            }
        } else {
            removeValue(value, leftChild(i));
            removeValue(value, rightChild(i));
        }
    }
    
    public static boolean isLeaf(int i) {
        if (rightChild(i)>=i || leftChild(i)>=i) {
            return true;
        }
        return false;
    }
    
    public static void minHeapify(int i) {
        if (!isLeaf(i)) {
            if (heap[i]>heap[leftChild(i)] || heap[i]>heap[rightChild(i)]) {
                if (heap[leftChild(i)]<heap[rightChild(i)]) {
                    swap(i, leftChild(i));
                    minHeapify(leftChild(i));
                } else {
                    swap(i, rightChild(i));
                    minHeapify(rightChild(i));
                }
            }
        }
    }
    
    public static void minHeap() {
        for (int i=(index-1)/2; i>=1; i--) {
            minHeapify(i);
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        heap = new int[q];
        size = q;
        index = 0;
        
//        List<int[]> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<q; i++) {
            int key = s.nextInt();
            switch (key) {
                case 3:
                    minHeap();
                    sb.append(heap[0]);
//                    System.out.println(heap[0]);
                    break;
                case 1:
                    int val = s.nextInt();
                    insert(val);
                    break;
                default:
                    removeValue(s.nextInt(), 0);
                    break;
            }
        }
        System.out.println(heap);
        for (int i: heap) {
            System.out.print(i+" ");
        }
        System.out.println("\n"+sb);
    }    
}


//6
//1 4
//1 9
//3
//2 4
//3


//5
//1 4
//1 9
//3
//2 4
//3