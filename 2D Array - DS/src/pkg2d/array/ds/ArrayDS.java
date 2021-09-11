/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d.array.ds;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        int count = -63;
        for (int i=1;i<arr.size()-1;i++) {
            for (int j=1;j<arr.get(0).size()-1;j++) {
                int sum = arr.get(i-1).get(j-1)
                        +arr.get(i-1).get(j)
                        +arr.get(i-1).get(j+1)
                        +arr.get(i).get(j)
                        +arr.get(i+1).get(j-1)
                        +arr.get(i+1).get(j)
                        +arr.get(i+1).get(j+1);
//                System.out.println(sum+"-");
                count = count < sum ? sum : count;
            }
        }
        System.out.println(count);
        return count;
    }

}


public class ArrayDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.hourglassSum(Arrays.asList(Arrays.asList(-9, -9, -9,  1, 1, 1), 
                Arrays.asList(0, -9,  0,  4, 3, 2),
                Arrays.asList(-9, -9, -9,  1, 2, 3),
                Arrays.asList(0,  0,  8,  6, 6, 0),
                Arrays.asList(0,  0,  0, -2, 0, 0),
                Arrays.asList(0,  0,  1,  2, 4, 0)
                ));
    }
    
}
