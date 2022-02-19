/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roads.and.libraries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author wimukthirajapaksha
 */
public class RoadsAndLibraries {

    /**
     * @param args the command line arguments
     */
    
//    static class Graph {
//        static class Edge implements Comparable<Edge>{
//            int source;
//            int destination;
//            int weight;
//
//            public Edge(int source, int destination, int weight) {
//                this.source = source;
//                this.destination = destination;
//                this.weight = weight;
//            }
//
//            public Edge() {
//            }
//
//            @Override
//            public int compareTo(Edge o) {
//                return this.weight - o.weight;
//            }
//        }
//
//        static class Subset {
//            int parent;
//            int rank;
//        }
//
//        int vertices;
//        int edges;
//        Edge[] edge;
//
//        public Graph(int vertices, int edges) {
//            this.vertices = vertices;
//            this.edges = edges;
//            this.edge = new Edge[edges];
//            for (int i=0; i<edges; i++) {
//                edge[i]=new Edge();
//            }
//        }
//    }
//    
//    public static int find(Graph.Subset[] subset, int n) {
//        if (subset[n].parent != n) {
//            subset[n].parent = find(subset, subset[n].parent);
//        }
//        return subset[n].parent;
//    }
//    
//    public static void union(Graph.Subset[] subset, int n1, int n2) {
//        int p1 = find(subset, n1);
//        int p2 = find(subset, n2);
//        if (subset[p1].rank>=subset[p2].rank) {
//            subset[p2].parent = p1;
//            subset[p1].rank = (subset[p1].rank == subset[p1].rank) ? subset[p1].rank+1 : subset[p1].rank;
//        } else {
//            subset[p1].parent = p2;
//        }
//    }
//    
////    static class Node {
////        int id;
////        Node parent;
////        int rank;
////        boolean checked;
////
////        public Node(int id) {
////            this.id = id;
////            this.parent = this;
////            this.rank = 0;
////        }
////    }
////    
////    public static Node find(Node n) {
////        if (n.parent == n) {
////            return n.parent;
////        }
////        n.parent = find(n.parent);
////        return n.parent;
////    }
////    
////    public static void union(Node n1, Node n2) {
////        Node p1 = find(n1);
////        Node p2 = find(n2);
////        if (p1==p2) {
////            return;
////        }
////        if (p1.rank>=p2.rank) {
////            p2.parent = p1;
////            p1.rank = (p1.rank == p2.rank) ? p1.rank+1 : p1.rank;
////        } else {
////            p1.parent = p2;
////        }
////    }
//    
//    public static long roadsAndLibraries(int n, int c_lib, int c_road, List<List<Integer>> cities) {
//        Graph graph = new Graph(n, cities.size());
//        for (int i=0; i<cities.size(); i++) {
//            graph.edge[i].source = cities.get(i).get(0);
//            graph.edge[i].destination = cities.get(i).get(1);
//            graph.edge[i].weight = c_road;
//        }
//        Graph.Edge[] res = new Graph.Edge[n];
//        Graph.Subset[] subsets = new Graph.Subset[n];
//        
//        for (int i=0; i<n; i++) {
//            res[i]=new Graph.Edge();
//            subsets[i]=new Graph.Subset();
//            subsets[i].parent = i;
//            subsets[i].rank = 0;
//        }
//        Arrays.sort(graph.edge);
//        
//        int i=0; 
//        int j=0;
//        int sum=0;
//        
//        while(i<n-1) {
//            Graph.Edge e = graph.edge[j++];
//            int x = find(subsets, e.source-1);
//            int y = find(subsets, e.destination-1);
//            if (x!=y) {
//                res[i++]=e;
//                union(subsets, x, y);
//                sum+=e.weight;
//            } 
//        }
//        for (Graph.Subset s: subsets) {
//            System.out.println(s.parent);
//        }
////        System.out.println(subsets);
//        System.out.println(sum);
//        return sum;
        
//        if (c_lib <= c_road) {
//            return (long)n*(long)c_lib;
//        }
//        Map<Integer, Node> map = new HashMap<>();
//        for (int i=0; i<n; i++) {
//            map.put(i, new Node(i));
//        }
//        for (List<Integer> city: cities) {
//            Node n1 = find(map.get(city.get(0)-1));
//            Node n2 = find(map.get(city.get(1)-1));
//            union(n1, n2);
//        }
//        Iterator<Map.Entry<Integer, Node>> it = map.entrySet().iterator();
//        long libSum=0;
//        long roadSum=0;
//        while(it.hasNext()) {
//            Map.Entry<Integer, Node> temp = it.next();
//            Node item = temp.getValue();
//            System.out.println(temp.getKey()+" "+temp.getValue().id+" "+temp.getValue().parent.id);
//            if (!item.parent.checked) {
//                item.parent.checked = true;
//                libSum+=c_lib;
//            }
//            if (item.parent!=item && !item.checked) {
//                item.checked = true;
//                roadSum+=c_road;
//            }
//        }
//        System.out.println(libSum+roadSum);
//        return 0;
//    }
    
    static class City {
        int id;
        boolean visited;
        List<City> nearBy;

        public City(int id) {
            this.id = id;
            this.nearBy = new ArrayList<>();
        }
    }
    
    public static long roadsAndLibraries(int n, int c_lib, int c_road, List<List<Integer>> cities) {
        if (c_lib<=c_road) {
            return (long)n*(long)c_lib;
        }
        City[] list = new City[n];
        for (int i=1; i<=n; i++) {
            list[i-1]=new City(i);
        }
        for (List<Integer> city: cities) {
            list[city.get(0)-1].nearBy.add(list[city.get(1)-1]);
            list[city.get(1)-1].nearBy.add(list[city.get(0)-1]);
        }
        long roadSum=0;
        long libSum=0;
        
        for (City c: list) {
            Queue<City> queue = new LinkedList<>();
            if (!c.visited) {
                libSum+=c_lib;
                c.visited = true;
                queue.add(c);
                while(!queue.isEmpty()) {
                    City temp = queue.poll();
                    for (City i: temp.nearBy) {
                        if (!i.visited) {
                            roadSum+=c_road;
                            i.visited = true;
                            queue.add(i);
                        }
                    }
                }
            }
        }
        return roadSum+libSum;
    }
    
    public static void main(String[] args) {
//        long l = RoadsAndLibraries.roadsAndLibraries(3, 2, 1, Arrays.asList(
//                Arrays.asList(1,2), 
//                Arrays.asList(3,1), 
//                Arrays.asList(2,3)
//        ));
//        long l = RoadsAndLibraries.roadsAndLibraries(6, 2, 5, Arrays.asList(
//                Arrays.asList(1,3), 
//                Arrays.asList(3,4), 
//                Arrays.asList(2,4), 
//                Arrays.asList(1,2), 
//                Arrays.asList(2,3), 
//                Arrays.asList(6,5)
//        ));
        long l = RoadsAndLibraries.roadsAndLibraries(7, 2, 1, Arrays.asList(
                Arrays.asList(1,2), 
                Arrays.asList(3,2), 
                Arrays.asList(2,4), 
                Arrays.asList(6,5), 
                Arrays.asList(7,3), 
                Arrays.asList(1,6)
        ));
        System.out.println(l);
    }    
}
