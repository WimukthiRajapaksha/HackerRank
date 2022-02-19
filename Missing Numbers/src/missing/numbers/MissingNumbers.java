/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missing.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wimukthirajapaksha
 */
public class MissingNumbers {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> list = new ArrayList<>();
        int[] a = new int[100];
        int min = Integer.MAX_VALUE;
        for (int i: brr) {
            a[i%101]++;
            if (i<min) {
                min = i;
            }
        }
        for (int i: arr) {
            a[i%101]--;
        }
        for (int i=0; i<a.length; i++) {
            if (a[i]>0) {
                list.add((min/101)*101+i);
            }
        }
        System.out.println(list);
        return list;
        
//        ALTERNATE USING ARRAY
//        List<Integer> list = new ArrayList<>();
//        int[] a = new int[10001];
//        
//        for (int i: brr) {
//            a[i]++;
//        }
//        for (int i: arr) {
//            a[i]--;
//        }
//        for (int i=0; i<a.length; i++) {
//            if (a[i]>0) {
//                list.add(i);
//            }
//        }
//        System.out.println(list);
//        return list;
        
        
//        ALTERNATE USING MAP
//        List<Integer> list = new ArrayList<>();
//        Map<Integer, Integer> mapI = new HashMap<>();
//        Map<Integer, Integer> mapJ = new HashMap<>();
//        
//        for (int i=0; i<Math.max (arr.size(), brr.size()); i++) {
//            if (i<arr.size()) {
//                if (mapI.containsKey(arr.get(i))) {
//                    mapI.put(arr.get(i), mapI.get(arr.get(i))+1);
//                } else {
//                    mapI.putIfAbsent(arr.get(i), 1);
//                }
//                
//            }
//            if (i<brr.size()) {
//                if (mapJ.containsKey(brr.get(i))) {
//                    mapJ.put(brr.get(i), mapJ.get(brr.get(i))+1);
//                } else {
//                    mapJ.putIfAbsent(brr.get(i), 1);
//                }
//                
//            }
//        }
//        System.out.println(mapI);
//        System.out.println(mapJ);
//        for (int k: mapJ.keySet()) {
//            if (mapI.containsKey(k)) {
//                if (!mapI.get(k).equals(mapJ.get(k))) {
//                    list.add(k);
//                }
//            } else {
//                list.add(k);
//            }
//        }
//        System.out.println(list);
//        return list;
    }
    
    public static void main(String[] args) {
//        for (int i=832; i<935; i++) {
//            System.out.print((i%100)+"-"+i+" ");
//        }
        List<Integer> arr = new ArrayList<>(Arrays.asList(214, 215, 216, 217, 218, 214, 215, 216));
        List<Integer> brr = new ArrayList<>(Arrays.asList(214, 215, 216, 217, 215, 218, 216, 215, 216, 214));
        MissingNumbers.missingNumbers(arr, brr);
        System.out.println(203%101);

//        List<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, 3, 6, 7, 8, 5, 4, 5, 6));
//        List<Integer> brr = new ArrayList<>(Arrays.asList(3, 4, 4, 5, 6, 7, 5, 8, 3, 6, 5, 6, 4));
//        MissingNumbers.missingNumbers(arr, brr);
    }
    
}
