/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kruskal.mst.really.special.subtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author wimukthirajapaksha
 */

class Graph {
    static class Edge implements Comparable<Edge> {
        int source;
        int destination;
        int weight;

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }
    
    static class Subset {
        int parent;
        int rank;
    }
    
    int vertices;
    int edges;
    Edge[] edge;

    public Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;
        this.edge = new Edge[edges];
        for (int i=0; i<edges; i++) {
            this.edge[i] = new Edge();
        }
    }
    
    public static int find(Subset[] subset, int i) {
        if (subset[i].parent != i) {
            subset[i].parent = find(subset, subset[i].parent);
        }
        return subset[i].parent;
    }
    
    public static void union(Subset[] subset, int i, int j) {
        int iFind = find(subset, i);
        int jFind = find(subset, j);
        if (subset[iFind].rank > subset[jFind].rank) {
            subset[jFind].parent = iFind;
        } else if (subset[iFind].rank < subset[jFind].rank) {
            subset[iFind].parent = jFind;
        } else {
            subset[jFind].parent = iFind;
            subset[iFind].rank++;
        }
    }
}


public class KruskalMSTReallySpecialSubtree {

    /**
     * @param args the command line arguments
     */
    
    public static int kruskals(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
        Graph graph = new Graph(gNodes, gFrom.size());
        for (int i=0; i<gFrom.size(); i++) {
            graph.edge[i].source=gFrom.get(i);
            graph.edge[i].destination=gTo.get(i);
            graph.edge[i].weight=gWeight.get(i);
        }
        Graph.Edge[] res = new Graph.Edge[gNodes];
        Graph.Subset[] subsets = new Graph.Subset[gNodes];
        for (int i=0; i<gNodes; i++) {
            res[i]=new Graph.Edge();
            subsets[i]=new Graph.Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }
        Arrays.sort(graph.edge);
        int i=0; 
        int j=0;
        int sum=0;
        while(i<gNodes-1) {
            Graph.Edge e = graph.edge[j++];
            int x = Graph.find(subsets, e.source-1);
            int y = Graph.find(subsets, e.destination-1);
            if (x!=y) {
                res[i++]=e;
                Graph.union(subsets, x, y);
                sum+=e.weight;
            } 
        }
        for (Graph.Edge e: res) {
            System.out.println(e.source+" "+e.destination+" "+e.weight);
        }
        System.out.println(sum);
        return sum;
    }
    
    public static void main(String[] args) {
//        kruskals(4, Arrays.asList(1,1,4,2,3,3), Arrays.asList(2,3,1,4,2,4), Arrays.asList(5,3,6,7,4,5));
//        kruskals(5, Arrays.asList(1,1,1,1,2,3,4), Arrays.asList(2,3,4,5,3,4,5), Arrays.asList(20,50,70,90,30,40,60));
//        kruskals(7, Arrays.asList(1,3,2,6,7,1), Arrays.asList(2,2,4,5,3,6), Arrays.asList(1,1,1,1,1,1));
        kruskals(5, Arrays.asList(1,2,3,4,1,3), Arrays.asList(2,3,4,5,3,5), Arrays.asList(30,50,70,90,70,85));
        
//        Arrays.asList(1,2), 
//                Arrays.asList(3,2), 
//                Arrays.asList(2,4), 
//                Arrays.asList(6,5), 
//                Arrays.asList(7,3), 
//                Arrays.asList(1,6)
    }
}
