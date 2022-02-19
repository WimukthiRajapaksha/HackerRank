/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodland.electricity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class GoodlandElectricity {

    /**
     * @param args the command line arguments
     */
    
    public static int pylons(int k, List<Integer> arr) {
        k--;
        int i=k;
        int count=1;
        int prev=0;
        while(i<arr.size()) {
//            System.out.println(i+" "+prev);            
            if (arr.get(i)==1) {
                prev = i;
                if (i+2*k+1<arr.size()) {
                    count++;
                    i+=(2*k)+1;
                } else if (i+k>=arr.size()-1) {
//                    System.out.println("done");
                    break;
                } else {
                    count++;
                    i=arr.size()-1;
                }
            } else {
                i--;
                if (i<0 || (prev>=i && prev>0)) {
                    return -1;
                }
            }
        }
        System.out.println(count);
        return count;
    }
    
    
//    ALTERNATE
//    public static int pylons(int k, List<Integer> arr) {
//        k--;
//        int i=k;
//        int count=0;
//        int prev=0;
//        while(prev<arr.size()) {
//            System.out.println(i+" "+prev+" ");            
//            if (arr.get(i)==1) {
//                prev = i+k+1;
//                i+=(2*k)+1;
//                count++;
//                if (i>=arr.size()) {
//                    i=arr.size()-1;
//                }
//            } else {
//                i--;
//                if (i<0 || (prev-k>i && prev>0)) {
//                    System.out.println("-1");
//                    return -1;
//                }
//            }
//        }
//        System.out.println(count+" -");
//        return count;
//    }
    
    public static void main(String[] args) {
//        GoodlandElectricity.pylons(3, Arrays.asList(0, 1, 1, 1, 0, 0, 1));
//        GoodlandElectricity.pylons(2, Arrays.asList(0, 1, 1, 1, 0, 1));
//        GoodlandElectricity.pylons(3, Arrays.asList(0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1));
//                                                  0  1  2  3  4  5  6  7  8  9  10
        GoodlandElectricity.pylons(3, Arrays.asList(1, 1, 1, 0, 0, 0, 0, 0, 1));
    }
}
