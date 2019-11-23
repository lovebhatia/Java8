package com.greet.unit1;

public class RunnnableExample implements Runnable {

	public void run() {
		System.out.println("Runnable method");
	}
	
	public static void main(String [] args)
	{
		System.out.println(Thread.currentThread().getName());
		RunnnableExample example=new RunnnableExample();
		Thread t=new Thread(example);
		t.start();
		
		//anonymous class thread
		Thread t2=new Thread(new Runnable(){
			@Override
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println("Anonymous run method");
			}
			
		});
		
		t2.start();
		Thread lambdaThread= new Thread(() -> {
		System.out.println(Thread.currentThread().getName());
		System.out.println("lambda thread");
		});
		System.out.println(Thread.currentThread().getName());
		lambdaThread.start();
	
}
}
