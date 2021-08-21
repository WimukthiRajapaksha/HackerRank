/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

class A2 extends Thread {
  public void run() {
    for (int i =1; i<=5; i++){
        if (i==2) 
            Thread.yield();
            System.out.println("Now in Thread A1:" + i + "  ");
        }  
    } 
}

class B2 extends Thread {
    public void run() {
        try {
            for (int j =1; j<=5; j++){  
                if (j == 3)
                    Thread.sleep(1000);
                else
                    System.out.println("Now in Thread B1:" +j + "  ");
            }
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException occur");
        }
    }
}  


public class Thread_9 {
    public static void main (String[] args) {
        A2 a = new A2();
        B2 b = new B2();
        a.start();
        b.start();
        a.interrupt();	// Interrupt thread a
        System.out.println("Finishing main ...");
    } 
}
