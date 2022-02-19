/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */

class Graph {
    LinkedList<Integer> graph[];
    boolean[] visited;
    int[] tempCount;
    int breaks;
    
    public Graph(int nodes, int edges) {
        graph = new LinkedList[nodes];
        for (int i=0; i<nodes; i++) {
            graph[i] = new LinkedList<>();
        }
        visited = new boolean[nodes];
        tempCount = new int[nodes];
        this.breaks = 0;
    }

    public void addEdge(int from, int to) {
        this.graph[from].add(to);
        this.graph[to].add(from);
    }

    public void print() {
        System.out.println(this.graph);
    }
    
    public int dfs(int node) {
        this.visited[node] = true;
//        System.out.print(node+" -> ");
        int count = 0;
        Iterator<Integer> it = this.graph[node].iterator();
        while(it.hasNext()) {
            int temp = it.next();
            if (!visited[temp]) {
                visited[temp] = true;
                count+=dfs(temp)+1;
            }
        }
        
        if (count%2==1) {
            System.out.println(node+" "+count+" - "+-1);
            breaks++;
            return -1;
        }
        System.out.println(node+" "+count+" "+count);
        return count;
    }
}

public class EvenTree {

    /**
     * @param args the command line arguments
     */
    
    static int evenForest(int t_nodes, int t_edges, List<Integer> t_from, List<Integer> t_to) {
        Graph graph = new Graph(t_nodes, t_edges);
        for (int i=0; i<t_edges; i++) {
            graph.addEdge(t_from.get(i)-1, t_to.get(i)-1);
        }
//        graph.print();
        graph.dfs(0);
        System.out.println(graph.breaks-1);
        return 0;
    }
    
    public static void main(String[] args) {
        List<Integer> t_from = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> t_to = new ArrayList<>(Arrays.asList(1, 1, 3, 2, 1, 2, 6, 8, 8));
        evenForest(10, 9, t_from, t_to);
    }   
}
