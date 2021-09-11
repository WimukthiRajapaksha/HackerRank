/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ema.s.supercomputer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {
    public static int twoPluses(List<String> grid) {
//        List<int[]> inde = new ArrayList<>();
//        int total = 1;
//        for (int k=grid.size()/2;k>0;k--) {
//            for (int i=k;i<grid.size()-k;i++) {
//                for (int j=k;j<grid.get(i).length()-k;j++) {
//                    for (int l=0;l<k;l++) {
//                        if (!inde.contains(new int[]{i,j})) {
//                            if (grid.get(i).charAt(j) == 'G' 
//                                    && grid.get(i-k).charAt(j) == 'G' 
//                                    && grid.get(i+k).charAt(j) == 'G' 
//                                    && grid.get(i).charAt(j-k) == 'G' 
//                                    && grid.get(i).charAt(j+k) == 'G') {
//                                inde.add(new int[]{i,j});
//                                total *= (k*4)+1;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(total);

        int total = 1;
        int totalCount = 0;
        for (int i=0;i<grid.size();i++) {
            for (int j=i;j<grid.get(i).length()-i;j++) {
                for (int l=grid.size()/2;l>0;l--) {
                    if (i-l>0 && j-l>0 && i+l<grid.size() && j+l<grid.get(i).length() && grid.get(i).charAt(j) == 'G' 
                            && grid.get(i-l).charAt(j) == 'G' 
                            && grid.get(i+l).charAt(j) == 'G' 
                            && grid.get(i).charAt(j-l) == 'G' 
                            && grid.get(i).charAt(j+l) == 'G' && totalCount<=2) {
                        total *= (l*4)+1;
                        totalCount += 1;
                    }
                }
            }
        }
        System.out.println(total);
        return 0;
    }
}

public class EmaSSupercomputer {
    public static void main(String[] args) {
        List<String> lis = Arrays.asList("BGBBGB", "GGGGGG", "BGBBGB", "GGGGGG", "BGBBGB", "BGBBGB");
        Result.twoPluses(lis);
    }
}
