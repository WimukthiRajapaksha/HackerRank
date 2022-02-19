/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permuting.two.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class PermutingTwoArrays {

    /**
     * @param args the command line arguments
     */
    
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());
        System.out.println(A);
        System.out.println(B);
        for (int i=0; i<A.size(); i++) {
            if (A.get(i)+B.get(i)<k) {
                System.out.println("NO");
                return "NO";
            }
        }
        System.out.println("YES");
        return "YES";
    }
    
    public static void main(String[] args) {
        PermutingTwoArrays.twoArrays(10, Arrays.asList(2, 1, 3), Arrays.asList(7, 8, 9));
        PermutingTwoArrays.twoArrays(5, Arrays.asList(1, 2, 2, 1), Arrays.asList(3, 3, 3, 4));
    }
}
