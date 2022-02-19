/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connected.cells.in.a.grid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author wimukthirajapaksha
 */
public class ConnectedCellsInAGrid {

    /**
     * @param args the command line arguments
     */
    
//    BFS IMPLEMENTATION
    public static int neighbours(List<List<Integer>> matrix, int i, int j, Queue<int[]> queue) {
        if (i<0||j<0||i>=matrix.size()||j>=matrix.get(i).size()||matrix.get(i).get(j)==0) {
            return 0;
        }
        int count = 1;
        matrix.get(i).set(j, 0);
        
        queue.add(new int[]{i-1, j});
        queue.add(new int[]{i+1, j});
        queue.add(new int[]{i, j-1});
        
        queue.add(new int[]{i, j+1});
        queue.add(new int[]{i-1, j-1});
        queue.add(new int[]{i-1, j+1});
        
        queue.add(new int[]{i+1, j+1});
        queue.add(new int[]{i+1, j-1});
        
        while(!queue.isEmpty()) {
            int[] element = queue.remove();
            count+=ConnectedCellsInAGrid.neighbours(matrix, element[0], element[1], queue);
        }
        return count;
    }
    
    public static int connectedCell(List<List<Integer>> matrix) {
        int maxCount=0;
        for (int i=0; i<matrix.size(); i++) {
            for (int j=0; j<matrix.get(i).size(); j++) {
                if (matrix.get(i).get(j) == 1) {
                    Queue<int[]> queue = new LinkedList<>();
                    int count = ConnectedCellsInAGrid.neighbours(matrix, i, j, queue);
                    if (count>maxCount) {
                        maxCount = count;
                    }
                }
            }
        }
        System.out.println(maxCount);
        return maxCount;
    }
    
//    DFS IMPLEMENTATION
//    public static int neighbours(List<List<Integer>> matrix, int i, int j) {
//        if (i<0||j<0||i>=matrix.size()||j>=matrix.get(i).size()||matrix.get(i).get(j)==0) {
//            return 0;
//        }
//        int count = 1;
//        matrix.get(i).set(j, 0);
//        count += ConnectedCellsInAGrid.neighbours(matrix, i-1, j);
//        count += ConnectedCellsInAGrid.neighbours(matrix, i+1, j);
//        count += ConnectedCellsInAGrid.neighbours(matrix, i, j-1);
//        count += ConnectedCellsInAGrid.neighbours(matrix, i, j+1);
//        count += ConnectedCellsInAGrid.neighbours(matrix, i-1, j-1);
//        count += ConnectedCellsInAGrid.neighbours(matrix, i-1, j+1);
//        count += ConnectedCellsInAGrid.neighbours(matrix, i+1, j+1);
//        count += ConnectedCellsInAGrid.neighbours(matrix, i+1, j-1);
//        return count;
//    }
//    
//    public static int connectedCell(List<List<Integer>> matrix) {
//        int maxCount=0;
//        for (int i=0; i<matrix.size(); i++) {
//            for (int j=0; j<matrix.get(i).size(); j++) {
//                if (matrix.get(i).get(j) == 1) {
//                    int count = ConnectedCellsInAGrid.neighbours(matrix, i, j);
//                    if (count>maxCount) {
//                        maxCount = count;
//                    }
//                }
//            }
//        }
//        System.out.println(maxCount);
//        return maxCount;
//    }
    
//    ONLY CHECKING THE DESIRED VALUE AND STORING IN LIST
//    public static boolean nearBy(int[] original, int[] temp) {
//        if (
//                (original[0]==temp[0] && (original[1]==temp[1]-1 || original[1]==temp[1]+1)) ||
//                (original[0]==temp[0]-1 && (original[1]==temp[1]-1 || original[1]==temp[1]+1 || original[1]==temp[1])) ||
//                (original[0]==temp[0]+1 && (original[1]==temp[1]-1 || original[1]==temp[1]+1 || original[1]==temp[1]))
//           ) {
//            return true;
//        }
//        return false;
//    }
//    
//    public static int connectedCell(List<List<Integer>> matrix) {
//        List<int[]> resu = new ArrayList<>();
//        for (int i=0; i<matrix.size(); i++) {
//            for (int j=0; j<matrix.get(i).size(); j++) {
//                if (matrix.get(i).get(j).equals(1)) {
//                    int[] ad = {i, j};
//                    resu.add(ad);
//                }
//            }
//        }
//        
//        int max=0; 
//        while(!resu.isEmpty()) {
//            List<int[]> temp = new ArrayList<>();
//            temp.add(resu.remove(0));
//            int i=0;
//            while(i<temp.size()) {
//                for (int p=0; p<resu.size(); p++) {
//                    System.out.println(resu.get(p)[0]+" "+resu.get(p)[1]);
//                }
//                for(int p=0; p<resu.size(); p++) {
//                    if (ConnectedCellsInAGrid.nearBy(temp.get(i), resu.get(p))) {
//                        temp.add(resu.get(p));
//                        resu.remove(resu.get(p));
//                    }
//                }
//                i++;
//            }
//            if (temp.size()>max) {
//                max = temp.size();
//            }
//        }
//        System.out.println(max);
//        return max;
//    }
    
    public static void main(String[] args) {
        List<List<Integer>> lis = Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 1, 1, 0)), 
                new ArrayList<>(Arrays.asList(0, 1, 1, 0)),
                new ArrayList<>(Arrays.asList(0, 0, 1, 0)),
                new ArrayList<>(Arrays.asList(1, 0, 0, 0))
        );
        
        ConnectedCellsInAGrid.connectedCell(lis);
    }
}
