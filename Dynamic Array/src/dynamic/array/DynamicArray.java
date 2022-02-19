/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> ret = new ArrayList<>();

        for (int i=0; i<n; i++) {
            arr.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        for (List<Integer> q: queries) {
            int idx = (q.get(1)^lastAnswer)%n;
            if (q.get(0) == 1) {
                arr.get(idx).add(q.get(2));
            } else {
                lastAnswer = arr.get(idx).get((q.get(2)%(arr.get(idx).size())));
                ret.add(lastAnswer);
            }
        }
        System.out.println(ret);
        return ret;
    }
}

public class DynamicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> li1 = Arrays.asList(1, 0, 5);
        List<Integer> li2 = Arrays.asList(1, 1, 7);
        List<Integer> li3 = Arrays.asList(1, 0, 3);
        List<Integer> li4 = Arrays.asList(2, 1, 0);
        List<Integer> li5 = Arrays.asList(2, 1, 1);
        
        List<List<Integer>> li = new ArrayList<>();
        li.add(li1);
        li.add(li2);
        li.add(li3);
        li.add(li4);
        li.add(li5);
        
        Result.dynamicArray(2, li);
//        System.out.println(1^7);
    }
    
}
