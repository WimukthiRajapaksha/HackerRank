/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truck.tour;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author wimukthirajapaksha
 */
public class TruckTour {

    /**
     * @param args the command line arguments
     */
    
    static class Node {
        int distance;
        int petrol;

        public Node(int petrol, int distance) {
            this.distance = distance;
            this.petrol = petrol;
        }
    }
    
    public static int truckTour(List<List<Integer>> petrolpumps) {
        long fuel = 0;
        int start = 0;
        for (int i=0; i<petrolpumps.size(); i++) {
            fuel+= petrolpumps.get(i).get(0)-petrolpumps.get(i).get(1);
            if (fuel<0) {
                start = i+1;
                fuel = 0;
            }
        }
        System.out.println(start);
        return start;
    }
    
    public static void main(String[] args) {
        TruckTour.truckTour(Arrays.asList(
            Arrays.asList(1, 5), 
            Arrays.asList(10, 3), 
            Arrays.asList(3, 4)
        ));
//        TruckTour.truckTour(Arrays.asList(
//            Arrays.asList(30, 30),
//            Arrays.asList(1, 1),
//            Arrays.asList(20, 25),
//            Arrays.asList(15, 10)
//            
//        ));
    }
}
