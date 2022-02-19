/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.full.counting.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author wimukthirajapaksha
 */
public class TheFullCountingSort {

    /**
     * @param args the command line arguments
     */
//    USING SOUNTSORT METHOD, having rimeout issue though
    public static void countSort(List<List<String>> arr) {
        int[] individualCount = new int[arr.size()];
        for (int i=0; i<arr.size(); i++) {
            if (i<arr.size()/2) {
                arr.get(i).set(1, "-");
            }
            individualCount[Integer.parseInt(arr.get(i).get(0))+1]++;
        }
        for (int i=1; i<individualCount.length; i++) {
            individualCount[i]+=individualCount[i-1];
        }
        String[] returnList = new String[arr.size()];
        List<String> li;
        for (int i=0; i<arr.size(); i++) {
            li = arr.get(i);
            returnList[individualCount[Integer.parseInt(li.get(0))]] = li.get(1);
            individualCount[Integer.parseInt(li.get(0))]++;
        }
        
//        try {    
//            BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
//
//            log.write("This will be printed on stdout!\n");
//            log.flush();
//          }
//          catch (Exception e) {
//            e.printStackTrace();
//          }
//        
////      ------------------------------------------------------------------------
//
//
////        for (int i=0; i<returnList.length; i++) { 521170
//////            str.append(returnList[i]+" ");
////            System.out.print(returnList[i]+" ");
////        }
////        System.out.println(str);
//
////      ------------------------------------------------------------------------
//
        StringBuilder str = new StringBuilder(); // 321176
        for (int i=0; i<returnList.length; i++) {
            str.append(returnList[i]).append(" ");
        }
        System.out.println(str);
//
////      ------------------------------------------------------------------------
//
//        StringBuffer str = new StringBuffer();
////        String s = "";
//        for (int i=0; i<returnList.length; i++) {
////            s+=returnList[i]+" ";
//            str.append(returnList[i]+" ");
////            System.out.print(returnList[i]+" ");
//        }
////        str.append(s);
//        System.out.println(str);


    }
    public static void main(String[] args) throws IOException {
        List<List<String>> list = new ArrayList<>();
        
        list.add(new ArrayList<String>(Arrays.asList("0", "ab")));
        list.add(new ArrayList<String>(Arrays.asList("6", "cd")));
        list.add(new ArrayList<String>(Arrays.asList("0", "ef")));
        list.add(new ArrayList<String>(Arrays.asList("6", "gh")));
        list.add(new ArrayList<String>(Arrays.asList("4", "ij")));
        list.add(new ArrayList<String>(Arrays.asList("0", "ab")));
        list.add(new ArrayList<String>(Arrays.asList("6", "cd")));
        list.add(new ArrayList<String>(Arrays.asList("0", "ef")));
        list.add(new ArrayList<String>(Arrays.asList("6", "gh")));
        list.add(new ArrayList<String>(Arrays.asList("0", "ij")));
        
        list.add(new ArrayList<String>(Arrays.asList("4", "that")));
        list.add(new ArrayList<String>(Arrays.asList("3", "be")));
        list.add(new ArrayList<String>(Arrays.asList("0", "to")));
        list.add(new ArrayList<String>(Arrays.asList("1", "be")));
        list.add(new ArrayList<String>(Arrays.asList("5", "question")));
        list.add(new ArrayList<String>(Arrays.asList("1", "or")));
        list.add(new ArrayList<String>(Arrays.asList("2", "not")));
        list.add(new ArrayList<String>(Arrays.asList("4", "is")));
        list.add(new ArrayList<String>(Arrays.asList("2", "to")));
        list.add(new ArrayList<String>(Arrays.asList("4", "the")));
        long startTime = System.nanoTime();
        TheFullCountingSort.countSort(list);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime/1000000000.0+" -> "+startTime+" "+endTime);
        
        





// LIKE ANSWER IS NOT REQUESTING COUNTING SORT -> USED ALREADY SORTED TREEMAP
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Map<Integer, List<String>> map = new TreeMap<>();
//        int n = Integer.parseInt(bufferedReader.readLine());
//        
//        for (int i=0; i<n; i++) {
//            String [] pair = bufferedReader.readLine().split(" ");
//            int key     = Integer.valueOf(pair[0]);
//            String value   = i<n/2 ? "-" : pair[1];
//            if (!map.containsKey(key)) {
//                map.put(key, new ArrayList<String>(Arrays.asList(value)));
//            } else {
//                List<String> li = map.get(key);
//                li.add(value);
//            }
//            
//        }
//        bufferedReader.close();
//        
//        List<String> li = map.get(0);
//        StringBuilder sb = new StringBuilder();
//        for (int key: map.keySet()) {
//            for (String s: map.get(key)) {
//                sb.append(s).append(" ");
//            }
//        }
//        System.out.println(sb);
    }
    
}
