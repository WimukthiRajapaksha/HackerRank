/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars.exploration;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if ((i%3==0 || i%3==2) && s.charAt(i)!='S') {
                count++;
            } else if (i%3==1 && s.charAt(i)!='O') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}

public class MarsExploration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.marsExploration("SOSSPSSQSSOR");
    }
    
}
