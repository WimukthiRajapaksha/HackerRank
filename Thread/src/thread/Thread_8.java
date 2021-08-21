/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadX extends Thread {
    public void run()   {
        for (int i=0; i<5 ; i++)
            System.out.println(Thread.currentThread().getName()  + " is running");
    }
}

public class Thread_8 {
    public static void main(String[]args) throws InterruptedException  {
        ThreadX t = new ThreadX();
        t.start();
//        Thread.sleep(1000);
        for (int i=0; i<5; i++)  {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }

}
