package com.general;

public class ThreadDeadlock {

    static final Object lockA = new Object();
    static final Object lockB = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Thread-1 locked lockA");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread-1 waiting for lockB");
                synchronized (lockB) {
                    System.out.println("Thread-1 locked lockB");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Thread-2 locked lockB");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread-2 waiting for lockA");
                synchronized (lockA) {
                    System.out.println("Thread-2 locked lockA");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
