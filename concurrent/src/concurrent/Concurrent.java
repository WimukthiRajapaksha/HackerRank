package concurrent;

import java.util.concurrent.*;

public class Concurrent extends Thread{
    public static Riders rider;
    public static Semaphore mutex; 
    public static Semaphore multiplex;
    public static Semaphore busSem;
    public static Semaphore allAboard;
    
    public static Busses bus;
    
    static int count_bus;
    static int count_rider;
    
    
    public static int riders;
//    static int busses;

    public Concurrent() {
        riders = 0;
        mutex = new Semaphore(1);
        multiplex = new Semaphore(4);
        busSem = new Semaphore(0);
        allAboard = new Semaphore(0);
        count_bus = 1;
        count_rider = 1;
//        busses = 0;
    }
    
    public static void main(String[] args) throws Exception {
//        sem = new Semaphore(50);
//        mutex = new Semaphore(1);
//        Concurrent conc = new Concurrent();
//        int a =2;
//        while (a < 4) {            
//        conc.mutex.acquire();

//        myThread = new Thread(new Server());
//        myThread.start();

        
        

        Busses buss_ = new Busses(mutex, busSem, allAboard, riders, count_bus);
        Riders ride_ = new Riders(mutex, multiplex, busSem, allAboard, riders, count_rider);
        
        buss_.start();
        ride_.start();
        
        buss_.join();
        ride_.join();
        
//            conc.mutex.release();

//            conc.sema.acquire();
        
//            conc.sema.release();
//            a++;
        }
    
}
