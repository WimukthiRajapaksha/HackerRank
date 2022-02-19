/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cutting.boards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class CuttingBoards {

    /**
     * @param args the command line arguments
     */
    
    public static int boardCutting(List<Integer> cost_y, List<Integer> cost_x) {
        Collections.sort(cost_x);
        Collections.sort(cost_y);
        int xPosition = cost_x.size()-1;
        int yPosition = cost_y.size()-1;
        int xCount = 1;
        int yCount = 1;
        long sum=0;
        while(xPosition>=0 || yPosition>=0) {
            System.out.println(xPosition+" - "+yPosition);
            if (yPosition >=0 && (xPosition<0 || cost_x.get(xPosition)<cost_y.get(yPosition))) {
                sum+=(yCount*(long)cost_y.get(yPosition));
                xCount++;
                yPosition--;
            } else {
                sum+=(xCount*(long)cost_x.get(xPosition));
                yCount++;
                xPosition--;
            }
        }
        System.out.println(sum%((int)Math.pow(10, 9)+7));
        return (int)(sum%((int)Math.pow(10, 9)+7));
    }
    
    public static void main(String[] args) {
//        CuttingBoards.boardCutting(Arrays.asList(2, 1, 3, 1, 5), Arrays.asList(4, 1, 2));
        CuttingBoards.boardCutting(Arrays.asList(2), Arrays.asList(1));
    }
}
