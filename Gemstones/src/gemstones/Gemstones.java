/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gemstones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
        Set<String> initial = new HashSet<>(Arrays.asList(arr.get(0).split("")));
        for (String i: arr) {
            Set<String> temp = new HashSet<>(Arrays.asList(i.split("")));
            initial.retainAll(temp);
        }
        System.out.println(initial.size());
        return initial.size();
        
//        List<String> ll = Arrays.asList(arr.get(0).split(""));
//        Set<String> sset = new HashSet<>(ll);
//        System.out.println(sset);
//        for (int i=1; i<arr.size(); i++) {
//            Iterator iterator = sset.iterator();
//            System.out.println(arr.get(i));
//            List<String> removable = new ArrayList<>();
//            while(iterator.hasNext()) {
//                String taken = (String)iterator.next();
//                System.out.println(taken);
//                System.out.println(arr.get(i).contains(taken));
//                if (!arr.get(i).contains(taken)){
//                    removable.add(taken);
//                }
//                System.out.println(sset);
//            }
//            sset.removeAll(removable);
//        }
//        System.out.println(sset);
//        System.out.println(sset.size());
//        return sset.size();
    }
}

public class Gemstones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.gemstones(Arrays.asList("abcdde", "baccd", "eeabg"));
        Result.gemstones(Arrays.asList("abc", "abc", "bc"));
    }
    
}
