/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome.index;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    
    public static int palindromeIndex(String s) {
        int i,j;
        for (i=0, j=s.length()-1; i<s.length(); i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                break;
            }
        }
        if (i>j) {
            return -1;
        }
        int k, l;
        boolean first = true;
        for (k=i, l=j-1; k<j; k++, l--) {
            if (s.charAt(k) != s.charAt(l)) {
                first = false;
                break;
            }
        }
        if (!first) {
            boolean second = true;
            int m, n;
            for (m=i+1, n=j; m<=j; m++, n--) {
                if (s.charAt(m) != s.charAt(n)) {
                    second = false;
                    break;
                }
            }
            if (!second) {
                return -1;
            } else {
                return i;
            }
        } else {
            return j;
        }
        
        
        
        
        
//        int l = s.length();
//        int i,j,a,b;
//        for (i=0, j=l-1; i<l; i++,j--){
//            if (s.charAt(i)!=s.charAt(j))
//                break;
//        }
//        if (i>j) return -1;
//
//        for (a = i+1, b = j;a<j && b>i; a++,b--){
//            if (s.charAt(a)!=s.charAt(b))
//                return j;
//        }
//        return i;
        
        
        
        
        
        
//        if (!(s.length()>=1 && s.length()<=100005)) {
//            return -1;
//        }
//        int begin = 0;
//        int end = s.length() - 1;
//        int count = 0;
//        int removable = 0;
//        while (begin <= end) {
//            if (s.charAt(begin) != s.charAt(end)) {
//                count++;
//                if (count>1) {
//                    break;
//                }
//                if (begin+1<end-2 && s.charAt(begin+1) == s.charAt(end-2)) {
//                    removable = end;
//                    end--;
//                } else if (end-1>begin+2 && s.charAt(begin+2) == s.charAt(end-1)) {
//                    removable = begin;
//                    begin++;
//                } else if (end-1>begin && s.charAt(begin) == s.charAt(end-1)) {
//                    removable = end;
//                    end--;
//                } else if (end>begin+1 && s.charAt(begin+1) == s.charAt(end)) {
//                    removable = begin;
//                    begin++;
//                } else {
//                    
//                    if (begin+1==end) {
//                        begin++;
//                        end--;  
//                        count++;
//                    } 
////                    else {
////                        begin++;
////                        end--;  
////                        count++;
////                    }
//                }
//            } else {
//                begin++;
//                end--;   
//            }
//        }
//        System.out.println(count);
//        if (count == 1) {
//            return removable;
//        } else {
//            return -1;
//        }
    }
}

public class PalindromeIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Result.palindromeIndex("abcdba"));
//        System.out.println(Result.palindromeIndex("abzcktxyztkczba"));
//        System.out.println(Result.palindromeIndex("hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh"));
//        System.out.println(Result.palindromeIndex("hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh"));
    }
    
}
