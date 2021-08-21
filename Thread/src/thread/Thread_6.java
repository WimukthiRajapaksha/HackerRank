/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

class OddGen extends Thread   {
    public void run() {
        System.out.println("\nOddGen thread started!\n");
        System.out.println("\nOddGen Prints Odd Numbers:\n");
        for (int i =1; i<=10; i++)
            System.out.print( (i % 2 != 0 ) ? i + " ": "");
    }
}

class EvenGen extends Thread   {
    public void run() {
        System.out.println("EvenGen thread started!\n");
        System.out.println("EvenGen Prints Even Numbers:\n");
        for (int i =1; i<=10; i++)
            System.out.print(i% 2 == 0 ? i + " " : "");
    }
    
}

public class Thread_6 {
    public static void main(String[] args)    {
        System.out.println("Constructing the EvenGen Thread...\n");
        EvenGen ev = new EvenGen();
        OddGen od = new OddGen();
        System.out.println("Starting the EvenGen thread from main ...\n");
        ev.start();
        System.out.println("\nStarting the OddGen thread from main ...\n");
        od.start();
        System.out.println("\nNow in the main Thread!\n");
    }
}
