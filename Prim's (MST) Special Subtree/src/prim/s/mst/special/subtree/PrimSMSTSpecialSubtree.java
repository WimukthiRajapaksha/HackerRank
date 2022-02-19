/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim.s.mst.special.subtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javafx.util.Pair;

/**
 *
 * @author wimukthirajapaksha
 */


class Edge {
    int weight;

    public Edge(int weight) {
        this.weight = weight;
    }
}

class Vertex {
    Map<Vertex, Edge> map = new HashMap<>();
    boolean isVisited = false;
    int label;

    public Vertex(int l) {
        this.label = l;
    }
    
    public Pair<Edge, Vertex> nextMin() {
        Iterator<Map.Entry<Vertex, Edge>> it = map.entrySet().iterator();
        Edge minEdge = new Edge(Integer.MAX_VALUE);
        Vertex minVertex = null;
        while(it.hasNext()) {
            Map.Entry<Vertex, Edge> curr = it.next();
            if (curr.getValue().weight<minEdge.weight && !curr.getKey().isVisited) {
                minEdge = curr.getValue();
                minVertex = curr.getKey();
            }
        }
        return new Pair<>(minEdge, minVertex);
    }
}


public class PrimSMSTSpecialSubtree {

    /**
     * @param args the command line arguments
     */
    
    private static Vertex[] list;
    
    private static boolean isDisconnected() {
        for (Vertex v: list) {
            if (!v.isVisited) {
                return true;
            }
        }
        return false;
    }
    
    public static int prims(int n, List<List<Integer>> edges, int start) {
        list = new Vertex[n];
        for (int i=0; i<n; i++) {
            list[i] = new Vertex(i+1);
        }
        for (int i=0; i<edges.size(); i++) {
            List<Integer> curr = edges.get(i);
            
            Vertex first = list[curr.get(0)-1];
            Vertex second = list[curr.get(1)-1];
            first.map.put(second, new Edge(curr.get(2)));
            second.map.put(first, new Edge(curr.get(2)));
        }
        for (Vertex v: list) {
            System.out.println(v.label+" "+v.map.size());
        }
        int sum = 0;
        if (list.length>0) {
            list[0].isVisited = true;
        }
        while(isDisconnected()) {
            Edge minEdge = new Edge(Integer.MAX_VALUE);
            Vertex minVertex = null;
            for (Vertex v: list) {
                if (v.isVisited) {
                    Iterator<Map.Entry<Vertex, Edge>> i = v.map.entrySet().iterator();
                    if (minEdge.weight>v.nextMin().getKey().weight) {
                        minEdge = v.nextMin().getKey();
                        minVertex = v.nextMin().getValue();
                    }
                }
            }
            sum+=minEdge.weight;
            minVertex.isVisited = true;
        }
        System.out.println(sum);
        return sum;
    }
    
    public static void main(String[] args) {
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(1,2,3));
        edges.add(Arrays.asList(1,3,4));
        edges.add(Arrays.asList(4,2,6));
        edges.add(Arrays.asList(5,2,2));
        edges.add(Arrays.asList(2,3,5));
        edges.add(Arrays.asList(3,5,7));
        PrimSMSTSpecialSubtree.prims(5, edges, 0);
    }
}

//class Edge {
//    int weight;
////    boolean isIncluded = false;
//
//    public Edge(int weight) {
//        this.weight = weight;
//    }
//}
//
//class Vertex {
//    String label = null;
//    Map<Vertex, Edge> edge = new HashMap<>();
//    boolean isVisited = false;
//
//    public Vertex(String s) {
//        this.label = s;
//    }
//    
//    public Pair<Vertex, Edge> nextMinimum() {
//        Edge nextMinimum = new Edge(Integer.MAX_VALUE);
//        Vertex nextVertex = this;
//        Iterator<Map.Entry<Vertex,Edge>> it = edge.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<Vertex,Edge> pair = it.next();
//            if (!pair.getKey().isVisited) {
////                if (!pair.getValue().isIncluded) {
//                    if (pair.getValue().weight < nextMinimum.weight) {
//                        nextMinimum = pair.getValue();
//                        nextVertex = pair.getKey();
//                    }
////                }
//            }
//        }
//        return new Pair<>(nextVertex, nextMinimum);
//    }
//}

//public class PrimSMSTSpecialSubtree {
//
//    /**
//     * @param args the command line arguments
//     */
//    private static List<Vertex> graph = new ArrayList<>();
//    
//    private static boolean isDisconnected() {
//        for (Vertex vertex : graph) {
//            if (!vertex.isVisited) {
//                System.out.println(vertex.label+" not");
//                return true;
//            }
//        }
//        return false;
//    }
//    
//    public static int prims(int n, List<List<Integer>> edges, int start) {
//        for (int i=0; i<n; i++) {
//            Vertex v = new Vertex(String.valueOf(i));
//            graph.add(v);
//        }
//        for (List<Integer> e: edges) {
//            int first = e.get(0)-1;
//            int second = e.get(1)-1;
//            int val = e.get(2);
//            System.out.println(first+" "+second+" "+graph.size());
//            graph.get(first).edge.put(graph.get(second), new Edge(val));
//            graph.get(second).edge.put(graph.get(first), new Edge(val));
//        }
////        for (Vertex v: graph) {
////            Iterator<Map.Entry<Vertex, Edge>> i = v.edge.entrySet().iterator();
////            while(i.hasNext()) {
////                System.out.print(i.next().getValue().weight+" ");
////            }
////            System.out.println("");
////        }
////        return 0;
//        int sum = 0;
//        if (graph.size() > 0) {
//            graph.get(0).isVisited = true;
//        }
//        while(isDisconnected()) {
//            Edge nextMin = new Edge(Integer.MAX_VALUE);
//            Vertex nextVer = null;
//            for (Vertex v: graph) {
//                if (v.isVisited) {
//                    System.out.println(v.label+" ****");
//                    Pair<Vertex, Edge> candidate = v.nextMinimum();
//                    if (candidate.getValue().weight < nextMin.weight) {
//                        nextMin = candidate.getValue();
//                        nextVer = candidate.getKey();
//                    }
//                } else {
//                    System.out.println(v.label+" **");
//                }
//            }
//            if (nextVer != null) {
//                System.out.println(nextVer.label+" visi");
////                nextMin.isIncluded = true;
//                nextVer.isVisited = true;
//                sum+=nextMin.weight;
//            }
//            System.out.println(sum);
//        }
//        return sum;
//    }
//    
//    public static void main(String[] args) {
//        List<List<Integer>> edges = new ArrayList<>();
//        edges.add(Arrays.asList(1,2,3));
//        edges.add(Arrays.asList(1,3,4));
//        edges.add(Arrays.asList(4,2,6));
//        edges.add(Arrays.asList(5,2,2));
//        edges.add(Arrays.asList(2,3,5));
//        edges.add(Arrays.asList(3,5,7));
//        PrimSMSTSpecialSubtree.prims(5, edges, 0);
//        
////1 2 3
////1 3 4
////4 2 6
////5 2 2
////2 3 5
////3 5 7
//    }
//}
