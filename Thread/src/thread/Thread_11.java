/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wimukthirajapaksha
 */
public class Thread_11 extends Thread{
    public Thread_11(String str) {
        super(str);
    }    
    public void run() {
    	for (int i = 1; i <= 50; i++) {
            for(int j = 0; j < 10000; j++)
                System.out.print(""); 		//JustDelay 
            System.out.print(getName()); 
	}
	System.out.print("-");
	}   
    public static void main (String[] args) {
        Thread t1 = new Thread_11("A");
        Thread t2 = new Thread_11("B");
        t1.setPriority(Thread.NORM_PRIORITY + 2);
        t2.setPriority(Thread.NORM_PRIORITY - 2);
        System.out.println("Priority of Thread 1 = " + t1.getPriority());
        System.out.println("Priority of Thread 2 = " + t2.getPriority());
        t1.start(); 
        t1.interrupt();
        t2.start();
    }
}
