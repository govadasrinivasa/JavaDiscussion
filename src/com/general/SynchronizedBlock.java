package com.general;

class Task {
    // Shared method using synchronized block
    public void printNumbers(String threadName) {
        synchronized (this) {   // synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " → " + i);

                try {
                    Thread.sleep(1000);  // simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " completed.\n");
        }
    }
}

class WorkerThreads extends Thread {

    private Task task;

    public WorkerThreads(String name, Task task) {
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
        Thread t1 = new WorkerThreads("Thread-1", sharedTask);
        Thread t2 = new WorkerThreads("Thread-2", sharedTask);
        Thread t3 = new WorkerThreads("Thread-3", sharedTask);
        Thread t4 = new WorkerThreads("Thread-4", sharedTask);
        Thread t5 = new WorkerThreads("Thread-5", sharedTask);

        // Start all threads
        long startTime = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time = "+(endTime - startTime));
    }
}