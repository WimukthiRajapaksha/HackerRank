/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlock.and.cost;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class SherlockAndCost {

    /**
     * @param args the command line arguments
     */
    
    public static int cost(List<Integer> B) {
        int prev = B.get(0);
        int up=0;
        int down=0;
        for (int i=1; i<B.size(); i++) {
            int hh = Math.abs(B.get(i)-prev);
            int lh = Math.abs(B.get(i)-1);
            int hl = Math.abs(prev-1);
            
            int temp = Math.max(up+hh, down+lh);
            down = Math.max(up+hl, up);
            up = temp;
            
            prev = B.get(i);
        }
        System.out.println(Math.max(up, down));
        return Math.max(up, down);
    }
    
    public static void main(String[] args) {
//        cost(Arrays.asList(100, 2, 100, 2, 100));
//        cost(Arrays.asList(3, 15, 4, 12, 10));
        cost(Arrays.asList(4, 7, 9));
//        cost(Arrays.asList(1, 2, 3, 4));
    }
}
