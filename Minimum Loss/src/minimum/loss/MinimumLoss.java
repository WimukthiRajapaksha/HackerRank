/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimum.loss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author wimukthirajapaksha
 */
public class MinimumLoss {

    /**
     * @param args the command line arguments
     */
    
    public static int minimumLoss(List<Long> price) {
        Set<Long> set = new TreeSet<>();
        for (long i: price) {
            set.add(i);
        }
        System.out.println(set);
        int min = Integer.MAX_VALUE;
        Iterator<Long> it = set.iterator();
        long prev = 0l;
        if (it.hasNext()) {
            prev = it.next();
        }
        while(it.hasNext()) {
            long curr = it.next();
            if (min>curr-prev && price.lastIndexOf(curr)<price.indexOf(prev)) {
                min = (int)(curr-prev);
            }
            prev = curr;
        }
        System.out.println(min);
        return 0;
        
        
//        ALTERNATE
//        List<Long> temp = new ArrayList<>(price);
//        Collections.sort(price);
//        int min = Integer.MAX_VALUE;
//        for (int i=0; i<price.size()-1; i++) {
//            if (price.get(i+1)-price.get(i)<min && price.get(i+1)-price.get(i)>0 && temp.indexOf(price.get(i))>temp.lastIndexOf(price.get(i+1))) {
//                min = (int)(price.get(i+1)-price.get(i));
//            }
//        }
//        return min;
    }
    
    public static void main(String[] args) {
        List<Long> list = Arrays.asList((long)20, (long)7, (long)8, (long)8, (long)2, (long)5);
        MinimumLoss.minimumLoss(list);
    }
}
