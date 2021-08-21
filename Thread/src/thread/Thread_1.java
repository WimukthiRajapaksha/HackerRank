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
public class Thread_1 extends Thread{
    public void run(){  
        System.out.println("thread is running...");  
    }  
    public static void main(String args[]){  
        Thread_1 t1=new Thread_1();  
        t1.start();
        t1.run();
        try {
            t1.join(100);
        } catch (InterruptedException ex) {
        }
    }  
}
