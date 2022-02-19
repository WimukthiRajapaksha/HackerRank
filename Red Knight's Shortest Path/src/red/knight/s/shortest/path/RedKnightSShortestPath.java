/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package red.knight.s.shortest.path;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */
public class RedKnightSShortestPath {

    /**
     * @param args the command line arguments
     */  
    
    static class Node {
        int i;
        int j;
        String dir;
        String path;
        int count;
        Node(int i, int j) {
            this.i = i;
            this.j = j;
            this.dir = "";
            this.path = "";
            this.count = 0;
        }
        
        Node(int i, int j, String dir, Node node) {
            this.i = i;
            this.j = j;
            this.dir = dir;
            this.path = node.path+dir+" ";
            this.count = node.count+1;
        }
    }
    
    public static List<Node> nearBy(Node temp, int n, int count, int i_end, int j_end, boolean[][] visited) {
        List<Node> nodes = new ArrayList<>();
        if (temp.i-2>=0 && temp.j-1>=0 && !visited[temp.i-2][temp.j-1]) {
                nodes.add(new Node(temp.i-2, temp.j-1, "UL", temp));
                visited[temp.i-2][temp.j-1] = true;
            }
            if (temp.i-2>=0 && temp.j+1<n && !visited[temp.i-2][temp.j+1]) {
                nodes.add(new Node(temp.i-2, temp.j+1, "UR", temp));
                visited[temp.i-2][temp.j+1] = true;
            }
            if (temp.j+2<n && !visited[temp.i][temp.j+2]) {
                nodes.add(new Node(temp.i, temp.j+2, "R", temp));
                visited[temp.i][temp.j+2] = true;
            }
            if (temp.i+2<n && temp.j+1<n && !visited[temp.i+2][temp.j+1]) {
                nodes.add(new Node(temp.i+2, temp.j+1, "LR", temp));
                visited[temp.i+2][temp.j+1] = true;
            }
            if (temp.i+2<n && temp.j-1>=0 && !visited[temp.i+2][temp.j-1]) {
                nodes.add(new Node(temp.i+2, temp.j-1, "LL", temp));
                visited[temp.i+2][temp.j-1] = true;
            }
            if (temp.j-2>=0 && !visited[temp.i][temp.j-2]) {
                nodes.add(new Node(temp.i, temp.j-2, "L", temp));
                visited[temp.i][temp.j-2] = true;
            }
        return nodes;
    }
    
    public static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(i_start, j_start));
        boolean[][] visited = new boolean[n][n];
        if ((i_end-i_start)%2!=0) {
            System.out.println("Impossible");
            return;
        }
        while(!queue.isEmpty()) {
            Node temp = queue.poll();
            if (temp.i == i_end && temp.j == j_end) {
                System.out.println(temp.count);
                System.out.println(temp.path);
                return;
            }
            visited[temp.i][temp.j] = true;
            List<Node> nodes = RedKnightSShortestPath.nearBy(temp, n, temp.count+1, i_end, j_end, visited);
            for (Node node: nodes) {
                queue.add(node);
            }
        }
        System.out.println("Impossible");
    }
    
    
//    ALTERNATE - USING MATHS
//    public static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
//        int colDiff = i_end-i_start;
//        int rowDiff = j_end-j_start;
//        
//        int ur=0;
//        int ul=0;
//        int r=0;
//        int ll=0;
//        int lr=0;
//        int l=0;
//        
//        if (colDiff%2!=0) {
//            System.out.println("Impossible");
//            return;
//        }
//        if (colDiff<0) {
//            while(colDiff!=0) {
//                colDiff+=2;
//                if (rowDiff<=0) {
//                    rowDiff++;
//                    ul++;
//                } else {
//                    rowDiff--;
//                    ur++;
//                }
//            }
//        } else {
//            while(colDiff!=0) {
//                colDiff-=2;
//                if (rowDiff>=0) {
//                    rowDiff--;
//                    lr++;
//                } else {
//                    rowDiff++;
//                    ll++;
//                }
//            }
//        }
//        if (rowDiff>0) {
//            while(rowDiff>0) {
//                rowDiff-=2;
//                r++;
//            }
//        } else {
//            while(rowDiff<0) {
//                rowDiff+=2;
//                l++;
//            }
//        }
//        if (rowDiff!=0) {
//            System.out.println("Impossible");
//        } else {
//            int count = ul+ur+r+lr+ll+l;
//            String path = "";
//            while(ul>0) {
//                path+="UL ";
//                ul--;
//            }
//            while(ur>0) {
//                path+="UR ";
//                ur--;
//            }
//            while(r>0) {
//                path+="R ";
//                r--;
//            }
//            while(lr>0) {
//                path+="LR ";
//                lr--;
//            }
//            while(ll>0) {
//                path+="LL ";
//                ll--;
//            }
//            while(l>0) {
//                path+="L ";
//                l--;
//            }
//            System.out.println(count+"\n"+path);
//        }
//    }
    
    public static void main(String[] args) {
        RedKnightSShortestPath.printShortestPath(6, 5, 1, 0, 5);
        RedKnightSShortestPath.printShortestPath(7, 6, 6, 0, 1);
        RedKnightSShortestPath.printShortestPath(7, 0, 3, 4, 3);
        RedKnightSShortestPath.printShortestPath(10, 2, 0, 2, 4);
        RedKnightSShortestPath.printShortestPath(12, 0, 4, 8, 4);
        RedKnightSShortestPath.printShortestPath(100, 0, 20, 60, 12);
    }
}
