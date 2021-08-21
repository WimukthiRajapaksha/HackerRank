/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> list = new ArrayList<Integer>();
        int val = 1;
        int beg = 0;
        for (int p=player.size()-1;p>=0;p--) {
            for (int q=beg;q<ranked.size();q++) {
                if (player.get(p) >= ranked.get(q)) {
                    beg = q;
                    System.out.println(player.get(p)+"found"+val);
                    break;
                } else if (q==ranked.size()-1) {
                    beg = q;
                    System.out.println(player.get(p)+"foundd"+(val+1));
                    break;
                } else if (ranked.get(q+1)!=ranked.get(q)) {
                    val++;
                } 
//                System.out.println(p + "-" + q);
//                if (q == ranked.size()-1) {
//                    System.out.println(player.get(p)+"found"+val);
//                }
            }
//            System.out.println(player.get(p)+"found"+val);
        }
        
        
        
        
        
        
        
        
                
//        for (int j=0; j<player.size(); j++) {
//            int value = 0;
//            for (int i=0; i<ranked.size(); i++) {
//                if (ranked.get(i) > player.get(j)) {
//                    if !((i != 0) && (ranked.get(i-1) == ranked.get(i))) {
//                        value++;
//                    }   
//                } else if (ranked.get(i) == player.get(j)) {
//                    list.add(value+1);
//                    break;
//                } else {
//                    if (value == 0) {
//                        list.add(value+1);
//                        break;
//                    } else {
//                        list.add(value);
//                        break;
//                    }
//                    
//                }
//                if (i==ranked.size()-1) {
//                    list.add(value);
//                    break;
//                }
//            }
//        }
        Collections.reverse(list);
        return list;
    }

}

public class Hackerrank {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);
        
        System.out.println(result);

        bufferedReader.close();
    }
}
