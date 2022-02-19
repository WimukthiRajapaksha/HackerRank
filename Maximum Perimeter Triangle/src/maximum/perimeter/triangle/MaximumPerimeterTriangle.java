/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximum.perimeter.triangle;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class MaximumPerimeterTriangle {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        Collections.sort(sticks, Collections.reverseOrder());
        System.out.println(sticks);
        for (int i=0; i<sticks.size()-2; i++) {
            if (sticks.get(i+1)+sticks.get(i+2)>sticks.get(i)) {
                return Arrays.asList(sticks.get(i+2), sticks.get(i+1), sticks.get(i));
            }
        }
        return Arrays.asList(-1);
    }
    
    public static void main(String[] args) {
        List<Integer> li = MaximumPerimeterTriangle.maximumPerimeterTriangle(Arrays.asList(1, 1, 1, 2, 3, 5));
        System.out.println(li);
    }
}
