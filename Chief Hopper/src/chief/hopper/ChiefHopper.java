/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chief.hopper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class ChiefHopper {

    /**
     * @param args the command line arguments
     */
    
    public static int chiefHopper(List<Integer> arr) {
        double res = 0;
        for (int i=arr.size()-1; i>=0; i--) {
            res = Math.ceil((res+arr.get(i))/2.0);
        }
        System.out.println(res);
        return (int)res;
    }
    
    public static void main(String[] args) {
//        ChiefHopper.chiefHopper(Arrays.asList(3, 4, 3, 2, 4));
        ChiefHopper.chiefHopper(Arrays.asList(2, 3, 7, 5, 4, 8, 2, 6, 1));
//        ChiefHopper.chiefHopper(Arrays.asList(2, 3, 7, 3, 1));
//        ChiefHopper.chiefHopper(Arrays.asList(4, 6, 1));
    }
}
