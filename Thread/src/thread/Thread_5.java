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
public class Thread_5 extends Thread{
    public void run() {
        System.out.println("\nThe EvenGen thread started!");
        System.out.println("\nEvenGen Thread Prints Even Numbers:");
        for (int i =1; i<=10; i++)
            System.out.print(i% 2 == 0 ? i + " " : "");
    }
    
    public static void main(String[] args) {
    	System.out.println("Constructing the EvenGen Thread...");
        Thread_5 ev = new Thread_5();
        System.out.println("Starting the EvenGen thread from main ...");
        ev.start();
        System.out.println("Now in the main Thread!");
        System.out.println("main Thread Prints Odd Numbers:");
        for (int i =1; i<=10; i++)
            System.out.print( (i % 2 != 0 ) ? i + " ": "");
    }	

}
