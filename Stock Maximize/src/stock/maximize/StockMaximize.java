/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.maximize;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class StockMaximize {

    /**
     * @param args the command line arguments
     */
    
    public static long stockmax(List<Integer> prices) {
        long val = 0;
        long max = prices.get(prices.size()-1);
        for (int i=prices.size()-1; i>=0; i--) {
            if (max<=prices.get(i)) {
                max = prices.get(i);
            } else {
                val+=max-prices.get(i);
            }
        }
        System.out.println(val);
        return val;
    }
    
    public static void main(String[] args) {
//        stockmax(Arrays.asList(1, 2, 100));
        stockmax(Arrays.asList(1, 5, 1, 5));
    }
}
