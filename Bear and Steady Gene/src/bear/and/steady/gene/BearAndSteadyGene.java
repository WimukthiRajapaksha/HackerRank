/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bear.and.steady.gene;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wimukthirajapaksha
 */
public class BearAndSteadyGene {

    /**
     * @param args the command line arguments
     */
    
    public static boolean balanced(Map<Character, Integer> map, int thre) {
        if (map.get('A') <= thre && map.get('C') <= thre && map.get('T') <= thre && map.get('G') <= thre) {
            return true;
        }
        return false;
    }
    
    public static int steadyGene(String gene) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 0);
        map.put('T', 0);
        map.put('G', 0);
        for (int i=0; i<gene.length(); i++) {
            map.put(gene.charAt(i), map.get(gene.charAt(i))+1);
        }
        int thre = gene.length()/4;
        int i=0;
        int j=0;
        int min = Integer.MAX_VALUE;
        String minString = "";
        while(j<gene.length()) {
            if (!balanced(map, thre)) {
                map.put(gene.charAt(j), map.get(gene.charAt(j))-1);
                
                j++;
            } else {
                map.put(gene.charAt(i), map.get(gene.charAt(i))+1);
                if (min>j-i) {
                    min = j-i;
                    System.out.println(i+" "+j);
                    minString = gene.substring(i, j);
                }
                i++;
            }
        }
        System.out.println(minString);
        System.out.println(min);
        return min;
    }
    
    public static void main(String[] args) {
//        BearAndSteadyGene.steadyGene("GAAATAAA");
//        BearAndSteadyGene.steadyGene("ACTGAAAA");
        BearAndSteadyGene.steadyGene("TGATGCCGTCCCCTCAACTTGAGTGCTCCTAATGCGTTGC");
    }
    
}
