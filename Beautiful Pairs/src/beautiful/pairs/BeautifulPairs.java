/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautiful.pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class BeautifulPairs {

    /**
     * @param args the command line arguments
     */
    
    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);
        
        int i=0;
        int j=0;
        int count = 0;
        while(i<A.size() && j<B.size()) {
            if (!A.get(i).equals(B.get(j))) {
                if (A.get(i)<B.get(j)) {
                    i++;
                } else {
                    j++;
                }
            } else {
                count++;
                i++;
                j++;
            }
        }
        System.out.println((count == Math.min(A.size(), B.size())) ? count-1 : count+1);
        return (count == Math.min(A.size(), B.size())) ? count-1 : count+1;
    }
    
    public static void main(String[] args) {
//        BeautifulPairs.beautifulPairs(Arrays.asList(1,2,2,2,5), Arrays.asList());
        BeautifulPairs.beautifulPairs(Arrays.asList(1,2,2,2,5), Arrays.asList());
    }
    
}
