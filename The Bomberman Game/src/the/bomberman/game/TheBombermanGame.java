/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.bomberman.game;

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
public class TheBombermanGame {

//.......
//...1.1.
//....1..
//..1....
//11...11
//11.1...
    
//    2
//1111111
//1112121
//1111211
//1121111
//2211122
//2212111
    
//    3
//2222222
//2220202
//2222022
//2202222
//0022200
//0020222
    
    //2220202
    //2200000
    //2200002
    //0000000
    //0000000
    //0000000
    
//    4
//OOOxOxO
//OOxxxxx
//OOxxxxO
//xxxxxOO
//xxxOxxx
//xxxxxOO
    
    //2220202
    //2200000
    //2200002
    //0000000
    //0000000
    //0000000
    
//    5
//OOOxOxO
//OOxxxxx
//OOxxxxO
//xxxxxOO
//xxxOxxx
//xxxxxOO
    
    //0000000
    //0001010
    //0001100
    //0011110
    //0000000
    //0000000

    static String[] bomberMan(int n, String[] grid) {
        String[] returnGrid = new String[grid.length];
        if (n==0 || n==1) {
            returnGrid = grid;
        } else if (n%2==0) {
            for (int i=0;i<grid.length;i++) {
                String newItem = grid[i].replace(".", "0");
                returnGrid[i]=newItem;
            }
        } else {
            returnGrid = grid;
        }
        return returnGrid;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] rcn = scanner.nextLine().split(" ");

        int r = Integer.parseInt(rcn[0]);

        int c = Integer.parseInt(rcn[1]);

        int n = Integer.parseInt(rcn[2]);

        String[] grid = new String[r];

        for (int i = 0; i < r; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = bomberMan(n, grid);

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
