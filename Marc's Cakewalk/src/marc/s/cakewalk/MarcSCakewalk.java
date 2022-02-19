/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marc.s.cakewalk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class MarcSCakewalk {

    /**
     * @param args the command line arguments
     */
    
    public static long marcsCakewalk(List<Integer> calorie) {
        Collections.sort(calorie);
        Collections.reverse(calorie);
        long min = 0;
        for (int i=0; i<calorie.size(); i++) {
            min+=calorie.get(i)*Math.pow(2, i);
        }
        System.out.println(min);
        return min;
    }
    
    public static void main(String[] args) {
        MarcSCakewalk.marcsCakewalk(Arrays.asList(7, 4, 9, 6));
    }
    
}
