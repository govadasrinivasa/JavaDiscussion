package com.general;

class Task {
    // Shared method using synchronized block
    public void printNumbers(String threadName) {
        synchronized (this) {   // synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " → " + i);

                try {
                    Thread.sleep(400);  // simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " completed.\n");
        }
    }
}

class WorkerThread extends Thread {

    private Task task;

    public WorkerThread(String name, Task task) {
        super(name);
        this.task = task;
    }

    @Override
    public void run() {
        task.printNumbers(getName());
    }
}

public class SynchronizedBlock {

    public static void main(String[] args) {

        Task sharedTask = new Task();   // one shared object

        // Creating 5 threads
        Thread t1 = new WorkerThread("Thread-1", sharedTask);
        Thread t2 = new WorkerThread("Thread-2", sharedTask);
        Thread t3 = new WorkerThread("Thread-3", sharedTask);
        Thread t4 = new WorkerThread("Thread-4", sharedTask);
        Thread t5 = new WorkerThread("Thread-5", sharedTask);

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}