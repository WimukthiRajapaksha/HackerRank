package concurrent;

// java program to demonstrate
// use of semaphores Locks
import java.util.Random;
import java.util.concurrent.*;

//A shared resource/class.
class Shared_1
{
    static int riders = 0;
}

class SubThread extends Thread
{
    private Semaphore mutex;
    private Semaphore multiplex;
    private Semaphore bus;
    private Semaphore allAboard;

    private String threadName;
    private int index;

    public SubThread(Semaphore mutex, Semaphore multiplex, Semaphore bus, Semaphore allAboard, String threadName, int index)
    {
        super(threadName);
        this.mutex = mutex;
        this.multiplex = multiplex;
        this.bus = bus;
        this.allAboard = allAboard;
        this.threadName = threadName;
        this.index = index;
    }

    @Override
    public void run() {

        // Run by thread Bus
        if(this.getName().equals("Bus"))
        {
            System.out.println("Starting " + threadName + " : " + index);
            try
            {
                // First, get a permit.
                System.out.println(threadName +" : "+ + index + " --> waiting for a permit.");

                // Acquiring the lock
                mutex.acquire();
                System.out.println(threadName +" : "+ + index + " --> mutex : wait");

                    if(Shared_1.riders > 0) {
                        //bus semaphore up()
                        bus.release();
                        System.out.println(threadName +" : "+ + index + " --> bus : signal");

                        //allAboard semaphore down()
                        allAboard.acquire();
                        System.out.println(threadName +" : "+ + index + " --> allAboard : wait");
                    }

                // Release the mutex
                System.out.println(threadName +" : "+ + index + " --> mutex : signal");
                depart(this.index);
                mutex.release();

            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }

        // run by thread Rider
        else
        {
            System.out.println("Starting " + threadName + " : " + index);
            try
            {
                // First, get a permit.
                System.out.println(threadName + " : " + index + " --> waiting for a permit.");

                // multiplex semaphore wait()
                System.out.println(threadName + " : "+ index + " --> multiplex : wait");
                multiplex.acquire();

                    // acquiring mutex lock
                    mutex.acquire();
                    System.out.println(threadName + " : "+ index + " --> mutex : wait");

                        Shared_1.riders += 1;
                        System.out.println("Riders : " + Shared_1.riders);

                    // releasing mutex lock
                    System.out.println(threadName + " : " + index + " --> mutex : signal");
                    mutex.release();

                    //bus semaphore wait()
                    System.out.println(threadName + " : " + index + " --> bus : wait");
                    bus.acquire();


                //multiplex semaphore up()
                System.out.println(threadName + " : " + index + " --> multiplex : signal");
                multiplex.release();

                boardBus(this.index);

                Shared_1.riders -= 1;
                System.out.println("Riders: " + Shared_1.riders);

                if(Shared_1.riders == 0){

                    //allAboard semaphore up()
                    allAboard.release();
                    System.out.println(threadName + " : " + index + " --> allAboard : signal");

                } else {

                    //bus semaphore up()
                    bus.release();
                    System.out.println(threadName + " : " + index + " --> bus : signal");

                }

            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }

    private void boardBus(int index){
        System.out.println("Rider : " + index + " --> boarded the bus");
    }

    private void depart(int index){
        System.out.println("Bus : " + index + " --> departed");
    }
}

// Driver class
public class SemaphoreDemo_1
{
    public static void main(String args[]) throws InterruptedException
    {
        // Creating a Semaphore objects
        Semaphore mutex = new Semaphore(1);
        Semaphore multiplex = new Semaphore(50);
        Semaphore bus = new Semaphore(0);
        Semaphore allAboard = new Semaphore(0);

        // Generating rider threads in the given distribution of time intervals

        Thread riderGeneratingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int rider_count = 1;
                while(true) {
                    SubThread riderThread = new SubThread(mutex, multiplex, bus, allAboard, "Rider", rider_count);
                    riderThread.start();
                    rider_count++;
                    try {
                        Thread.sleep(getArrivalTime(30f * 1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // Generating bus threads in the given distribution of time intervals.

        Thread busGeneratingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int bus_count = 1;
                try {
                    while(true) {
                        Thread.sleep(getArrivalTime(20 * 60f * 1000));
                        SubThread busThread = new SubThread(mutex, multiplex, bus, allAboard, "Bus", bus_count);
                        busThread.start();
                        bus_count++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        riderGeneratingThread.start();
        busGeneratingThread.start();

        riderGeneratingThread.join();
        busGeneratingThread.join();

        //if all the passengers are on board then execution will terminate and final riders count will be 0
        System.out.println("Riders: " + Shared_1.riders);
    }

    private static long getArrivalTime(float arrivalMeanTime){
        Random random = new Random();
        float lambda = 1 / arrivalMeanTime;

        return Math.round(-Math.log(1 - random.nextFloat()) / lambda);
    }
}


