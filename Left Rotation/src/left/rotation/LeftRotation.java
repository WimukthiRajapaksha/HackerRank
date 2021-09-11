/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package left.rotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int[] returnArray = new int[arr.size()];
        for (int i = 0; i<arr.size(); i++) {
            returnArray[(i+arr.size()-d)%arr.size()] = arr.get(i);
//            if (i-(d%arr.size())<0) {
//                returnArray[arr.size()+i-(d%arr.size())] = arr.get(i);
//            } else {
//                returnArray[i-(d%arr.size())] = arr.get(i);
//            }
        }
        List<Integer> returnList = new ArrayList<>();
        for (int i: returnArray) {
            returnList.add(i);
        }
        System.out.println(returnList);
        return returnList;
    }

}

public class LeftRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] abc = {1, 2, 3, 4, 5};
        Result.rotateLeft(4, Arrays.asList(1, 2, 3, 4, 5));
        Result.rotateLeft(4, Arrays.asList(1, 1, 1, 4, 5));
        Result.rotateLeft(2, Arrays.asList(1, 2, 3, 4, 5));
        Result.rotateLeft(4, Arrays.asList(1, 2, 3, 4, 5));
    }
    
}
