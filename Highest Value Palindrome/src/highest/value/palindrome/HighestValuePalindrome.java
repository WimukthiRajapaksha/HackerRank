/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highest.value.palindrome;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'highestValuePalindrome' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER n
     *  3. INTEGER k
     */

    public static String highestValuePalindrome(String s, int n, int k) {
        int unmatching = 0;
        for (int i=0; i<s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                unmatching++;
            }
        }
        if (k<unmatching) {
            return "-1";
        }
        char[] arr = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<=j) {
            if (k<=0) {
                break;
            }
            if (s.charAt(i) == s.charAt(j)) {
                if (k>=unmatching+2 && s.charAt(i) != '9') {
                    arr[i] = '9';
                    arr[j] = '9';
                    k-=2;
                }
            } else if (k>=unmatching+1) {
                if (s.charAt(i) != '9') {
                    arr[i] = '9';
                    k--;
                }
                if (s.charAt(j) != '9') {
                    arr[j] = '9';
                    k--;
                }
                unmatching--;
            } else {
                if (s.charAt(i)>s.charAt(j)) {
                    arr[j] = s.charAt(i);
                } else {
                    arr[i] = s.charAt(j);
                }
                k--;
                unmatching--;
            }
            if (i==j && k==1) {
                arr[i] = '9';
            }
            i++;
            j--;
        }
        return String.valueOf(arr);
    }
}

public class HighestValuePalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Result.highestValuePalindrome("232", 3, 2)+"\n\n\n");
//        System.out.println(Result.highestValuePalindrome("092282", 6, 2)+"\n\n\n");
//        System.out.println(Result.highestValuePalindrome("0011", 4, 4)+"\n\n\n");
//        System.out.println(Result.highestValuePalindrome("12344321", 4, 0)+"\n\n\n");
    }
}
