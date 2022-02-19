/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cut.the.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */

interface i {
        String s = "pppp";
}

class B implements i {

}


public class CutTheTree {
    /**
     * @param args the command line arguments
     */
    
    static class GraphAjdacencyMatrix {
        int vertices;
        LinkedList[] matrix;
        boolean[] visited;
        List<Integer> data;
        int total;
        long[] add;

        public GraphAjdacencyMatrix(int vertices, List<Integer> data, int total) {
            this.vertices = vertices;
            this.matrix = new LinkedList[vertices];
            for (int i=0; i<vertices; i++) {
                this.matrix[i] = new LinkedList<>();
            }
            this.visited = new boolean[vertices];
            this.data = data;
            this.total = total;
            this.add = new long[]{Long.MAX_VALUE};
        }
        
        public void addEdge(int source, int destination) {
//            System.out.println(source+" "+destination+" "+matrix[source]);
            matrix[source].add(destination);
            matrix[destination].add(source);
        }
        
        public void printMatrix() {
            for (int k=0; k<this.matrix.length; k++) {
//            for (LinkedList<Integer> i: this.matrix) {
//                System.out.println(i);
                if (matrix[k].size()>0) {
                    System.out.print(k+" -> ");
                    for (int j=0; j<this.matrix[k].size(); j++) {
                        System.out.print(this.matrix[k].get(j)+" ");
                    }
                    System.out.println();
                }
            }
        }
        
        private long dfs(int v) {
            this.visited[v] = true;
            long temp = data.get(v);
            Iterator<Integer> i = this.matrix[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    long va = this.dfs(n);
                    temp+=va;                    
                }
            }
            if (add[0]>Math.abs(total-2*temp)) {
                add[0] = Math.abs(total-2*temp);
            }
            return temp;
        }
    }
    
    public static int cutTheTree(List<Integer> data, List<List<Integer>> edges) {
        int total = 0;
        for (int i=0; i<edges.size(); i++) {
            total+=data.get(i);
        }      
        total+=data.get(data.size()-1);
        System.out.println(total);
        CutTheTree.GraphAjdacencyMatrix matrix = new CutTheTree.GraphAjdacencyMatrix(data.size(), data, total);
        
        for (int i=0; i<edges.size(); i++) {
            matrix.addEdge(edges.get(i).get(0)-1, edges.get(i).get(1)-1);
        }
        
        
//        long[] list = new long[]{Long.MAX_VALUE};
        matrix.dfs(0);
        System.out.println((int)matrix.add[0]);
        return (int)matrix.add[0];
    }
    
    
    
    
    public static void main(String[] args) {
        i aa = new B();
        
        
        int[] a = {2,3,4};
        int[] b = a.clone();
        b[0]=0;
        System.out.println(a[0]);
        System.out.println(b[0]);
        int count = 140;
        count++;
        ++count;
        System.out.println(count++);
        cutTheTree(Arrays.asList(100, 200, 100, 500, 100, 600), 
                Arrays.asList(
                        Arrays.asList(1, 2),
                        Arrays.asList(2, 3),
                        Arrays.asList(2, 5),
                        Arrays.asList(5, 4),
                        Arrays.asList(5, 6)
                ));
//        CutTheTree.cutTheTree(Arrays.asList(205, 573, 985, 242, 830, 514, 592, 263, 142, 915), 
//                Arrays.asList(
//                        Arrays.asList(2, 8),
//                        Arrays.asList(10, 5),
//                        Arrays.asList(1, 7),
//                        Arrays.asList(6, 9),
//                        Arrays.asList(4, 3),
//                        Arrays.asList(8, 10),
//                        Arrays.asList(5, 1),
//                        Arrays.asList(7, 6),
//                        Arrays.asList(9, 4)
//                ));
    }
    
    
    
    
    
    
    
    
    
    
//    static class Node {
//        int value;
//        List<Node> child;
//        boolean connected;
//        
//        Node(int value) {
//            this.value = value;
//            child = new ArrayList<>();
//            connected = false;
//        }
//    }
//    
//    public static int sumNodes(Node node) {
//        int temp = node.value;
//        for (Node n: node.child) {
//            temp+=CutTheTree.sumNodes(n);
//        }
//        node.value = temp;
//        return temp;
//    }
//    
//    public static void preOrder(Node node) {
//        if (node==null) {
//            return;
//        }
//        System.out.println(node.value);
//        for (Node n: node.child) {
//            CutTheTree.preOrder(n);
//        }
//    }
//    
//    
//    
//    public static int cutTheTree(List<Integer> data, List<List<Integer>> edges) {
//        List<Integer> temppp = new ArrayList<>(data);
//        Collections.sort(data);
//        System.out.println(temppp);
//        System.out.println(data);
//        boolean[][] grid = new boolean[data.get(data.size()-1)][data.get(data.size()-1)];
//        
//        for (List<Integer> edge: edges) {
//            if (edge.get(0)<edge.get(1)) {
//                grid[edge.get(1)-1][edge.get(0)-1] = true;
//            } else {
//                grid[edge.get(0)-1][edge.get(1)-1] = true;
//            }
//        }
//        
//        for (boolean[] b: grid) {
//            for (boolean bb: b) {
//                System.out.print(bb+" ");
//            }
//            System.out.println();
//        }
//        
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(data.get(0)-1);
//        Node root = new Node(data.get(0)-1);
//        Queue<Node> nodesQueue = new LinkedList<>();
//        nodesQueue.add(root);
//        System.out.println();
//        while(!queue.isEmpty()) {
//            int temp = queue.poll();
//            Node node = nodesQueue.poll();
////            System.out.println(node.value);
//            for (int i=0; i<grid.length; i++) {
////                System.out.print(grid[i][temp]+" ");
////                System.out.println(i+" "+temp);
//                if (grid[i][temp]) {
//                    queue.add(i);
//                    Node n = new Node(i);
//                    node.child.add(n);
//                    nodesQueue.add(n);
//                    grid[i][temp] = false;
//                    for (int j=0; j<grid.length; j++) {
//                        if (grid[i][j] && j!=i && temp!=i) {
//                            queue.add(j);
//                            Node nn = new Node(j);
//                            node.child.add(nn);
//                            nodesQueue.add(nn);
//                            grid[i][j] = false;
//                        }
//                    }
//                } 
//                
//            }
//            System.out.println();
//        }
//        
//        CutTheTree.preOrder(root);
//        System.out.println();
//        Queue<Node> queuee = new LinkedList<>();
//        queuee.add(root);
////        while(!queuee.isEmpty()) {
////            Node temp = queuee.poll();
////            temp.value = data.get(temp.value);
////            for (Node chi: temp.child) {
////                queuee.add(chi);
////            }
////        }
//        
//        CutTheTree.preOrder(root);
//        
//        return 0;
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
////        Node[] list = new Node[data.size()];
////        for (int i=0; i<data.size(); i++) {
////            list[i] = new Node(data.get(i));
////        }
////        Node root = list[0];
////        root.connected = true;
////        List<int[]> future = new ArrayList<>();
////        for (List<Integer> edge: edges) {
////            if (!list[edge.get(0)-1].connected) {
////                if (list[edge.get(1)-1].connected) {
////                    list[edge.get(1)-1].child.add(list[edge.get(0)-1]);
////                    list[edge.get(0)-1].connected = true;
////                } else {
//////                    list[edge.get(0)-1].child.add(list[edge.get(1)-1]);
//////                    list[edge.get(1)-1].child.add(list[edge.get(0)-1]);
////                    future.add(new int[]{edge.get(0)-1, edge.get(1)-1});
////                }
////            } else {
////                list[edge.get(0)-1].child.add(list[edge.get(1)-1]);
////                list[edge.get(1)-1].connected = true;
////            }
////        }
////        System.out.println(future.size()+" ----");
////        while(future.size()>0) {
////            List<int[]> ne = new ArrayList<>();
////            for (int[] fu: future) {
////                if (list[fu[0]].connected) {
////                    list[fu[0]].child.add(list[fu[1]]);
////                    list[fu[1]].connected = true;
////                } else if (list[fu[1]].connected) {
////                    list[fu[1]].child.add(list[fu[0]]);
////                    list[fu[0]].connected = true;
////                } else {
////                    ne.add(fu);
////                }
////            }
////            future = ne;
////        }
////        System.out.println(future.size()+" ----");
////        CutTheTree.preOrder(root);
////        System.out.println("\n");
////        CutTheTree.sumNodes(root);
////        
////        CutTheTree.preOrder(root);
////        
////        Queue<Node> queue = new LinkedList<>();
////        queue.add(root);
////        int min = Integer.MAX_VALUE;
////        while(!queue.isEmpty()) {
////            Node temp = queue.poll();
////            min = Math.min(min, Math.abs(root.value-2*temp.value));
////            for (Node n: temp.child) {
////                queue.add(n);
////            }
////        }
////        System.out.println(min+" min");
////        return 0;
//    }
    
    
    
    
//    static class Node {
//        int value;
//        int sum=0;
////        Node parent;
////        int index;
//        List<Node> children = new ArrayList<>();
//        
//        Node(int value) {
////            this.index = index;
//            this.value = value;
////            this.parent = parent;
//        }
//        
//        public void connect(Node child) {
//            children.add(child);
//        }
//    }
//    
//    public static int dfs(Node root, int min, int sum) {
//        for (Node child: root.children) {
//            min = CutTheTree.dfs(child, min, sum);
//        }
//        return Math.min(min, Math.abs(sum-(2*root.sum)));
//    }
//    
//    public static int diff(Node root, int sum) {
//        if (root == null) {
//            return 0;
//        }
//        int min = Integer.MAX_VALUE;
//        int temp = CutTheTree.dfs(root, min, sum);
//        return temp;
//    }
//    
//    public static void printChilds(Node root) {
//        System.out.println();
//        if (root == null) {
//            return;
//        }
//        System.out.print(root.value+" ");
//        for (Node n: root.children) {
//            CutTheTree.printChilds(n);
//        }
//    }
//    
//    public static Node createConnections(Node root, Map<Integer, List<Integer>> map, int[] values) {
////        System.out.println("createConnections "+root.value+" "+root.index);
//        if (!map.containsKey(root.index) || map.get(root.index).isEmpty()) {
//            return root;
//        }
//        List<Node> children = new ArrayList<>();
//        for (int i=0; i<map.get(root.index).size(); i++) {
////            System.out.println(map.get(root.index).get(i)+" -> "+values[i]);
//            Node temp = new Node(map.get(root.index).get(i), values[map.get(root.index).get(i)]);
//            map.get(temp.index).remove(new Integer(root.index));
//            children.add(temp);
//            CutTheTree.createConnections(temp, map, values);
//        }
//        root.children = children;
////        System.out.println(root.children.size()+" size");
//        return root;
//    }
    
//    public static int createChildAndParent(Node root) {
//        int sum = root.value;
//        for(Node n: root.children) {
//            if (n.children.contains(root)) {
//                n.children.remove(root);
//            }
//            sum+=CutTheTree.createChildAndParent(n);
//        }
//        root.sum = sum;
//        return sum;
//    }
//    
//    public static int cutTheTree(List<Integer> data, List<List<Integer>> edges) {
//        Node[] nodes = new Node[data.size()];
//        int sum=0;
//        for (int i=0; i<data.size(); i++) {
//            nodes[i] = new Node(data.get(i));
//            sum+=data.get(i);
//        }
//        for (List<Integer> edge: edges) {
//            nodes[edge.get(0)-1].children.add(nodes[edge.get(1)-1]);
//            nodes[edge.get(1)-1].children.add(nodes[edge.get(0)-1]);
//        }
//        CutTheTree.createChildAndParent(nodes[0]);
//        System.out.println(nodes[0].value);
//        for (Node n: nodes) {
//            System.out.println(n.children.size()+" "+n.value+" "+n.sum);
//        }
//        System.out.println(CutTheTree.diff(nodes[0], sum));
//        return 0;
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
////        int[] values = new int[data.size()];
////        int sum = 0;
////        for (int i=0; i<data.size(); i++) {
////            values[i] = data.get(i);
////            sum+=data.get(i);
////        }
////        Map<Integer, List<Integer>> map = new HashMap<>();
////        for (List<Integer> e: edges) {
//////            System.out.println(values[e.get(0)-1]);
////            if (map.containsKey(e.get(0)-1)) {
////                List<Integer> val = map.get(e.get(0)-1);
////                if (!val.contains(e.get(1)-1)) {
////                    val.add(e.get(1)-1);
////                }
////            } else {
////                map.put(e.get(0)-1, new ArrayList<>(Arrays.asList(e.get(1)-1)));
////            }
////            
////            if (map.containsKey(e.get(1)-1)) {
////                List<Integer> val = map.get(e.get(1)-1);
//////                System.out.println(val);
////                if (!val.contains(e.get(0)-1)) {
////                    val.add(e.get(0)-1);
////                }
////            } else {
////                map.put(e.get(1)-1, new ArrayList<>(Arrays.asList(e.get(0)-1)));
////            }
////        }
////        System.out.println(map);
////        Node root = CutTheTree.createConnections(new Node(0, data.get(0)), map, values);
//////        System.out.println(root.value+" "+root.children.get(1).children.size());
//////        CutTheTree.printChilds(root);
//////        System.out.println(CutTheTree.diff(root, sum));
////        int ret = CutTheTree.diff(root, sum);
////        System.out.println(ret);
////        return ret;
//    }   
}
