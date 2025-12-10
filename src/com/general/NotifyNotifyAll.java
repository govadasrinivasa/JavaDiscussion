package com.general;

class WorkerThread extends Thread {

    private final Object lock;

    public WorkerThread(String name, Object lock) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                System.out.println(getName() + " is waiting...");
                lock.wait();   // thread enters waiting state
                System.out.println(getName() + " is resumed!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class NotifyNotifyAll {

    public static void main(String[] args) throws Exception {

        Object sharedLock = new Object();

        // Create 5 threads
        WorkerThread t1 = new WorkerThread("Thread-1", sharedLock);
        WorkerThread t2 = new WorkerThread("Thread-2", sharedLock);
        WorkerThread t3 = new WorkerThread("Thread-3", sharedLock);
        WorkerThread t4 = new WorkerThread("Thread-4", sharedLock);
        WorkerThread t5 = new WorkerThread("Thread-5", sharedLock);

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Give time for all threads to start waiting
        Thread.sleep(2000);

        // -------------------------------
        // First notify() → wakes 1 thread
        // -------------------------------
        synchronized (sharedLock) {
            System.out.println("\nMain thread calling notify()...");
            sharedLock.notify();
        }

        Thread.sleep(2000);

        // --------------------------------
        // notifyAll() → wakes all threads
        // --------------------------------
        synchronized (sharedLock) {
            System.out.println("\nMain thread calling notifyAll()...");
            sharedLock.notifyAll();
        }
    }
}