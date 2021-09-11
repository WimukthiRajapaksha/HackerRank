/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package separate.the.numbers;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */

class Result {

    /*
     * Complete the 'separateNumbers' function below.
     *
     * The function accepts STRING s as parameter.
     */

    public static void separateNumbers(String s) {
        boolean found = false;
        int max = s.length() > 2 ? s.length()/2+1 : s.length()/2;
        String base="";
        for (int i=0; i<max;i++) {
            base+=String.valueOf(s.charAt(i));
//            for (int j=0; j<i; j++) {
//                base += String.valueOf(s.charAt(j));
//            }
            System.out.println(base);
            int adding = Integer.parseInt(base);
            String regenerated = "";
            while(s.length()>regenerated.length()) {
                regenerated+=adding;
                adding++;
            }
            if (s.length()>regenerated.length()) {
                regenerated+=adding;
            }
//            System.out.println(regenerated+"----");
            if (Double.parseDouble(s)==Double.parseDouble(regenerated)) {
                found = true;
                System.out.println("Found "+base);
                break;
            } 
//            else {
//                System.out.println("Nope");
//            }
        }
        if (!found) {
            System.out.println("Nope");
        }
        
        
//        double value = Double.parseDouble(s);
//        System.out.println(value);
//        boolean indic = true;
//        int initial = 0;
//        if (s.length()==1) {
//            System.out.println("NO");
//            return;
//        }
//        for(int i=1; i<=s.length()/2+1; i++) {
//            indic = true;
//            int count = 0;
//            System.out.println("-------------------");
//            double temp = value;
//            int power = (int)Math.pow(10, i);
//            double remainder = Double.valueOf(temp%power).intValue();
//            System.out.println(((Double)remainder).toString().split("\\.")[0].length());
//            if (((Double)remainder).toString().split("\\.")[0].length() != ((Integer)power).toString().length()-1) {
//                System.out.println("NO");
//                return;
//            }
//            System.out.println("power - "+ Math.pow(10, i));
//            while (temp>0 || (temp==0 && remainder>0)) {
//                temp = Double.valueOf(temp/power).intValue();
//                if (remainder == (int)Math.pow(10, i-1)) {
//                    power = (int)Math.pow(10, i-1);
//                }
//                System.out.println("power - "+power);
//                System.out.println("temp - "+temp);
//                System.out.println("remainder - "+remainder + " "+temp%power);
//                
//                if (remainder-(temp%power) == 1) {   
//                    count++;
//                } else {
//                    if (!(temp==0 && remainder>0)) {
//                        System.out.println("breaking");
//                        indic = false;
//                        break;
//                    }
//                    
//                }
//                initial = (int)remainder;
//                remainder = Double.valueOf(temp%power).intValue();
//                if (((Double)remainder).toString().split("\\.")[0].length() != ((Integer)power).toString().length()-1) {
//                    System.out.println("NO");
//                    return;
//                }
//            }
//            System.out.println("--"+indic+" - "+count);
//            
//            if (indic && count>=1) {
//                System.out.println("YES " + initial);
//                break;
//            } else {
//                indic=false;
//            }
//        }
//        if (!indic) {
//            System.out.println("NO");
//        }
    }

}

public class SeparateTheNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Result.separateNumbers("99910001001");
//        Result.separateNumbers("7891011");
//        Result.separateNumbers("9899100");
//        Result.separateNumbers("999100010001");
        
        Result.separateNumbers("1234");
        Result.separateNumbers("91011");
        Result.separateNumbers("99100");
        Result.separateNumbers("101103");
        Result.separateNumbers("010203");
        Result.separateNumbers("13");
        Result.separateNumbers("1");
    }
    
}
