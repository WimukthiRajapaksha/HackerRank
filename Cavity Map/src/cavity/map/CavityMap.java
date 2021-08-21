/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavity.map;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author wimukthirajapaksha
 */
public class CavityMap {

    static String[] cavityMap(String[] grid) {
        for (int i=1;i<grid.length-1;i++) {
            System.out.println(Character.getNumericValue(grid[i].charAt(i)));
            for (int j=1;j<grid[i].length()-1; j++) {
                int top = Character.getNumericValue(grid[i-1].charAt(j));
                int bottom = Character.getNumericValue(grid[i+1].charAt(j));
                int left = Character.getNumericValue(grid[i].charAt(j-1));
                int right = Character.getNumericValue(grid[i].charAt(j+1));
                int current = Character.getNumericValue(grid[i].charAt(j));
                if ((current > top) && (current > bottom) && (current > left) && (current > right)) {
                    char[] arr = grid[i].toCharArray();
                    arr[j] = 'X';
                    String newArr = String.valueOf(arr);
                    grid[i] = newArr;
                }
            }
            
        }
        for (String item: grid) {
            System.out.println(item);
        }
        return grid;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(result[i]);
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
    
}
