/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.to.tutorial.challenges;

import java.util.Arrays;
import java.util.List;


class Result {

    public static int introTutorial(int V, List<Integer> arr) {
        int returnIn = 0;
        for (int i=0;i<arr.size(); i++) {
            if (arr.get(i)==V) {
                returnIn = i;
            }
        }
        System.out.println(returnIn);
        return returnIn;
    }

}

public class IntroToTutorialChallenges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 4, 5, 7, 9, 12);
        Result.introTutorial(4, arr);
    }
    
}
