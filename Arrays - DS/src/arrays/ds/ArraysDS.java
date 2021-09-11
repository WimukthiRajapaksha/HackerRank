/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.ds;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        for (int i=0;i<a.size()/2;i++){
            int temp = a.get(i);
            a.set(i, a.get(a.size()-1-i));
            a.set(a.size()-1-i, temp);
        }
        System.out.println(a);
        return a;
    }

}
public class ArraysDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.reverseArray(Arrays.asList(2, 3, 4, 1, 0));
        Result.reverseArray(Arrays.asList(1, 4, 3, 2));
    }
    
}
