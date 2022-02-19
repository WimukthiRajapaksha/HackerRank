/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlock.and.the.beast;

/**
 *
 * @author wimukthirajapaksha
 */
public class SherlockAndTheBeast {

    /**
     * @param args the command line arguments
     */
    
    public static void decentNumber(int n) {
        int fives=0;
        int threes=0;
        if (n%3==0 && n>=3) {
            fives = n/3;
        } else if (n%3==2 && n>=3) {
            fives = (n/3)-1;
            threes = 1;
        } else if (n%3==1 && n>=10) {
            fives = (n/3)-3;
            threes = 2;
        } else if (n%5==0 && n>=5) {
            threes = n/5;
        } else {
            System.out.println("-1");
            return;
        }
        StringBuilder s = new StringBuilder();
        for (int i=0; i<fives; i++) {
            s.append(555);
        }
        for (int j=0; j<threes; j++) {
            s.append(33333);
        }
        System.out.println(s);
    }
    
    public static void main(String[] args) {
//        SherlockAndTheBeast.decentNumber(11);
//        SherlockAndTheBeast.decentNumber(4);
//        SherlockAndTheBeast.decentNumber(1);
        SherlockAndTheBeast.decentNumber(4);
//        SherlockAndTheBeast.decentNumber(5);
        SherlockAndTheBeast.decentNumber(11);
    }
}
