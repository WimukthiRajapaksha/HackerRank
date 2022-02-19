/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice.cream.parlor;

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
public class IceCreamParlor {

    /**
     * @param args the command line arguments
     */
    
//    public static void merge(List<Integer> left, List<Integer> right, List<Integer> arr) {
//        int i=0;
//        int j=0;
//        int k=0;
//        while(i<left.size() && j<right.size()) {
//            if (left.get(i)<right.get(j)) {
//                arr.set(k, left.get(i));
//                i++;
//                k++;
//            } else {
//                arr.set(k, right.get(j));
//                j++;
//                k++;
//            }
//        }
//        while(i<left.size()) {
//            arr.set(k, left.get(i));
//            i++;
//            k++;
//        }
//        while(j<right.size()) {
//            arr.set(k, right.get(j));
//            j++;
//            k++;
//        }
//    }
//    
//    public static void sort(List<Integer> arr) {
//        if (arr.size() < 2) {
//            return;
//        }
//        int mid = arr.size()/2;
//        List<Integer> left = new ArrayList<>(arr.subList(0, mid));
//        List<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));
//        IceCreamParlor.sort(left);
//        IceCreamParlor.sort(right);
//        IceCreamParlor.merge(left, right, arr);
//    }
    
//    public static int binarySearch(List<Integer> arr, int left, int right, int value) {
//        int mid = (left+right)/2;
//        while(left<=right) {
//            mid = (left+right)/2;
//            if (value == arr.get(mid)) {
//                return mid;
//            } else if (arr.get(mid)<value) {
//                left = mid+1;
//            } else {
//                right = mid-1;
//            }
//            
//        }
//        return -1;
//    }
    
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        System.out.println(map);
        for (int i=0; i<arr.size(); i++) {
            if (map.containsKey(m-arr.get(i))) {
                list.addAll(Arrays.asList(map.get(m-arr.get(i)), i+1));
                break;
            } else {
                map.put(arr.get(i), i+1);
            }
        }
        System.out.println(list);
        return list;
        
//        List<Integer> list = new ArrayList<>();
//        for (int i=0; i<arr.size()-1; i++) {
//            
//            for (int j=i+1; j<arr.size(); j++) {
//                if (arr.get(j)==m-arr.get(i)) {
//                    list.addAll(Arrays.asList(i+1, j+1));
//                    break;
//                }
//            }
//            if (list.size()==2) {
//                break;
//            }
//        }
//        System.out.println(list);
//        return list;
    }
    
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 4, 5, 3, 2);
//        IceCreamParlor.icecreamParlor(5, list);
        
        List<Integer> list = Arrays.asList(2, 2, 4, 3);
        IceCreamParlor.icecreamParlor(4, list);
    }
    
}
