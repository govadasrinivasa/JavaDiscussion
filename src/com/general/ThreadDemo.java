package com.general;

class ControlledThread extends Thread {

    private boolean suspended = false;

    public ControlledThread(String name) {
        super(name);
    }

    // Safe suspend method using wait/notify
    public synchronized void mySuspend() {
        suspended = true;
    }

    // Safe resume method
    public synchronized void myResume() {
        suspended = false;
        notify();   // wakes waiting thread
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {

                synchronized (this) {
                    while (suspended) {
                        wait(); // simulate suspend safely
                    }
                }

                System.out.println(getName() + " → Count: " + i);

                Thread.sleep(500); // simulate work
            }

        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted!");
        }

        System.out.println(getName() + " finished execution.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        ControlledThread t1 = new ControlledThread("Worker-1");
        ControlledThread t2 = new ControlledThread("Worker-2");

        // Set thread priorities
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Priority of " + t1.getName() + " = " + t1.getPriority());
        System.out.println("Priority of " + t2.getName() + " = " + t2.getPriority());

        // Start threads
        System.out.println("Starting threads...");
        t1.start();
        t2.start();

        try {
            Thread.sleep(1500);

            System.out.println("\nSuspending Worker-1...");
            t1.mySuspend();

            Thread.sleep(1500);

            System.out.println("Resuming Worker-1...");
            t1.myResume();

            Thread.sleep(1000);

            System.out.println("\nInterrupting Worker-2...");
            t2.interrupt();

            // Check alive status
            System.out.println("\nt1 alive? " + t1.isAlive());
            System.out.println("t2 alive? " + t2.isAlive());

            // Wait for threads to finish
            System.out.println("\nWaiting for threads to join...");
            t1.join();
            t2.join();

            System.out.println("\nAfter join →");
            System.out.println("t1 alive? " + t1.isAlive());
            System.out.println("t2 alive? " + t2.isAlive());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nMain thread finished.");
    }
}

