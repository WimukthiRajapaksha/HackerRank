/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.luck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author wimukthirajapaksha
 */
public class CountLuck {

    /**
     * @param args the command line arguments
     */
    public static List<int[]> nearBy(int i, int j, List<String> matrix) {
        List<int[]> ret = new ArrayList<>();
        
        if (i-1>=0 && j>=0) {
            if (matrix.get(i-1).charAt(j) == '.' || matrix.get(i-1).charAt(j) == '*') {
                int[] temp = new int[2];
                temp[0] = i-1;
                temp[1] = j;
                ret.add(temp);
            }
        }
        if (i>=0 && j-1>=0) {
            if (matrix.get(i).charAt(j-1) == '.' || matrix.get(i).charAt(j-1) == '*') {
                int[] temp = new int[2];
                temp[0] = i;
                temp[1] = j-1;
                ret.add(temp);
            }
        }
        if (i+1<matrix.size() && j>=0) {
            if (matrix.get(i+1).charAt(j) == '.' || matrix.get(i+1).charAt(j) == '*') {
                int[] temp = new int[2];
                temp[0] = i+1;
                temp[1] = j;
                ret.add(temp);
            }
        }
        if (i>=0 && j+1<matrix.get(i).length()) {
            if (matrix.get(i).charAt(j+1) == '.' || matrix.get(i).charAt(j+1) == '*') {
                int[] temp = new int[2];
                temp[0] = i;
                temp[1] = j+1;
                ret.add(temp);
            }
        }
        return ret;
    }
    
    public static int bfs(List<String> matrix, int i, int j, int[] star) {
        Queue<int[]> queue = new LinkedList<>();
        Queue<Integer> values = new LinkedList<>();
        int[] li = new int[]{i, j};
        queue.add(li);
        values.add(0);
        
        while(!queue.isEmpty()) {
            int[] item = queue.poll();
            int val = values.poll();
            if (item[0]==star[0] && item[1]==star[1]) {
                System.out.println(i+" - "+j);
                return val;
            }
            List<int[]> nearBy = CountLuck.nearBy(item[0], item[1], matrix);
            if (nearBy.size()>1) {
                val+=1;
            }
            for (int[] temp: nearBy) {
                queue.add(temp);
                values.add(val);
                char[] arr = matrix.get(item[0]).toCharArray();
                arr[item[1]] = 'X';
                matrix.set(item[0], String.valueOf(arr));
    //            System.out.println(matrix);
                for (String s: matrix) {
                    System.out.println(s);
                }
            }
            System.out.println("\n\n");
        }
        return 0;
    }
    
    public static String countLuck(List<String> matrix, int k) {
        int[] star = new int[2];
        int[] m = new int[2];
        for (int i=0; i<matrix.size(); i++) {
            for (int j=0; j<matrix.get(i).length(); j++) {
                if (matrix.get(i).charAt(j)=='*') {
                    star[0] = i;
                    star[1] = j;
                }
                if (matrix.get(i).charAt(j)=='M') {
                    m[0] = i;
                    m[1] = j;
                }
            }
        }
//        System.out.println(star[0]+" star "+star[1]);
        System.out.println(CountLuck.bfs(matrix, m[0], m[1], star));
        return "";
    }
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList(".X.X......X", ".X*.X.XXX.X", ".XX.X.XM...", "......XXXX.");
        CountLuck.countLuck(list, 4);
    }
    
}
