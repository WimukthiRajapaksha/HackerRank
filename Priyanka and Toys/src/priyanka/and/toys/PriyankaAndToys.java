/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priyanka.and.toys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class PriyankaAndToys {

    /**
     * @param args the command line arguments
     */
    
    public static int toys(List<Integer> w) {
        Collections.sort(w);
        int i=w.get(0);
        int count = 1;
        for (int j=0; j<w.size(); j++) {
            if (i+4<w.get(j)) {
                i=w.get(j);
                count+=1;
            }
        }
        System.out.println(count);
        return count;
    }
    
    public static void main(String[] args) {
        PriyankaAndToys.toys(Arrays.asList(1, 2, 3, 21, 7, 12, 14, 21));
        PriyankaAndToys.toys(Arrays.asList(1, 2, 3, 4, 5, 10, 11, 12, 13));
    }
    
}
