/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castle.on.the.grid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author wimukthirajapaksha
 */
public class CastleOnTheGrid {

    /**
     * @param args the command line arguments
     */
    
    static class Node {
        int i;
        int j;
        int weight;
        boolean visited;

        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    
    public static int minimumMoves(List<String> grid, int startX, int startY, int goalX, int goalY) {
        if (startX == goalX && startY==goalY) {
            return 0;
        }
        List<List<Node>> nodes = new ArrayList<>();
        for (int i=0; i<grid.size(); i++) {
            nodes.add(new ArrayList<>());
            for (int j=0; j<grid.get(i).length(); j++) {
                Node n = new Node(i, j);
                if (grid.get(i).charAt(j)=='X') {
                    n.visited = true;
                }
                nodes.get(i).add(n);
            }
        }
        System.out.println(nodes.size()+" - "+nodes.get(0).size());
        int length = grid.get(0).length();
        Queue<Node> queue = new LinkedList<>();
        Node pare = nodes.get(startX).get(startY);
        pare.visited = true;
        pare.weight = 0;
        queue.add(pare);
        System.out.println("---"+queue.peek().i+" "+queue.peek().j);
        while(!queue.isEmpty()) {
            Node n = queue.poll();
            
            for (int i=Math.max(n.j-1, 0); i>=0; i--) {
                Node temp = nodes.get(n.i).get(i);
                System.out.println(temp.i+" "+temp.j+" "+temp.visited);
                if (temp.visited) {
                    break;
                }
                temp.weight = n.weight+1;
                if (temp.i==goalX && temp.j==goalY) {
                    System.out.println("Found");
                    return temp.weight;
                }
                
                temp.visited = true;
                queue.add(temp);
            }
            
            for (int i=Math.max(n.i-1, 0); i>=0; i--) {
                Node temp = nodes.get(i).get(n.j);
                System.out.println(temp.i+" "+temp.j+" "+temp.visited);
                if (temp.visited) {
                    break;
                }
                temp.weight = n.weight+1;
                if (temp.i==goalX && temp.j==goalY) {
                    System.out.println("Found");
                    return temp.weight;
                }
                
                temp.visited = true;
                queue.add(temp);
            }
            
            for (int i=Math.min(n.j+1, length); i<length; i++) {
                Node temp = nodes.get(n.i).get(i);
                System.out.println(temp.i+" "+temp.j+" "+temp.visited);
                if (temp.visited) {
                    break;
                }
                temp.weight = n.weight+1;
                if (temp.i==goalX && temp.j==goalY) {
                    System.out.println("Found");
                    return temp.weight;
                }
                
                temp.visited = true;
                queue.add(temp);
            }
            
            for (int i=Math.min(n.i+1, length); i<nodes.size(); i++) {
                Node temp = nodes.get(i).get(n.j);
                System.out.println(temp.i+" "+temp.j+" "+temp.visited);
                if (temp.visited) {
                    break;
                }
                temp.weight = n.weight+1;
                if (temp.i==goalX && temp.j==goalY) {
                    System.out.println("Found");
                    return temp.weight;
                }
                
                temp.visited = true;
                queue.add(temp);
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
//        System.out.println(CastleOnTheGrid.minimumMoves(Arrays.asList(".....",".....", ".....", ".....", ".....", "....."), 2, 1, 0, 0));
        System.out.println(CastleOnTheGrid.minimumMoves(Arrays.asList(".X.",".X.", "..."), 0, 0, 0, 2));
    }
}
