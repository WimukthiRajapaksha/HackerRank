/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.shuffle.merge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author wimukthirajapaksha
 */
public class ReverseShuffleMerge {

    /**
     * @param args the command line arguments
     */
    
    public static String reverseShuffleMerge(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
        String ret1 = "";
        String ret2 = "";
        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Character, Integer> i = it.next();
            i.setValue(i.getValue()/2);
        }
        System.out.println(map);
        System.out.println(s);
        for (int i=s.length()-1; i>=0; i--) {
            System.out.println(s.charAt(i)+" "+map.get(s.charAt(i)));
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>0) {
                ret1+=s.charAt(i);
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
            } else {
                ret2+=s.charAt(i);
            }
        }
        
        System.out.println(ret1);
        System.out.println(ret2);
        System.out.println("----");
        System.out.println(ret1.compareTo(ret2) > 0 ? ret2 : ret1);
        return ret1.compareTo(ret2) > 0 ? ret2 : ret1;
    }
    
    public static void main(String[] args) {
//        ReverseShuffleMerge.reverseShuffleMerge("aeiouuoiea");
        ReverseShuffleMerge.reverseShuffleMerge("abcdefgabcdefg");
    }
}
