/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ema.s.supercomputer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Result {
    
    public static int arrangeGrid(List<String> grid, int length) {
        System.out.println("length ->"+length);
        System.out.println("grid ->>"+grid);
        Map<Integer, ArrayList<String>> map = new TreeMap<>(Collections.reverseOrder());
        for (int i=1; i<grid.size(); i++) {
            for (int j=1; j<grid.get(i).length(); j++) {
                if (grid.get(i).charAt(j) == 'G') {
                    int k=0;
                    while(true) {
                        if (i-k>=0 && i+k<grid.size() && j-k>=0 && j+k<grid.get(i).length() &&
                                grid.get(i).charAt(j-k)=='G' && grid.get(i).charAt(j+k)=='G' && grid.get(i-k).charAt(j)=='G' && grid.get(i+k).charAt(j)=='G') {
                            if (map.containsKey(k)) {
                                ArrayList<String> list = map.get(k);
                                list.add(i+" "+j);
                                map.put(k, list);
                            } else {
                                ArrayList<String> list = new ArrayList<>();
                                list.add(i+" "+j);
                                map.put(k, list);
                            }
                            k++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(map+" -> map");
        
        if (map.isEmpty()) {
            return 0;
        }
        int max = 0;
        if (length==0) {
            int key = (int)map.keySet().toArray()[0];
            return 4*key + 1;
        }
        for (int key: map.keySet()) {
            ArrayList<String> val = map.get(key);
            for (String s: val) {  
                int first = 4*key + 1;
                System.out.println(length+" length");
                int r = Integer.parseInt(s.split(" ")[0]);
                int c = Integer.parseInt(s.split(" ")[1]);
                System.out.println(s);
                List<String> temp = new ArrayList<>(grid);
                for (int i=r-key; i<r+key+1; i++) {
                    if (i==r) {
                        char[] cha = grid.get(i).toCharArray();
                        for (int j=c-key; j<c+key+1; j++) {
                            cha[j] = 'B';
                        }
                        System.out.println(cha);
                        temp.set(i, String.valueOf(cha));
                    } else {
                        char[] cha = grid.get(i).toCharArray();
                        cha[c] = 'B';
                        temp.set(i, String.valueOf(cha));
                    }
                }
                System.out.println("recursion"+length);
                int currentSum = first * arrangeGrid(temp, length-1);
                max = max < currentSum ? currentSum : max;
            }
        }
        return max;
    }
    
    public static int twoPluses(List<String> grid) {
        System.out.println(grid);
        int maxAnswer = arrangeGrid(grid, 1);
        System.out.println(maxAnswer);
        return maxAnswer;
    }
}

public class EmaSSupercomputer {
    public static void main(String[] args) {
//        Result.twoPluses(Arrays.asList("BGBBGB", "GGGGGG", "BGBBGB", "GGGGGG", "BGBBGB", "BGBBGB"));

//        Result.twoPluses(Arrays.asList("BGBBGB", "GGGGBG", "BGBBGB", "GBGGGG", "BGBBGB", "BGBBGB"));
        
//        Result.twoPluses(Arrays.asList("GGGGGG", "GBBBGB", "GGGGGG", "GGBBGB", "GGGGGG"));
        
//        Result.twoPluses(Arrays.asList("BGGBGB", "GGGGGG", "GGGGGG", "GGGGGG", "BGGBGB", "BGBBGB"));
        Result.twoPluses(Arrays.asList("BBBGBGBBB", "BBBGBGBBB", "BBBGBGBBB", "GGGGGGGGG", "BBBGBGBBB", "BBBGBGBBB", "GGGGGGGGG", "BBBGBGBBB", "BBBGBGBBB", "BBBGBGBBB"));
    }
}

//BGGBGB
//GGGGGG
//GGGGGG
//GGGGGG
//BGGBGB
//BGBBGB



//BGBBGB
//GGGGGG
//BGBBGB
//GGGGGG
//BGBBGB
//BGBBGB
