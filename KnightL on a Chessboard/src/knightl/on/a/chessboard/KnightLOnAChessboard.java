/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knightl.on.a.chessboard;

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
public class KnightLOnAChessboard {

    /**
     * @param args the command line arguments
     */
    
    static class Node {
        int i;
        int j;
        int count;
        
        Node(int i, int j, int count) {
            this.i = i;
            this.j = j;
            this.count = count;
        }
    }
    
    public static List<Node> getNearBy(int i, int j, int nodeI, int nodeJ, int n, int count) {
        List<Node> nodes = new ArrayList<>();
        if (nodeI+i>=0 && nodeI+i<=n && nodeJ+j>=0 && nodeJ+j<=n) {
            nodes.add(new Node(nodeI+i, nodeJ+j, count+1));
        }
        if (nodeI+i>=0 && nodeI+i<=n && nodeJ-j>=0 && nodeJ-j<=n) {
            nodes.add(new Node(nodeI+i, nodeJ-j, count+1));
        }
        if (nodeI-i>=0 && nodeI-i<=n && nodeJ+j>=0 && nodeJ+j<=n) {
            nodes.add(new Node(nodeI-i, nodeJ+j, count+1));
        }
        if (nodeI-i>=0 && nodeI-i<=n && nodeJ-j>=0 && nodeJ-j<=n) {
            nodes.add(new Node(nodeI-i, nodeJ-j, count+1));
        }
        if (nodeI+j>=0 && nodeI+j<=n && nodeJ+i>=0 && nodeJ+i<=n) {
            nodes.add(new Node(nodeI+j, nodeJ+i, count+1));
        }
        if (nodeI+j>=0 && nodeI+j<=n && nodeJ-i>=0 && nodeJ-i<=n) {
            nodes.add(new Node(nodeI+j, nodeJ-i, count+1));
        }
        if (nodeI-j>=0 && nodeI-j<=n && nodeJ+i>=0 && nodeJ+i<=n) {
            nodes.add(new Node(nodeI-j, nodeJ+i, count+1));
        }
        if (nodeI-j>=0 && nodeI-j<=n && nodeJ-i>=0 && nodeJ-i<=n) {
            nodes.add(new Node(nodeI-j, nodeJ-i, count+1));
        }
        return nodes;
    }
    
//    RECURSIVE
//    public static void bfs(int i, int j, int n, Queue<Node> queue, boolean[][] visited, List<Integer> li) {
//        if (queue.isEmpty()) {
//            li.add(-1);
//            return;
//        } 
//        Node node = queue.poll();
//        if (node.i==n && node.j==n) {
//            li.add(node.count);
//            return;
//        }
//        for (Node no: KnightLOnAChessboard.getNearBy(i, j, node.i, node.j, n, node.count)) {
//            if (!visited[no.i][no.j]) {
//                queue.add(no);
//                visited[no.i][no.j] = true;
//            }
//        }
//        KnightLOnAChessboard.bfs(i, j, n, queue, visited, li);
//    }
//    
//    public static List<List<Integer>> knightlOnAChessboard(int n) {
//        List<List<Integer>> list = new ArrayList<>();
//        for (int i=1; i<n; i++) {
//            List<Integer> li = new ArrayList<>();
//            for (int j=1; j<i; j++) {
//                li.add(list.get(j-1).get(i-1));
//            }
//            for (int j=i; j<n; j++) {
//                boolean[][] visited = new boolean[n+1][n+1];
//                Queue<Node> queue = new LinkedList<>();
//                queue.add(new Node(0, 0, 0));
//                KnightLOnAChessboard.bfs(i, j, n-1, queue, visited, li);
//            }
//            list.add(li);
//        }
//        return list;
//    }
    
//    ITERRATIVE
    public static int bfs(int i, int j, int n) {
        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n+1][n+1];
        queue.add(new Node(0, 0, 0));
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            visited[node.i][node.j] = true;
            if (node.i==n && node.j==n) {
                return node.count;
            }
            for (Node no: KnightLOnAChessboard.getNearBy(i, j, node.i, node.j, n, node.count)) {
                if (!visited[no.i][no.j]) {
                    queue.add(no);
                    visited[no.i][no.j] = true;
                }
            }
        }
        return -1;
    }
    
    public static List<List<Integer>> knightlOnAChessboard(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i=1; i<n; i++) {
            System.out.println(i);
            List<Integer> li = new ArrayList<>();
            for (int j=1; j<i; j++) {
                li.add(list.get(j-1).get(i-1));
            }
            for (int j=i; j<n; j++) {
                int temp = KnightLOnAChessboard.bfs(i, j, n-1);
                li.add(temp);
            }
            list.add(li);
        }
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println(KnightLOnAChessboard.knightlOnAChessboard(5));
    }
}
