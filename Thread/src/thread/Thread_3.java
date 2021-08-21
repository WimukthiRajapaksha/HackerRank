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
public class Thread_3 {
    public void run(){  
        for(int i=1;i<5;i++){  
          try{
              Thread.sleep(500);
          }catch(InterruptedException e){
              System.out.println(e);
          }  
          System.out.println(i);  
        }  
    } 
    public static void main(String args[]){  
        Thread_3 t1=new Thread_3();  
        Thread_3 t2=new Thread_3();  

        t1.run();
//        t1.sleep();
        t2.run();  
    }
}
