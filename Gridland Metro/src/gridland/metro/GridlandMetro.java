/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridland.metro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author wimukthirajapaksha
 */
public class GridlandMetro {

    /**
     * @param args the command line arguments
     */
    
    public static long gridlandMetro(int n, int m, int k, List<List<Integer>> track) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (List<Integer> t: track) {
            
            if (t.get(1)>t.get(2)) {
                int temp = t.get(1);
                t.set(1, t.get(2));
                t.set(2, temp);
            }
            int[] arr = new int[]{t.get(1), t.get(2)};
            if (map.containsKey(t.get(0))) {
                map.get(t.get(0)).add(arr);
            } else {
                map.put(t.get(0), new ArrayList<>(Arrays.asList(arr)));
            }
        }
        long tempCount = 0;
        for (Map.Entry<Integer, List<int[]>> entry : map.entrySet()) {
            Collections.sort(entry.getValue(), new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0]-o2[0];
                }
            });
            for (int[] en: entry.getValue()) {
                System.out.println(en[0]+" "+en[1]);
            }
//            System.out.println(entry.getValue());
            Stack<int[]> stack = new Stack<>();
            stack.add(entry.getValue().get(0));
            for (int[] val: entry.getValue()) {
                System.out.println(val[0]+" - "+val[1]);
                int[] p = stack.peek();
                if (p[1]>=val[0]) {
                    if (p[1]<val[1]) {
                        p[1]=val[1];
                    }
                    System.out.println("range "+p[0]+" "+p[1]);
                } else {
                    stack.add(val);
                    System.out.println("new "+val[0]+" "+val[1]);
                }
            }
            while(!stack.isEmpty()) {
                int[] p = stack.pop();
                tempCount+=p[1]-p[0]+1;
                System.out.println(p[0]+" . "+p[1]);
            }
        }
        long tot = ((long)n)*((long)m);
        System.out.println(tempCount);
        System.out.println(tot-tempCount);
        return (tot-tempCount);
    }
    
    public static void main(String[] args) {
//        List<Integer> list1 = (Arrays.asList(1, 1, 1));
//        List<Integer> list4 = (Arrays.asList(1, 1, 1));
//        List<Integer> list2 = (Arrays.asList(3, 2, 4));
//        List<Integer> list3 = (Arrays.asList(4, 2, 4));

//        GridlandMetro.gridlandMetro(4, 4, 4, Arrays.asList(list1, list2, list3, list4));

//        List<Integer> list1 = (Arrays.asList(2, 2, 3));
//        List<Integer> list4 = (Arrays.asList(3, 1, 4));
//        List<Integer> list3 = (Arrays.asList(4, 4, 4));
//        
//        GridlandMetro.gridlandMetro(4, 4, 4, Arrays.asList(list1, list3, list4));

//        List<Integer> list1 = (Arrays.asList(1, 1, 3));
//        List<Integer> list4 = (Arrays.asList(1, 5, 6));
//        List<Integer> list2 = (Arrays.asList(1, 2, 5));
//        List<Integer> list3 = (Arrays.asList(4, 2, 4));
//
//        GridlandMetro.gridlandMetro(4, 6, 4, Arrays.asList(list1, list2, list3, list4));

//        List<Integer> list1 = (Arrays.asList(1, 1, 1));
//        List<Integer> list2 = (Arrays.asList(1, 5, 5));
//        List<Integer> list3 = (Arrays.asList(1, 6, 6));
//        List<Integer> list4 = (Arrays.asList(1, 3, 3));
//        List<Integer> list5 = (Arrays.asList(1, 2, 2));
//        List<Integer> list6 = (Arrays.asList(1, 4, 4));
//        List<Integer> list7 = (Arrays.asList(1, 1, 4));
//
//        GridlandMetro.gridlandMetro(3, 6, 4, Arrays.asList(list1, list2, list3, list4, list5, list6, list7));

//        List<Integer> list1 = (Arrays.asList(1, 1, 3));
//        List<Integer> list2 = (Arrays.asList(1, 5, 6));
//        List<Integer> list3 = (Arrays.asList(1, 6, 6));
//        List<Integer> list4 = (Arrays.asList(2, 3, 3));
//        List<Integer> list5 = (Arrays.asList(2, 2, 2));
//        List<Integer> list6 = (Arrays.asList(1, 3, 5));
//        List<Integer> list7 = (Arrays.asList(1, 1, 4));
//
//        GridlandMetro.gridlandMetro(3, 6, 4, Arrays.asList(list1, list2, list3, list4, list5, list6, list7));


//        List<Integer> list1 = (Arrays.asList(1, 9, 6));
//        List<Integer> list2 = (Arrays.asList(1, 3, 6));
//        List<Integer> list3 = (Arrays.asList(1, 2, 4));
//        List<Integer> list4 = (Arrays.asList(1, 1, 1));
//        List<Integer> list5 = (Arrays.asList(1, 7, 7));
//        List<Integer> list6 = (Arrays.asList(1, 4, 5));
//        List<Integer> list7 = (Arrays.asList(1, 1, 8));
//
//        GridlandMetro.gridlandMetro(1, 10, 3, Arrays.asList(list1, list2, list3, list4, list5, list6, list7));

        List<Integer> list1 = (Arrays.asList(4, 5, 7));
        List<Integer> list2 = (Arrays.asList(1, 1, 2));
        List<Integer> list3 = (Arrays.asList(1, 4, 4));
        List<Integer> list4 = (Arrays.asList(2, 1, 2));
        List<Integer> list5 = (Arrays.asList(2, 2, 3));
        List<Integer> list6 = (Arrays.asList(2, 4, 5));
        List<Integer> list7 = (Arrays.asList(4, 1, 2));
        List<Integer> list8 = (Arrays.asList(4, 4, 5));
        GridlandMetro.gridlandMetro(4, 7, 3, Arrays.asList(list1, list2, list3, list4, list5, list6, list7, list8));
        
        System.out.println((long)(Integer.MAX_VALUE*Integer.MAX_VALUE));
        System.out.println((long)Integer.MAX_VALUE*(long)Integer.MAX_VALUE);
        System.out.println(((long)Integer.MAX_VALUE)*((long)Integer.MAX_VALUE));        
    }
}
