/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronous.shopping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class SynchronousShopping {

    /**
     * @param args the command line arguments
     */
    
    static class Node {
        int id;
        int weight;

        public Node(int id, int weight) {
            this.id = id;
            this.weight = weight;
        }
    }
    
    public static int shop(int n, int k, List<String> centers, List<List<Integer>> roads) {
        List<List<Node>> adjList = new ArrayList<>();
        String[] centersBit = new String[centers.size()];
        
        for (int i=0; i<centers.size(); i++) {
            String[] s = centers.get(i).split(" ");
            for (int j=0; j<s.length; j++) {
                centersBit[j-1]=Integer.toBinaryString(Integer.valueOf(s[j]));
            }
        }
        for (List<Node> nn: adjList) {
            for (Node d: nn) {
                System.out.print(d.id+" "+d.types.length);
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        SynchronousShopping.shop(5, 5, Arrays.asList("1 1", "1 2", "1 3", "1 4", "1 5"), 
            Arrays.asList(
                    Arrays.asList(1,2,3),
                    Arrays.asList(1,3,10),
                    Arrays.asList(2,4,10),
                    Arrays.asList(3,5,10),
                    Arrays.asList(4,5,10)
            )
        );
    }
    
}
