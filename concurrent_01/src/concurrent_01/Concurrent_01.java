/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrent_01;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 *
 * @author wimukthirajapaksha
 */
public class Concurrent_01 {

    
    public static void main(String[] args) {
        Counter c = new Counter();
        for (int i = 0; i < 5; i++) {
            Worker w = new Worker(c);
            new Thread(w).start();
        }
    }
    
}

class Worker implements Runnable {
    private Counter c;
    public Worker(Counter c) {
        this.c = c;
    }
    public void run() {
       while (true) {
            int count = (int)c.getAndIncrement();
            if (count >= 1000) break;
//            longOperation();
        } 
    }
}

class Counter {
    private long value;
    private Lock lock;
    public int getAndIncrement() {
        int temp;
        lock.lock();
        try {
            temp = (int)value;
            value = value + 1;
        } finally {
            lock.unlock();
        }
        return temp;
    }
}

class Abc implements Lock{

    @Override
    public void lock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unlock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condition newCondition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean tryLock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
 