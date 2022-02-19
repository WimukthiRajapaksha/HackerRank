/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lily.s.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author wimukthirajapaksha
 */
public class LilySHomework {

    /**
     * @param args the command line arguments
     */
    
//    {17=2, 13=4, 10=0, 14=3, 11=1, 16=5, 15=6, 12=7}
    
    public static int lilysHomework(List<Integer> arr) {
        int[] arrForOrdered = new int[arr.size()];
        int[] arrForReversed = new int[arr.size()];
        int[] sortedArr = new int[arr.size()];        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.size(); i++) {
            arrForOrdered[i] = arr.get(i);
            arrForReversed[i] = arr.get(i);
            sortedArr[i] = arr.get(i);
            map.put(arr.get(i), i);
        }
        Map<Integer, Integer> revMap = new HashMap<>(map);
        Arrays.sort(sortedArr);
        
        int count = 0;
        int countRev = 0;
        
        int[] rev = new int[arr.size()];
        
        for (int i=0; i<sortedArr.length; i++) {
            rev[sortedArr.length-1-i] = sortedArr[i];
        }
        
        for (int i=0; i<arr.size(); i++) {
            if (arrForOrdered[i]!= sortedArr[i]) {
                int currentInd = map.get(sortedArr[i]);
                map.put(arrForOrdered[i], currentInd);
                int temp = arrForOrdered[i];
                arrForOrdered[i] = sortedArr[i];
                arrForOrdered[currentInd] = temp;
                count++;
            }
            if (arrForReversed[i] != rev[i]) {
                int currentInd = revMap.get(rev[i]);
                revMap.put(arrForReversed[i], currentInd);
                int temp = arrForReversed[i];
                arrForReversed[i] = sortedArr[i];
                arrForReversed[currentInd] = temp;
                countRev++;
            }
        }
        
        System.out.println(count+" - "+countRev);
        return Math.min(count, countRev);
        
        
        
        
        
        
//        List<Integer> temp = new ArrayList<>(arr);
//        List<Integer> sorted = new ArrayList<>(arr);
//        Collections.sort(sorted);
//        List<Integer> reversed = new ArrayList<>(sorted);
//        Collections.reverse(reversed);
//        int cou = 0;
//        int couRev = 0;
//        System.out.println(arr.indexOf(10));
//        System.out.println(sorted);
//        System.out.println(temp);
//        System.out.println(reversed);
//        System.out.println("\n\n\n");
//        for (int i=0; i<arr.size(); i++) {
//            if (arr.get(i) != sorted.get(i)) {
//                int t = arr.get(i);
//                System.out.println(i+" - "+sorted.get(i));
//                
////                System.out.println(arr);
////                System.out.println(sorted.get(i));
//                int ind = arr.indexOf(sorted.get(i));
////                System.out.println(ind+" - "+t);
//                arr.set(ind, t);
//                arr.set(i, sorted.get(i));
////                System.out.println(arr+"\n");
//                cou++;
//            }
//            
//            if (temp.get(i) != reversed.get(i)) {
//                int t = temp.get(i);
//                
//                int ind = temp.indexOf(reversed.get(i));
//                temp.set(ind, t);
//                temp.set(i, reversed.get(i));
////                System.out.println(temp);
//                couRev++;
//            }
//        }
//        System.out.println(cou+" - "+couRev);
//        return Math.min(cou, couRev);
        
        




        
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+" "+ entry.getValue()+" - "+i);
//            if(entry.getKey()!=sortedList.get(i)) {
//                int temp = map.get(entry.getValue());
//                entry = map.
//            }
//            i++;
//        }
//        System.out.println(count);
//        return 0;
//        List<Integer> sorted = new ArrayList<>(arr);
//        List<Integer> rev = new ArrayList<>(arr);
//        Collections.sort(sorted);
//        List<Integer> reversed = new ArrayList<>(sorted);
//        Collections.reverse(reversed);
//        System.out.println(sorted);
//        System.out.println(reversed);
//        int i=0;
//        int countI=0;
//        int countJ=0;
//        while(i<sorted.size()-1) {
//            if (arr.get(i)!=sorted.get(i)) {
//                int k = arr.indexOf(sorted.get(i));
//                int temp = arr.get(k);
//                arr.set(k, arr.get(i));
//                arr.set(i, temp);
//                countI++;
//            }
//            if (rev.get(i)!=reversed.get(i)) {
//                int k = rev.indexOf(reversed.get(i));
//                int temp = rev.get(k);
//                rev.set(k, rev.get(i));
//                rev.set(i, temp);
//                countJ++;
//            }
//            i++;
//        }
//        System.out.println(countI);
//        System.out.println(countJ);
//        return Math.min(countI, countJ);
    }
    
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 5, 3, 1));
        List<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, 2, 5, 1));
//        List<Integer> arr = new ArrayList<>(Arrays.asList(17, 13, 10, 14, 11, 16, 15, 12));
//        List<Integer> arr = new ArrayList<>(Arrays.asList(2,1,6,3,4));
        LilySHomework.lilysHomework(arr);
    }
    
}
