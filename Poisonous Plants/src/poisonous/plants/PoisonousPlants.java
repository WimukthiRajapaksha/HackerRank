/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poisonous.plants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */
public class PoisonousPlants {

    /**
     * @param args the command line arguments
     */
    
    public static int poisonousPlants(List<Integer> p) {
        Stack<int[]> stack = new Stack<>();
        int maxDay = 0;
        for (int i: p) {
            int day = 0;
            while(!stack.isEmpty() && stack.peek()[0]>=i) {
                day = Math.max(day, stack.pop()[1]);
            }
            if (!stack.isEmpty()) {
                day++;
            } else {
                day=0;
            }
            
            maxDay = Math.max(day, maxDay);
            stack.push(new int[]{i, day});
            for (int[] s: stack) {
                System.out.print(s[0]+" "+s[1]+" , ");
            }
            System.out.println(maxDay+" ");
        }
        return maxDay;
    }
    
    public static void main(String[] args) {
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(6, 5, 8, 4, 7, 10, 9)));
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(3, 2, 5, 4)));
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(4, 3, 7, 5, 6, 4, 2)));
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(5, 4, 3, 2, 1, 100, 200, 200, 20)));
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(1, 4, 7, 6, 2)));
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(12, 20, 21, 23)));
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(403, 1048, 15780, 14489, 15889, 18627, 13629, 13706, 16849,
//                13202, 10192, 17323, 4904, 6951, 16954, 5568, 4185, 7929, 8860, 14945, 3764, 4972, 13476, 14330, 1174, 18952, 10087,
//                10863, 9543, 12802, 1607, 9354, 13127, 920)));
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(6, 5, 8, 4, 7, 10, 9, 5)));
        
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(2, 7, 6, 3, 8, 7, 6, 5, 4, 8, 6, 4, 3, 2, 1)));
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(2, 7, 6, 5, 4, 3, 6, 4, 3, 2, 1)));
        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(1,2,3,4,2)));
//        System.out.println(PoisonousPlants.poisonousPlants(Arrays.asList(20, 5, 6, 15, 2, 2, 17, 2, 11, 5, 14, 5, 10, 9, 19, 12, 5)));
    }
}
