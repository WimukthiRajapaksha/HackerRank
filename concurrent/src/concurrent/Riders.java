package concurrent;

import java.util.concurrent.Semaphore;

public class Riders extends Thread{
    Semaphore sem;
    Semaphore mut;
    Semaphore bus;
    Semaphore allBro;
    Semaphore multiplex;
    int count;
    int count_rider;

    public Riders(Semaphore mut, Semaphore multiplex, Semaphore bus, Semaphore allBro, int count, int count_rider) {
        this.mut = mut;
        this.bus = bus;
        this.allBro = allBro;
        this.count = count;
        this.multiplex = multiplex;
        this.count_rider = count_rider;
    }

    @Override
    public void run() {
        try {
            System.out.println("rider");
            multiplex.acquire();
            mut.acquire();
            count += 1;
            mut.release();
            bus.acquire();
            multiplex.release();
            boardBus();
            count -= 1;
            if (count == 0) {
                allBro.release();
            } else {
                bus.release();                                  
            }
        } catch (InterruptedException ex) {
            
        }
    }
    
    public void boardBus() {
        System.out.println("riders.");
    }
}
