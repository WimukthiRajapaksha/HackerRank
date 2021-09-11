/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.in.a.string;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
        boolean match = s.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*");
        System.out.println(match);
        return match ? "YES" : "NO";
    }

}

public class HackerRankInAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.hackerrankInString("hhhha");
        Result.hackerrankInString("afqifnqhqgqrohgfqaqgirogfqcgqirhhgqk580252etwrogirqt28305tgiqhargpqnqgjriqk---");
        Result.hackerrankInString("hhaaaaccccvhuuiwvrkuhwiughwr");
        String resu = String.join("-", "asadfua");
        System.out.println(resu);
    }
    
}
