/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.layer.rotation;

import java.util.ArrayList;
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

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        List<List<Integer>> newMatrix = new ArrayList<List<Integer>>();
        while (n>2 && m>2) {
            int total = (n+m-1)*2;
            int remai = r%total;
            n-=2;
            m-=2;
        }
    }

}


public class MatrixLayerRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
