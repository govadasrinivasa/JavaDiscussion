package com.general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class FileTask implements Runnable {

    private final Object lock;       // shared lock object
    private final File file;         // file to read/write

    public FileTask(Object lock, File file) {
        this.lock = lock;
        this.file = file;
    }

    @Override
    public void run() {
        synchronized (lock) {   // only one thread at a time
            try {
                String threadName = Thread.currentThread().getName();

                // -------------------------
                // Write to file
                // -------------------------
                FileWriter fw = new FileWriter(file, true); // append mode
                fw.write(threadName + " wrote this line.\n");
                fw.close();

                System.out.println(threadName + " wrote to file.");

                Thread.sleep(500);  // simulate work

                // -------------------------
                // Read file
                // -------------------------
                BufferedReader br = new BufferedReader(new FileReader(file));
                System.out.println("\n" + threadName + " is reading file content:");

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("  " + line);
                }
                br.close();

                System.out.println(threadName + " finished.\n");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class FilewithRunnable {

    public static void main(String[] args) throws Exception {

        File file = new File("thread_data.txt");

        // Clear file before starting
        FileWriter fw = new FileWriter(file);
        fw.write("");   // empty the file
        fw.close();

        Object lock = new Object();   // shared lock object

        // Create 5 threads
        Thread t1 = new Thread(new FileTask(lock, file), "Thread-1");
        Thread t2 = new Thread(new FileTask(lock, file), "Thread-2");
        Thread t3 = new Thread(new FileTask(lock, file), "Thread-3");
        Thread t4 = new Thread(new FileTask(lock, file), "Thread-4");
        Thread t5 = new Thread(new FileTask(lock, file), "Thread-5");

        // Start all 5 threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}