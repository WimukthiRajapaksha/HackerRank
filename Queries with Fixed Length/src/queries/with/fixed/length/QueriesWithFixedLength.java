/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queries.with.fixed.length;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 *
 * @author wimukthirajapaksha
 */
public class QueriesWithFixedLength {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> solve(List<Integer> arr, List<Integer> queries) {
        
        List<Integer> ret = new ArrayList<>();
        for (int i: queries) {
            Queue<Integer> queue = new LinkedList<>();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j=0; j<i; j++) {
                queue.add(arr.get(j));
                if (arr.get(j)>max) {
                    max = arr.get(j);
                }
            }
            min = max;
            for (int j=i; j<arr.size(); j++) {
                queue.add(arr.get(j));
                if (arr.get(j)>max) {
                    max = arr.get(j);
                }
                int temp = queue.poll();
                if (temp==max) {
                    max = Integer.MIN_VALUE;
                    Iterator<Integer> it = queue.iterator();
                    while(it.hasNext()) {
                        max = Math.max(max, it.next());
                    }
                }
//                if (temp==max) {
//                    max = Collections.max(queue);
//                }
                if (min>max) {
                    min = max;
                }
                System.out.println(min+" - "+max);
            }
            System.out.println(min+" min");
            ret.add(min);
        }
        return ret;
    }
    
    public static void main(String[] args) {
        QueriesWithFixedLength.solve(Arrays.asList(33, 1, 44, 11, 55), Arrays.asList(1, 2, 3, 4, 5));
    }
}
