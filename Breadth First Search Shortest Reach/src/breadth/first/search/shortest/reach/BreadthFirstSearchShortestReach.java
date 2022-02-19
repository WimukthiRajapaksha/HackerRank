/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadth.first.search.shortest.reach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author wimukthirajapaksha
 */
public class BreadthFirstSearchShortestReach {

    /**
     * @param args the command line arguments
     */
        
    static class Vertex {
        List<Vertex> nearBy = new ArrayList<>();
        int data;
        boolean visited = false;
        int depth = 0;

        public Vertex(int data) {
            this.data = data;
        }
    }
    
    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        List<Integer> list = new ArrayList<>();
        
        Vertex[] vertex = new Vertex[n];
        for (int i=0; i<n; i++) {
            vertex[i]=new Vertex(i+1);
        }
        for (List<Integer> edge: edges) {
            System.out.println(edge.get(0)+" "+edge.get(1));
            vertex[edge.get(0)-1].nearBy.add(vertex[edge.get(1)-1]);
            vertex[edge.get(1)-1].nearBy.add(vertex[edge.get(0)-1]);
        }
        System.out.println("-----");
        for (Vertex v: vertex) {
            System.out.print(v.data+" "+v.nearBy.size()+" -> ");
            for (Vertex i: v.nearBy) {
                System.out.print(i.data+" ");
            }
            System.out.println("");
        }
        List<Integer> ret = new ArrayList<>();
        for (int i=0; i<n-1; i++) {
            ret.add(-1);
        }
        System.out.println(ret);
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(vertex[s-1]);
        vertex[s-1].visited = true;
        vertex[s-1].depth = 0;
        while(!queue.isEmpty()) {
            System.out.println(queue.size());
            Vertex temp = queue.poll();
            for (Vertex v: temp.nearBy) {
                if (!v.visited) {
                    v.visited = true;
                    v.depth = temp.depth+1;
                    queue.add(v);
                    if (v.data>s) {
                        ret.set(v.data-2, (temp.depth+1)*6);
                    } else {
                        ret.set(v.data-1, (temp.depth+1)*6);
                    }
                }
            }
        }
        for (int i: ret) {
            System.out.print(i+" ");
        }
        return ret;
    }
    
    public static void main(String[] args) {
//        List<List<Integer>> edges = new ArrayList<>();
//        edges.add(Arrays.asList(4,2));
//        edges.add(Arrays.asList(1,2));
//        edges.add(Arrays.asList(1,3));
//        BreadthFirstSearchShortestReach.bfs(4, 3, edges, 1);

        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(4,3));
        edges.add(Arrays.asList(1,2));
        edges.add(Arrays.asList(1,3));
        BreadthFirstSearchShortestReach.bfs(5, 3, edges, 1);
    }
}
