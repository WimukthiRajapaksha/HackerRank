/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.and.ladders.the.quickest.way.up;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author wimukthirajapaksha
 */
public class SnakesAndLaddersTheQuickestWayUp {

    /**
     * @param args the command line arguments
     */
    
    static class Vertex {
        int data;
        int count;
        boolean autoMove;
        boolean visited;
        LinkedList<Vertex> next = new LinkedList<>();
        
        public Vertex(int data) {
            this.data = data;
            
        }
    }
    
    public static int quickestWayUp(List<List<Integer>> ladders, List<List<Integer>> snakes) {
        Vertex[] list = new Vertex[100];
        for (int i=1; i<=100; i++) {
            list[i-1]=new Vertex(i);
        }
        
        for (int i=0; i<list.length; i++) {
            Vertex temp = list[i];
            for (int j=1; j<=6; j++) {
                if (temp.data-1+j<100) {
                    temp.next.add(list[temp.data-1+j]);
                }
            }
        }
        for (List<Integer> lad: ladders) {
            list[lad.get(0)-1].autoMove = true;
            list[lad.get(0)-1].next.clear();
            list[lad.get(0)-1].next.add(list[lad.get(1)-1]);
        }
        for (List<Integer> sna: snakes) {
            list[sna.get(0)-1].autoMove = true;
            list[sna.get(0)-1].next.clear();
            list[sna.get(0)-1].next.add(list[sna.get(1)-1]);
        }
        Queue<Vertex> queue = new LinkedList<>();
        Vertex temp = list[0];
        temp.visited = true;
        temp.count = 0;
        queue.add(temp);
        while(!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.data>=100) {
                break;
            }
            for (int i=0; i<temp.next.size(); i++) {
                Vertex v =temp.next.get(i);
                if (!v.visited) {
                    v.count = (v.autoMove) ? temp.count : temp.count+1;
                    v.visited = true;
                    queue.add(v);
                }
            }
        }
        System.out.println(temp.count);
        return temp.data == 100 ? temp.count : -1; 
    }
    
    
//    ALTERNATE USING GRID VIEW
//    public static int quickestWayUp(List<List<Integer>> ladders, List<List<Integer>> snakes) {
//        int[] grid = new int[101];
//        Arrays.fill(grid, -1);
//        for (List<Integer> i: ladders) {
//            grid[i.get(0)] = i.get(1);
//        }
//        for (List<Integer> i: snakes) {
//            grid[i.get(0)] = i.get(1);
//        }
//        boolean[] visited = new boolean[101];
//        Queue<Vertex> queue = new LinkedList<>();
//        Vertex temp = new Vertex(1);
//        temp.count = 0;
//        visited[1]=true;
//        queue.add(temp);
//        while(!queue.isEmpty()) {
//            temp = queue.poll();
//            System.out.print(temp.data+" "+temp.count+" ");
//            if (temp.data>=100) {
//                break;
//            }
//            for (int i=temp.data+1; i<=temp.data+6 && i<=100; i++) {
////                System.out.print(i+" ");
//                if (!visited[i]) {
//                    visited[i] = true;
//                    Vertex ver = (grid[i]!=-1) ? new Vertex(grid[i]) : new Vertex(i);
//                    ver.count = temp.count+1;
//                    queue.add(ver);
//                }
//            }
//            System.out.println();
////            queue.poll();
////            if (grid[temp.data-1] != -1) {
////                Vertex newVer = new Vertex(grid[temp.data+1]);
////            } else {
////                
////            }
//        }
//        System.out.println();
//        System.out.println(queue.size());
////        for (int i=0; i<grid.length; i++) {
////            System.out.println(i+" "+grid[i]);
////        }
//        System.out.println(queue.peek().count);
//        return (temp.data == 100) ? temp.count : -1;
//    }
    
    public static void main(String[] args) {
        List<List<Integer>> ladders;
        List<List<Integer>> snakes;
        ladders = Arrays.asList(
                Arrays.asList(32, 62), 
                Arrays.asList(42, 68), 
                Arrays.asList(12, 98)
        );
        snakes = Arrays.asList(
                Arrays.asList(95, 13), 
                Arrays.asList(97, 25), 
                Arrays.asList(93, 37),
                Arrays.asList(79, 27), 
                Arrays.asList(75, 19), 
                Arrays.asList(49, 47),
                Arrays.asList(67, 17));
        SnakesAndLaddersTheQuickestWayUp.quickestWayUp(ladders, snakes);

        ladders = Arrays.asList(
                Arrays.asList(8, 52), 
                Arrays.asList(6, 80), 
                Arrays.asList(26, 42),
                Arrays.asList(2, 72)
        );
        snakes = Arrays.asList(
                Arrays.asList(51, 19), 
                Arrays.asList(39, 11), 
                Arrays.asList(37, 29),
                Arrays.asList(81, 3), 
                Arrays.asList(59, 5), 
                Arrays.asList(79, 23),
                Arrays.asList(53, 7),
                Arrays.asList(43, 33), 
                Arrays.asList(77, 21)
        );
        SnakesAndLaddersTheQuickestWayUp.quickestWayUp(ladders, snakes);
    }
}
