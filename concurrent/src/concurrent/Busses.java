package concurrent;

import java.util.concurrent.Semaphore;

public class Busses extends Thread{
    int busId;
    int count;
    Semaphore bus;
    Semaphore mut;
    Semaphore allBro;
    Riders riders;
    int count_bus;
    
    public Busses(Semaphore mut, Semaphore bus, Semaphore allBro, int count, int count_bus) {
        this.mut = mut;
        this.bus = bus;
        this.allBro = allBro;
        this.count = count;
        this.count_bus = count_bus;
    }

    @Override
    public void run() {
        try {
            System.out.println("buss");
            mut.acquire();
            if (count > 0){
                bus.acquire();
                System.out.println("bus "+ count_bus);
                allBro.release();
            }
            mut.acquire();
            depart();
        } catch (InterruptedException ex) {
            
        }
    }
    
    public void depart() {
        System.out.println("depart");
    }
    
}
