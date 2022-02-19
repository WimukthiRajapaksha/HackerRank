/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mark.and.toys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class MarkAndToys {

    /**
     * @param args the command line arguments
     */
    
    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);
        int sum=0;
        int i=0;
        while(sum+prices.get(i)<=k) {
            sum+=prices.get(i);
            i++;
        }
        System.out.println(i);
        return 0;
    }
    
    public static void main(String[] args) {
        MarkAndToys.maximumToys(Arrays.asList(1, 12, 5, 111, 200, 1000, 10), 50);
    }
}
