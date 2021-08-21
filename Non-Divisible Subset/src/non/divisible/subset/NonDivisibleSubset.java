/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package non.divisible.subset;

/**
 *
 * @author wimukthirajapaksha
 */
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
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        Set<Integer> haSet = new HashSet<>();
        Set<Integer> ss = new HashSet<>();
        List<Integer> li = new ArrayList<>();
        int count = 0;
        for (int i: s) {
            ss.add(i%k);
            li.add(i%k);
        }
        
        for (int i: ss) {
            if (ss.contains(k-i)) {
                int fre = Collections.frequency(li, i);
                int freq = Collections.frequency(li, (k-i));
                if (fre>=freq) {
                    haSet.add(i);
                } else {
                    haSet.add(k-i);
                }
            } else {
                haSet.add(i);
            }
        }
        
        for (int i: haSet) {
//            System.out.println(i);
            if (i==0 || (i==k/2 && k%2==0)) {
                count = count + 1;
            } else {
                count = count + Collections.frequency(li, i);
            }
        }
//        System.out.println("count"+count);
        return count;
    }

}

//class Result {
//    public static int nonDivisibleSubset(int k, List<Integer> s) {
//        List<Integer> lis = new ArrayList<>();
////        List<Integer> newLis = new ArrayList<>();
//        Set<Integer> haSet = new HashSet<Integer>(); 
//        int count = 0;
//        for (int i: s) {
//            System.out.println(i%k+"------");
//            lis.add((i%k));
//        }
//        int[] intLi = new int[k];
//        Collections.sort(lis);
//        for (int i: lis) {
//            System.out.println(i+"...");
//        }
//        for (int i=0; i<lis.size(); i++) {
//            if ((i>0 && (lis.get(i) != lis.get(i-1))) || (i==0)) {
//                if ((intLi[k-lis.get(i)] == 0)) {
//                    System.out.println("f -"+lis.get(i)+" "+Collections.frequency(lis, lis.get(i)));
//                    haSet.add(lis.get(i));
//                    intLi[lis.get(i)] = 1;
////                    count = count+ Collections.frequency(lis, lis.get(i));
//                } else if (k-lis.get(i) != lis.get(i)) {
//                    System.out.println("found another"+ lis.get(i)+"-"+(k-lis.get(i)));
//                    int fre = Collections.frequency(lis, lis.get(i));
//
//                    int freq = Collections.frequency(lis, k-lis.get(i));
//                    System.out.println(fre);
//                    System.out.println(freq);
//                    System.out.println("ffff");
//                    if (fre >= freq) {
//                        System.out.println("removed"+(k-lis.get(i)));
//                        haSet.remove(new Integer(k-lis.get(i)));
//                        System.out.println("added"+lis.get(i));
////                        if (!(newLis.indexOf(lis.get(i))>=0)) {
////                            haSet.add(new Integer(lis.get(i)));
//////                            count = count+ Collections.frequency(lis, lis.get(i));
////                        }
//                        haSet.add(new Integer(lis.get(i)));
//                        intLi[lis.get(i)] = 1;
//                        intLi[k-lis.get(i)] = 0;
//                        
////                        count = count- Collections.frequency(lis, (k-lis.get(i)));
//                        System.out.println("f -"+lis.get(i)+" "+Collections.frequency(lis, lis.get(i)));
//                    } else {
//                        System.out.println("removed"+(lis.get(i)));
//                        haSet.remove(new Integer(lis.get(i)));
//                        System.out.println("added"+(k-lis.get(i)));
//                        haSet.add(k-lis.get(i));
////                        if (!(newLis.indexOf(k-lis.get(i))>=0)) {
////                            haSet.add(k-lis.get(i));
//////                            count = count+ Collections.frequency(lis, (k-lis.get(i)));
////                        }
////                        
//                        intLi[lis.get(i)] = 0;
//                        intLi[k-lis.get(i)] = 1;
//                        
//                    }
//                }
//            } 
//        }
//        for (int i: haSet) {
//            System.out.println("llllll"+i);
//            if (i == k/2 && k%2==0) {
//                count = count + 1;
//            } else if (i==0) {
//                count = count + 1;
//            } else {
//                count = count + Collections.frequency(lis, i);
//            }
//            
//        }
//        System.out.println(haSet.size());
//        System.out.println(count+"||||");
//        
//        return count;
//    }
//
//}

public class NonDivisibleSubset {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.nonDivisibleSubset(k, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
