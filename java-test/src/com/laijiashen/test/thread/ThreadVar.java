package com.laijiashen.test.thread;

import java.util.concurrent.CountDownLatch;

public class ThreadVar {
	
	public static volatile int var = 10;
	
	public static void name() throws InterruptedException {
		
		 //����2�����CountDownLatch����  
		CountDownLatch countDownLatch = new CountDownLatch(2);  
		
		Thread t1 = new Thread(new ThreadA(countDownLatch));
		
		Thread t2 = new Thread(new ThreadA(countDownLatch));
		
		t1.start();
		t2.start();
		
		//����await����������ǰ�̣߳��ȴ����߳���ɺ��ڼ���ִ��
		countDownLatch.await();
		if (ThreadVar.var==11) {
			System.out.println("===========================");
		}
		System.out.print(ThreadVar.var+"\t");
	
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 1000; i++) {
			ThreadVar.name();
			ThreadVar.var=10;
		}
	}

}


class ThreadA implements Runnable{
	
    private CountDownLatch countDownLatch;  
    
    public ThreadA(CountDownLatch countDownLatch) {  
//    	super();
        this.countDownLatch = countDownLatch;  
    }  

	@Override
	public void run() {
		ThreadVar.var++;
		countDownLatch.countDown();
	}
}

class ThreadB implements Runnable{

	@Override
	public void run() {
		ThreadVar.var++;
	}
}
