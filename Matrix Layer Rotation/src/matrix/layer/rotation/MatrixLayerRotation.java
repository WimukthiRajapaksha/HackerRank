/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.layer.rotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY matrix
     *  2. INTEGER r
     */
    
    public static List<List<Integer>> rotate(List<List<Integer>> matrix, int r, int inside) {
        if (Math.min(matrix.size()/2, matrix.get(0).size()/2)==inside) {
            return matrix;
        }
        int n = matrix.size();
        int m = matrix.get(0).size();
        List<List<Integer>> newMatrix = new ArrayList<>(matrix);
        int count = r%((2*(m+n))-4-(8*(inside)));

        List<Integer> allItemsForPath = new ArrayList<>();
        for (int i=inside; i<m-inside; i++) {
            allItemsForPath.add(matrix.get(inside).get(i));
        }
        for (int i=inside+1; i<n-inside; i++) {
            allItemsForPath.add(matrix.get(i).get(m-1-inside));
        }
        for (int i=m-inside-2; i>=inside; i--) {
            allItemsForPath.add(matrix.get(matrix.size()-1-inside).get(i));
        }
        for (int i=n-inside-2; i>inside; i--) {
            allItemsForPath.add(matrix.get(i).get(inside));
        }
        int k=count;
        int a = inside;
        int b = m-inside;
        for (int i=a; i<b; i++) {
            newMatrix.get(inside).set(i, allItemsForPath.get(k%allItemsForPath.size()));
            k++;
        }
        a = inside+1;
        b = n-inside;
        for (int i=a; i<b; i++) {
            newMatrix.get(i).set(m-1-inside, allItemsForPath.get(k%allItemsForPath.size()));
            k++;
        }
        a = m-inside-2;
        b = inside;
        for (int i=a; i>=b; i--) {
            newMatrix.get(n-1-inside).set(i, allItemsForPath.get(k%allItemsForPath.size()));
            k++;
        }
        a = n-inside-2;
        b = inside;
        for (int i=a; i>b; i--) {
            newMatrix.get(i).set(inside, allItemsForPath.get(k%allItemsForPath.size()));
            k++;
        }
        return rotate(newMatrix, r, ++inside);
    }

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        List<List<Integer>> mat = rotate(matrix, r, 0);
        for (List<Integer> i: mat) {
            for (int j: i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


public class MatrixLayerRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> lis1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> lis2 = Arrays.asList(7, 8, 9, 10);
        List<Integer> lis3 = Arrays.asList(13, 14, 15, 16);
        List<Integer> lis4 = Arrays.asList(19, 20, 21, 22);
        List<Integer> lis5 = Arrays.asList(25, 26, 27, 28);
        List<List<Integer>> lis = Arrays.asList(lis1, lis2, lis3, lis4, lis5);
        Result.matrixRotation(lis, 7);
    }
    
}
