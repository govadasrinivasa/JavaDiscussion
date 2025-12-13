package com.general;

class Printer {

    // synchronized method uses intrinsic lock of Printer object
    synchronized void printDocument(String threadName) {

        System.out.println(threadName + " acquired the lock");

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " printing page " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted");
        }

        System.out.println(threadName + " released the lock\n");
    }
}

class PrintTask extends Thread {
    Printer printer;

    PrintTask(Printer printer, String name) {
        super(name);
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printDocument(getName());
    }
}

public class IntrinsicLock {
    public static void main(String[] args) {

        Printer sharedPrinter = new Printer();

        Thread t1 = new PrintTask(sharedPrinter, "Thread-1");
        Thread t2 = new PrintTask(sharedPrinter, "Thread-2");
        Thread t3 = new PrintTask(sharedPrinter, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
