/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

public class Thread_10 {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++)  {
            System.out.println("Loop " + i + " Executing");
            System.out.println("Please Wait a second");
            try{
                Thread.sleep(1);  // Time in ms
            } catch (InterruptedException exc) {
                System.out.println(exc.getMessage());
            }
        }
        System.out.println("Thank you!");
    }
}
