/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximum.palindromes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wimukthirajapaksha
 */
public class MaximumPalindromes {

    /**
     * @param args the command line arguments
     */
    private static String s = "";
//    private static Map<Character, Integer> map = new HashMap<>();
    public static void initialize(String s) {
        MaximumPalindromes.s = s;
//        for (int i=0; i<s.length(); i++) {
//            if (map.containsKey(s.charAt(i))) {
//                map.put(s.charAt(i), map.get(s.charAt(i))+1);
//            } else {
//                map.put(s.charAt(i), 1);
//            }
//        }
    // This function is called once before all queries.
    }
    
    public static int answerQuery(int l, int r) {
        Map<Character, Integer> map = new HashMap<>();
        int maxOddCount = 0;
        int maxOdd = 0;
        for(int i=l-1; i<r; i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
        Map<Character, Integer> newMap = new HashMap<>();
        int tempCount = 0;
        for(Map.Entry e: map.entrySet()) {
            if (((int)e.getValue())%2 == 0) {
                tempCount += (int)e.getValue()/2;
                newMap.put((char)e.getKey(), (int)e.getValue()/2);
            } else {
                if (maxOdd<(int)e.getValue()) {
                    maxOdd = (int)e.getValue();
                    maxOddCount = 1;
                } else if (maxOdd == (int)e.getValue()) {
                    maxOddCount ++;
                }
            }
        }
        int tot = 1;
        if (maxOddCount>0) {
            tempCount+=(maxOdd/2);
            System.out.println("1");
            for (int i=1; i<=tempCount; i++) {
                tot=(tot*i)%1000000007;
            }
            tot=(tot*maxOddCount)%1000000007;
            if (maxOdd/2>1) {
                for (int i=1; i<=maxOdd/2; i++) {
                    tot=(tot/i)%1000000007;
                }
            }
//            tot*=maxOddCount;
            for (Map.Entry e: newMap.entrySet()) {
                if ((int)e.getValue()>1) {
                    int val = 1;
                    for (int j=1; j<=(int)e.getValue(); j++) {
                        val*=j;
                    }
                    tot=(tot/val);
                }
            }
            System.out.println(tot);
        } else {
            System.out.println("2");
            for (int i=1; i<=tempCount; i++) {
                tot*=i;
            }
            for (Map.Entry e: newMap.entrySet()) {
                if ((int)e.getValue()>1) {
                    int val = 1;
                    for (int j=1; j<=(int)e.getValue(); j++) {
                        val*=j;
                    }
                    tot=(tot/val);
                }
            }
            System.out.println(tot);
        }
        
        
        return tot%1000000007;
        
//        if (countEven<r-l+1) {
//            
//        } else {
//            
//        }
//        System.out.println(countEven+" "+maxOddCount);
//        int cou = 1;
//        for (int i=1; i<countEven; i++) {
//            cou+=i;
//        }
//        System.out.println(cou*maxOddCount);
//        return cou;
    // Return the answer for this query modulo 1000000007.
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        initialize("week");
        answerQuery(1, 4);
//        answerQuery(2, 3);
        
//        initialize("abab");
//        answerQuery(1, 4);
        
    }
    
}
