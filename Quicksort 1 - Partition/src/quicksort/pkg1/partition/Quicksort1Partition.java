/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort.pkg1.partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
        int min = arr.get(0);
        int index = 0;
//        int maxIndex = 0;
        for (int i=1;i<arr.size();i++) { // 4, 5, 3, 7, 2
            if (arr.get(i)<min) {
                int temp = arr.get(i);
                for (int j=i-1;j>=index;j--) {
                    arr.set(j+1, arr.get(j));
                }
                arr.set(index, temp);
                index++;
            } else if (arr.get(i)==min) {
                int temp = arr.get(i);
                for (int j=i-1;j>=index;j--) {
                    arr.set(j+1, arr.get(j));
                }
                arr.set(index, temp);
                index++;
            } else {
//                arr.set(maxIndex+1, arr.get(i));
//                maxIndex++;
            }
            
        }
        System.out.println(arr);
        return arr;
        
//        int pivot = arr.get(0);
//        List<Integer> min = new ArrayList<>();
//        List<Integer> equal = new ArrayList<>();
//        List<Integer> max = new ArrayList<>();
//        for (int i: arr) {
//            if (i<pivot) {
//                min.add(i);
//            } else if (i==pivot) {
//                equal.add(i);
//            } else {
//                max.add(i);
//            }
//        }
//        List<Integer> newList = new ArrayList<>();
//        Stream.of(min, equal, max).forEach(newList::addAll);
//        System.out.println(newList);
//        return newList;
    }

}


public class Quicksort1Partition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.quickSort(Arrays.asList(4, 5, 3, 7, 2));
    }
    
}
