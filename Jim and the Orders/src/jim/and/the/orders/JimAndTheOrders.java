/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jim.and.the.orders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author wimukthirajapaksha
 */
public class JimAndTheOrders {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        Map<Double, Integer> map = new TreeMap<>();
        int j=1;
        for (List<Integer> i: orders) {
            map.put((double)i.get(0)+i.get(1)+(j/Math.pow(10, 6)), j);
            j++;
        }
        System.out.println(map);
        Iterator<Map.Entry<Double, Integer>> it = map.entrySet().iterator();
        List<Integer> ret = new ArrayList<>();
        while(it.hasNext()) {
            ret.add(it.next().getValue());
        }
        System.out.println(ret);
        return ret;
    }
    
    public static void main(String[] args) {
        JimAndTheOrders.jimOrders(Arrays.asList(
            Arrays.asList(8, 1), 
            Arrays.asList(4, 2), 
            Arrays.asList(5, 6), 
            Arrays.asList(3, 1), 
            Arrays.asList(4, 3)));
    }
    
}
