package com.general;

class Counter {
    int count = 0;

    // Not synchronized
    void increment() {
        count++;   // Read → Modify → Write (not atomic)
    }
}

class IncrementThread extends Thread {
    Counter counter;

    IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadInterference {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new IncrementThread(counter);
        Thread t2 = new IncrementThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.count);
    }
}

