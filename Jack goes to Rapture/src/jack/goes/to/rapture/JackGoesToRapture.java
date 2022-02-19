/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jack.goes.to.rapture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import javafx.util.Pair;

/**
 *
 * @author wimukthirajapaksha
 */
public class JackGoesToRapture {

    /**
     * @param args the command line arguments
     */
    
    static class AdjacencyNode implements Comparator<AdjacencyNode>{
        int id;
        int weight;

        public AdjacencyNode(int id, int weight) {
            this.id = id;
            this.weight = weight;
        }        

        public AdjacencyNode() {
        }

        @Override
        public int compare(AdjacencyNode o1, AdjacencyNode o2) {
            if (o1.weight>o2.weight) {
                return 1;
            } else if(o1.weight<o2.weight) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    
    static List<List<AdjacencyNode>> adjacency = new ArrayList<>();
    static Set<Integer> visited = new HashSet<>();
    static int[] distance;
    static PriorityQueue<AdjacencyNode> queue;
    
    public static void getCost(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
        distance = new int[gNodes];
        queue = new PriorityQueue<>(gNodes, new AdjacencyNode());
        
        for (int i=0; i<gNodes; i++) {
            distance[i]=Integer.MAX_VALUE;
            adjacency.add(new ArrayList<>());
        }
        
        for (int i=0; i<gFrom.size(); i++) {
            adjacency.get(gFrom.get(i)-1).add(new AdjacencyNode(gTo.get(i)-1, gWeight.get(i)));
            adjacency.get(gTo.get(i)-1).add(new AdjacencyNode(gFrom.get(i)-1, gWeight.get(i)));
        }
        distance[0]=0;
        queue.add(new AdjacencyNode(0, distance[0]));
        while(!queue.isEmpty()) {
//            System.out.println(queue.size()+" -> "+queue.peek().id);
            AdjacencyNode node = queue.poll();
            if (node.id == gNodes-1) {
                break;
            }
            if (visited.contains(node.id)) {
                continue;
            } 
            visited.add(node.id);
            getNeighbors(node.id);
        }
//        System.out.println("---");
//        for (int i=0; i<distance.length; i++) {
//            System.out.println(distance[i]);
//        }
        System.out.println(distance[gNodes-1]==Integer.MAX_VALUE ? "NO PATH EXISTS" : distance[gNodes-1]);
    }
    
    public static void getNeighbors(int id) {
        for (int i=0; i<adjacency.get(id).size(); i++) {
            if (!visited.contains(adjacency.get(id).get(i).id)) {
                AdjacencyNode node = adjacency.get(id).get(i);
                distance[node.id] = Math.min(Math.max(node.weight, distance[id]), distance[node.id]);
                queue.add(new AdjacencyNode(node.id, distance[node.id]));
            }
        }
    }
    
    public static void main(String[] args) {
//        JackGoesToRapture.getCost(5, Arrays.asList(1,3,1,4,2), Arrays.asList(2,5,4,5,3), Arrays.asList(60,70,120,150,80));
//        JackGoesToRapture.getCost(5, Arrays.asList(1,2,3,4,1,3), Arrays.asList(2,3,4,5,3,5), Arrays.asList(30,50,70,90,70, 85));
        JackGoesToRapture.getCost(10, 
                Arrays.asList(1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,5,6,6,6,6,7,7,7,8,8,9),
                Arrays.asList(2,3,4,5,6,7,8,9,10,3,4,5,6,7,8,9,10,4,5,6,7,8,9,10,5,6,7,8,9,10,6,7,8,9,10,7,8,9,10,8,9,10,9,10,10), 
                Arrays.asList(6337,1594,3766,3645,75,5877,8561,242,6386,3331,4194,8069,3934,101,8536,6963,9303,7639,8512,1330,6458,1180,3913,1565,9488,1369,8066,9439,7510,6833,4215,194,4774,4328,187,1196,200,8743,1433,2933,2069,1974,7349,2351,8423));
    }
}
