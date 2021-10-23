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
        List<List<Integer>> returnList = new ArrayList<>();
        
        List<Integer> ansArr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            returnList.add(ansArr);
        }
        int la = 0;
        int li = 0;
        for (int i=0; i<queries.size(); i++) {
            if (queries.get(i).get(0) == 1) {
                int val = queries.get(i).get(2);
                List<Integer> temp = returnList.get(i);
                temp.add(val);
                System.out.println(" - - - "+(queries.get(i).get(1)^la)%n);
                returnList.add((queries.get(i).get(1)^la)%n, temp);
//                returnList.set((queries.get(i).get(1)^la)%n, queries.get(i).get(2));
            } else {
                int temp = returnList.get((returnList.get(i).get(1)^la)%n).get(2);
//                returnList.get((queries.get(i).get(1)^la)%n).get(queries.get(i).get(2));
                System.out.println(returnList.get(i) + "temp -"+temp);
                ansArr.add(temp);
                la = temp;
            }
            System.out.println(returnList);
            System.out.println((queries.get(i).get(1)^la)%n+ " " + queries.get(i).get(2) + " -------" + la);
            
        }
        System.out.println(returnList);
        return ansArr;
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
        System.out.println(1^7);
    }
    
}
