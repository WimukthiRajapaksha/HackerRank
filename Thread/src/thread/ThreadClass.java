package thread;
import java.lang.Thread;
/**
 *
 * @author wimukthirajapaksha
 */
//class ThreadA extends Thread{
//    public void run() {
//        System.out.println("threadA");
//    }
//}

class ThreadB implements Runnable{
    @Override
    public void run() {
        System.out.println("threadB");
    }
    
}

public class ThreadClass {
    public static void main(String[] args) {
        System.out.println("here we go!!");
//        ThreadA a = new ThreadA();
        Thread b = new Thread(new ThreadB());
        
//        a.start();
        b.start();
        
//        ---------------
        
//        new MyThread("One");
//        new MyThread("Two");
//        new MyThread("Three");
//        try {
//             Thread.sleep(10000);
//        } catch (InterruptedException e) {
//              System.out.println("Main thread Interrupted");
//        }
//        System.out.println("++++++++++\n" + Thread.currentThread().getPriority()+"\n+++++++++");
//        System.out.println("Main thread exiting.");
        
//        -----------------
        
    }   
}

class MyThread implements Runnable {
    String name;
    Thread t;
    MyThread(String thread){
        name = thread; 
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
        System.out.println("--------\n" + t.getPriority() + "\n---------");
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                System.out.println("sleeping: " + name);
                t.sleep(1000);
                System.out.println("waking up: " + name);
            }
        }catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}