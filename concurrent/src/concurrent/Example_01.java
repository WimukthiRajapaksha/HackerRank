/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrent;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

class Abc extends Thread{
    Semaphore sem;
    int num;

    public Abc(Semaphore sem, int num) {
        this.sem = sem;
        this.num = num;
    }

    @Override
    public void run() {
        try {
            System.out.println("starting.. " + num);
//            for (int j = 0; j < 10; j++) {
//                System.out.println("here" + j + "_" + num + "------");
//            }
            sem.acquire();
            System.out.println("here we go.. " + num);
//            for (int i = 0; i < 10; i++) {
//                System.out.println("here" + i + "_" + num);
//            }
        } catch (InterruptedException ex) {
        } finally {
            sem.release();
            System.out.println("released.. " + num);
        }
        
//        System.out.println("starting.. " + num);
//        System.out.println("here we go.. " + num);
//        for (int i = 0; i < 10; i++) {
//            System.out.println("here" + i);
//        }
//        System.out.println("released.. " + num);
    }  
}

public class Example_01 extends Thread{
    private static Semaphore fred = new Semaphore(1);
    
    public static void main(String[] args) {
        Abc a1 = new Abc(fred, 1);
        Abc a2 = new Abc(fred, 2);
        Abc a3 = new Abc(fred, 3);
        Abc a4 = new Abc(fred, 4);
        Abc a5 = new Abc(fred, 5);
        Abc a6 = new Abc(fred, 6);
        Abc a7 = new Abc(fred, 7);
        Abc a8 = new Abc(fred, 8);
        Abc a9 = new Abc(fred, 9);
        Abc a10 = new Abc(fred, 10);
        
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        a6.start();
        a7.start();
        a8.start();
        a9.start();
        a10.start();
    }
}
