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
    
    
//    static List<String> fuu(List<String> grid) {
//        List<String> gridMin1 = new ArrayList<>();
//        for (int i=0; i<grid.size(); i++) {
//            String forIter = "";
//            for (int j=0; j<grid.get(i).length(); j++){
//                if (i==0) {
//                    if (j==0) {
//                        if (grid.get(i).charAt(j+1)=='O' || grid.get(i+1).charAt(j)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else if (j==grid.get(i).length()-1) {
//                        if (grid.get(i).charAt(j-1)=='O' || grid.get(i+1).charAt(j)=='O'|| grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else {
//                        if (grid.get(i+1).charAt(j) == 'O'||grid.get(i).charAt(j-1) == 'O'||grid.get(i).charAt(j+1) == 'O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    }
//                } else if (i>0 && i<grid.size()-1) {
//                    if (j==0) {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i+1).charAt(j)=='O'||grid.get(i).charAt(j+1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else if (j==grid.get(i).length()-1) {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i+1).charAt(j)=='O'||grid.get(i).charAt(j-1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i+1).charAt(j)=='O'||grid.get(i).charAt(j-1)=='O'||grid.get(i).charAt(j+1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    }
//                } else {
//                    if (j==0) {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i).charAt(j+1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else if (j==grid.get(i).length()-1) {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i).charAt(j-1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i).charAt(j-1)=='O'||grid.get(i).charAt(j+1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    }
//                }
//            }    
//            gridMin1.add(forIter);
//        }
//        return gridMin1;
//    }
    
    
        
        
        
        
//        List<String> gridMin1 = new ArrayList<>();
//        for (int i=0; i<grid.size(); i++) {
//            String forIter = "";
//            for (int j=0; j<grid.get(i).length(); j++){
//                if (i==0) {
//                    if (j==0) {
//                        if (grid.get(i).charAt(j+1)=='O' || grid.get(i+1).charAt(j)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else if (j==grid.get(i).length()-1) {
//                        if (grid.get(i).charAt(j-1)=='O' || grid.get(i+1).charAt(j)=='O'|| grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else {
//                        if (grid.get(i+1).charAt(j) == 'O'||grid.get(i).charAt(j-1) == 'O'||grid.get(i).charAt(j+1) == 'O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    }
//                } else if (i>0 && i<grid.size()-1) {
//                    if (j==0) {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i+1).charAt(j)=='O'||grid.get(i).charAt(j+1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else if (j==grid.get(i).length()-1) {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i+1).charAt(j)=='O'||grid.get(i).charAt(j-1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i+1).charAt(j)=='O'||grid.get(i).charAt(j-1)=='O'||grid.get(i).charAt(j+1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    }
//                } else {
//                    if (j==0) {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i).charAt(j+1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else if (j==grid.get(i).length()-1) {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i).charAt(j-1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    } else {
//                        if (grid.get(i-1).charAt(j)=='O'||grid.get(i).charAt(j-1)=='O'||grid.get(i).charAt(j+1)=='O' || grid.get(i).charAt(j)=='O') {
//                            forIter += ".";
//                        } else {
//                            forIter += "O";
//                        }
//                    }
//                }
//            }    
//            gridMin1.add(forIter);
//        }
//        return gridMin1;
//    }
    
//    static List<String> abc(List<String> grid) {
//        for (int i=0; i< grid.size(); i++) {
//            String ret = "";
//            for (int j=0; j<grid.get(i).length(); j++) {
//                if (grid.get(i).charAt(j)=='O') {
//                    ret += ".";
//                }
//            }
//        }
//        return grid;
//    }
    
    static List<String> foo (List<String> grid, int n) {
        List<int[]> items = new ArrayList<>();
        List<String> ret = new ArrayList<>();
        for (int i=0; i<grid.size(); i++) {
            String s = "";
            for (int j=0; j<grid.get(i).length(); j++) {
                if (grid.get(i).charAt(j)=='O') {
                    int[] ii = {i, j};
                    items.add(ii);
                }
                s+='O';
            }
            ret.add(s);
        }
        for (int[] i: items) {
            char[] arr = ret.get(i[0]).toCharArray();
            arr[i[1]] = '.';
            if (i[1]>0) {
                arr[i[1]-1] = '.';
            }
            if (i[1]<grid.get(0).length()-1) {
                arr[i[1]+1] = '.';
            }
            ret.set(i[0], String.valueOf(arr));
            
            if (i[0]>0) {
                arr = ret.get(i[0]-1).toCharArray();
                arr[i[1]] = '.';
                ret.set(i[0]-1, String.valueOf(arr));
            }
            if (i[0]<grid.size()-1) {
                arr = ret.get(i[0]+1).toCharArray();
                arr[i[1]] = '.';
                ret.set(i[0]+1, String.valueOf(arr));
            }
        }
        return ret;
    }
    
//    static List<String> foo (List<String> grid, int n) {
//        char c = n%4 != 1 ? 'O' : 'O'; // 3 -> O
//        char nc = n%4 != 1 ? '.' : '.'; // 3 -> .
//        
//        List<String> newGrid = new ArrayList<>();
//        for (int i=0; i<grid.size(); i++) {
//            String ss="";
//            for (int j=0; j<grid.get(i).length(); j++) {
//                String s = grid.get(i);
//                if (i==0 && s.charAt(j)==nc) {
//                    if (j==0) {
//                        if (s.charAt(j+1)==c || grid.get(i+1).charAt(j)==c) {
//                            ss+=nc;
//                        } else {
//                            ss+=c;
//                        }
//                    } else if (j==grid.get(i).length()-1) {
//                        if (s.charAt(j-1)==c || grid.get(i+1).charAt(j)==c) {
//                            ss+=nc;
//                        } else {
//                            ss+=c;
//                        }
//                    } else {
//                        if (s.charAt(j-1)==c || grid.get(i+1).charAt(j)==c || s.charAt(j+1)==c) {
//                            ss+=nc;
//                        } else {
//                            ss+=c;
//                        }
//                    }
//                } else if (i==grid.size()-1 && s.charAt(j)==nc) {
//                    if (j==0) {
//                        if (s.charAt(j+1)==c || grid.get(i-1).charAt(j)==c) {
//                            ss+=nc;
//                        } else {
//                            ss+=c;
//                        }
//                    } else if (j==grid.get(i).length()-1) {
//                        if (s.charAt(j-1)==c || grid.get(i-1).charAt(j)==c) {
//                            ss+=nc;
//                        } else {
//                            ss+=c;
//                        }
//                    } else {
//                        if (s.charAt(j-1)==c || grid.get(i-1).charAt(j)==c || s.charAt(j+1)==c) {
//                            ss+=nc;
//                        } else {
//                            ss+=c;
//                        }
//                    }
//                } else if (s.charAt(j)==c) {
//                    ss+=nc;
//                } else {
//                    if (j==0) {
//                        if (s.charAt(j+1)==c || grid.get(i-1).charAt(j)==c || grid.get(i+1).charAt(j)==c) {
//                            ss+=nc;
//                        } else {
//                            ss+=c;
//                        }
//                    } else if (j==grid.get(i).length()-1) {
//                        if (s.charAt(j-1)==c || grid.get(i-1).charAt(j)==c || grid.get(i+1).charAt(j)==c) {
//                            ss+=nc;
//                        } else {
//                            ss+=c;
//                        }
//                    } else {
//                        if (s.charAt(j-1)==c || grid.get(i-1).charAt(j)==c || s.charAt(j+1)==c || grid.get(i+1).charAt(j)==c) {
//                            ss+=nc;
//                        } else {
//                            ss+=c;
//                        }
//                    }
//                }
//            }
//            newGrid.add(ss);
//        }
//        return newGrid;
//    }

    static List<String> bomberMan(int n, List<String> grid) {
        if (n==1) {
            return grid;
        } else if (n%2==0) {
            List<String> newGrid = new ArrayList<>();
            for (int i=0; i<grid.size(); i++) {
                String s = grid.get(i).replace('.', 'O');
                newGrid.add(i, s);
            }
            return newGrid;
        } else if (n%4==1) {
            return foo(foo(grid, 3), n);
        } else {
            return foo(grid, n);
        }
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String[] grid = new String[6];
//        grid[0] = ".......";
//        grid[1] = "...O...";
//        grid[2] = "....O..";
//        grid[3] = ".......";
//        grid[4] = "OO.....";
//        grid[5] = "OO.....";
//        String[] result = bomberMan(5, grid);
//        for (String i: result) {
//            System.out.println(i);
//        }

//        String[] grid = new String[5];
//        grid[0] = "..O..";
//        grid[1] = ".OOOO";
//        grid[2] = "O..O.";
//        grid[3] = "..OO.";
//        grid[4] = ".O...";
//        String[] result = bomberMan(5, grid);
//        for (String i: result) {
//            System.out.println(i);
//        }

//        String[] grid = new String[5];
//        grid[0] = ".OOOO";
//        grid[1] = "OOOOO";
//        grid[2] = "OOOOO";
//        grid[3] = "OOOOO";
//        grid[4] = "OOOO.";
//        String[] result = bomberMan(2, grid);
//        for (String i: result) {
//            System.out.println(i);
//        }

//        List<String> grid = Arrays.asList(".......", "...O...", "....O..", ".......", "OO.....", "OO.....");
//        List<String> result = bomberMan(3, grid);
//        System.out.println(result);

//        List<String> grid = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
//        List<String> result = bomberMan(10007, grid);
//        System.out.println(result);

//        List<String> grid = Arrays.asList("O..O", ".O..", "....");
//        List<String> result = bomberMan(5, grid);
//        System.out.println(result);

        List<String> grid = Arrays.asList(".......", "...O...", "....O..", ".......", "OO.....", "OO.....");
        System.out.println(bomberMan(1, grid));
        System.out.println(bomberMan(2, grid));
        System.out.println(bomberMan(3, grid));
        System.out.println(bomberMan(4, grid));
        System.out.println(bomberMan(5, grid));
        System.out.println(bomberMan(6, grid));
        
        
        
        grid = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        System.out.println(bomberMan(1, grid));
        System.out.println(bomberMan(2, grid));
        System.out.println(bomberMan(5, grid));
        System.out.println(bomberMan(4, grid));
        System.out.println(bomberMan(5, grid));
        System.out.println(bomberMan(6, grid));



        List<String> gridd = Arrays.asList("O.O.", ".O.O", "O.O.");
        System.out.println(bomberMan(4, gridd));
    }
    
}
