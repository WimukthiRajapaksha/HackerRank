/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeanie.s.route;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */
public class JeanieSRoute {

    /**
     * @param args the command line arguments
     */
    static class Edge {
        int weight;
        Vertex destination;
        int visitedCount;

        public Edge(int weight, Vertex destination) {
            this.weight = weight;
            this.destination = destination;
            this.visitedCount = 0;
        }
    }
    
    static class Vertex {
        int data;
        List<Edge> edges;

        public Vertex(int data) {
            this.data = data;
            edges = new ArrayList<>();
        }
    }
    
    static int jeanisRoute(int[] k, int[][] roads) {
        Vertex[] all = new Vertex[roads.length+1];
        for (int i=0; i<=roads.length; i++) {
            all[i] = new Vertex(i+1);
        }
        for (int[] i: roads) {
            all[i[0]-1].edges.add(new Edge(i[2], all[i[1]-1]));
            all[i[1]-1].edges.add(new Edge(i[2], all[i[0]-1]));
        }
        Set<Integer> set = new HashSet<>();
        for (int i: k) {
            set.add(i);
        }
        int minWeight = 0;
        for (int i: k) {
            int tempWeight=0;
            Queue<Vertex> queue = new LinkedList<>();
            queue.add(all[i-1]);
            int count = k.length-1;
//            tempWeight+=all[i-1].
            while(count>0) {
                Vertex v = queue.poll();
                if (set.contains(v.data)) {
                    count--;
                }
//                tempWeight+=v
            }
        }
        
        for (Vertex v: all) {
            System.out.println(v.data+" "+v.edges.size());
        }
        return 0;
    }
    
    public static void main(String[] args) {
        JeanieSRoute.jeanisRoute(new int[]{1, 3, 4},  new int[][]{
            new int[]{1,2,3},
            new int[]{2,3,2},
            new int[]{2,4,2},
            new int[]{3,5,3},
        });
    }
}
