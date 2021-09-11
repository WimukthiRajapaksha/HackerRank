/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package running.time.of.algorithms;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
class Result {

    /*
     * Complete the 'runningTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int runningTime(List<Integer> arr) {        
        int count = 0;
        for (int i=0;i<arr.size();i++){
            int element = arr.get(i);
            int j=i-1;
            while(j>=0 && arr.get(j)>element) {
                arr.set(j+1, arr.get(j));
                count++;
                j--;
            }
            arr.set(j+1, element);
        }
        return count;
    }
}

public class RunningTimeOfAlgorithms {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        Result.runningTime(Arrays.asList(2, 1, 3, 1, 2));
    }
    
}
