package com.general;

public class GFC {

	public static void main(String[] args) {
		Thread2 t = new Thread2();
		t.start();
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		synchronized (t) {
			try {
				System.out.println("Waiting Thread2 to complete ...");
				t.wait();
			}catch(InterruptedException e) {
				
			}
			System.out.println("total = "+t.total);
		}
	}

}
class Thread2 extends Thread {
	
	int total;
	
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				total+=i;
			}
			notify();
		}
	}
}