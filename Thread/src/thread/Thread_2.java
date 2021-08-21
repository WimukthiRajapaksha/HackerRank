/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author wimukthirajapaksha
 */
public class Thread_2 implements Runnable{
    public void run(){  
        System.out.println("thread is running..");  
    }  

    public static void main(String args[]){  
        Thread_2 m1=new Thread_2();  
        Thread t1 =new Thread(m1);  
        t1.start(); 
        t1.setPriority(10);
        
        System.out.println("++"+t1.isAlive());
        t1.interrupt();
        System.out.println("+-"+t1.isInterrupted());
        t1.stop();
        System.out.println("---" + t1.isAlive());
        
    }  
}
