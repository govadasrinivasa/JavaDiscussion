package com.general;

public class VolatileTest {

	public static void main(String[] args) throws InterruptedException {
		// Volatile test
        VolatileCounter volatileCounter = new VolatileCounter();
        Thread v1 = new VolatileThread(volatileCounter);
        Thread v2 = new VolatileThread(volatileCounter);

        v1.start();
        v2.start();
        v1.join();
        v2.join();

        System.out.println("Volatile Count (Expected 2000): "
                + volatileCounter.count);
	}

}
class VolatileCounter {
    volatile int count = 0;

    void increment() {
        count++;   // NOT atomic
    }
}

class VolatileThread extends Thread {
    VolatileCounter counter;

    VolatileThread(VolatileCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
