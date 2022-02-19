/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerland.radio.transmitters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class HackerlandRadioTransmitters {

    /**
     * @param args the command line arguments
     */
    
    public static int hackerlandRadioTransmitters(List<Integer> x, int k) {
        Collections.sort(x);
        int count = 0;
        int middle = Integer.MIN_VALUE;
        for (int i=0; i<x.size(); i++) {
            if (middle+k<x.get(i)) {
                int temp = x.get(i)+k;
                while(!x.contains(temp)) {
                    temp--;
                }
                middle = temp;
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    
    public static void main(String[] args) {
        HackerlandRadioTransmitters.hackerlandRadioTransmitters(Arrays.asList(1, 2, 3, 4, 5), 1);
        HackerlandRadioTransmitters.hackerlandRadioTransmitters(Arrays.asList(7, 2, 4, 6, 5, 9, 12, 11), 2);
        HackerlandRadioTransmitters.hackerlandRadioTransmitters(Arrays.asList(1, 2, 3, 5, 9), 1);
    }
    
}
