package com.laijiashen.test.thread;



public class ThreadPrint {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());
		Thread t3 = new Thread(new Thread3());
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
	}
	
}


class Thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("t1");
	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("t2");
	}
}

class Thread3 implements Runnable{

	@Override
	public void run() {
		System.out.println("t3");
	}
}