/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luck.balance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class LuckBalance {

    /**
     * @param args the command line arguments
     */
    
    public static int luckBalance(int k, List<List<Integer>> contests) {
        Collections.sort(contests, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return -o1.get(0)+o2.get(0);
            }
        });
        System.out.println(contests);
        int sum=0;
        int j=0;
        for (List<Integer> i: contests) {
            if (i.get(1)==0) {
                sum+=i.get(0);
            } else if (j<k) {
                sum+=i.get(0);
                j++;
            } else {
                sum-=i.get(0);
            }
            System.out.println(sum);
        }
        System.out.println(sum);
        return sum;
        
//        ALTERNATE
//        int sum=0;
//        List<Integer> temp = new ArrayList<>();
//        for (List<Integer> i: contests) {
//            if (i.get(1)==0) {
//                sum+=i.get(0);
//            } else {
//                temp.add(i.get(0));
//            }
//        }
//        System.out.println(sum);
//        Collections.sort(temp);
//        for (int i=0; i<Math.max(temp.size()-k, 0); i++) {
//            sum-=temp.get(i);
//        }
//        for (int i=Math.max(temp.size()-k, 0); i<temp.size(); i++) {
//            sum+=temp.get(i);
//        }
//        System.out.println(temp);
//        System.out.println(sum);
//        return 0;
    }
    
    public static void main(String[] args) {
        LuckBalance.luckBalance(3, Arrays.asList(
                Arrays.asList(5, 1), 
                Arrays.asList(2, 1), 
                Arrays.asList(1, 1), 
                Arrays.asList(8, 1),
                Arrays.asList(10, 0), 
                Arrays.asList(5, 0)));
    }
    
}
