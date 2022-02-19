/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest.permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author wimukthirajapaksha
 */
public class LargestPermutation {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        int[] list = new int[arr.size()];
        for (int i=0; i<arr.size(); i++) {
            list[i]=arr.get(i);
        }
        int[] temp = list.clone();
        Arrays.sort(temp);
        int i=0;
        while(k>0 && i<temp.length) {
            System.out.println(k);
            if (list[i]!=temp[temp.length-1-i]) {
                int v = list[i];
                list[i] = temp[temp.length-1-i];
                for (int l=i+1; l<list.length; l++) {
                    if (list[l]==list[i]) {
                        list[l]=v;
                        break;
                    }
                }
                k--;
            }
            i++;
        }
        List<Integer> ret = new ArrayList<>();
        for (int m=0; m<list.length; m++) {
            System.out.print(list[m]+" ");
            ret.add(list[m]);
        }
        return ret;
    }
    
    public static void main(String[] args) throws IOException {
//        LargestPermutation.largestPermutation(1, Arrays.asList(1,2,3,4));
//        LargestPermutation.largestPermutation(1, Arrays.asList(4, 2, 3, 5, 1));
        LargestPermutation.largestPermutation(1, Arrays.asList(2, 2, 2, 5, 1));
    }
}
