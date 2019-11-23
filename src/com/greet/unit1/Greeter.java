package com.greet.unit1;

public class Greeter {
	public void greet()
	{
		System.out.println("Hello world");
	}
	
	
	
	public void grret(Greeting greeting)
	{
		greeting.perform();
	}
	public static void main(String [] args)
	{
		Greeter greeter=new Greeter();
		greeter.greet();
		
		
		Greeting greeting=new HelloWorldGreeting();
		Greeting myLambdaFunction =()-> System.out.println("hello");
		
		Greeting greeting2=new  Greeting()
				{
					public void perform()
					{
						System.out.println("Helloworld");
					}
				};
				greeter.grret(myLambdaFunction);
				greeter.grret(greeting2);
				
		
		
		
		
		
		myLamba1 addFunction = ( a,  b) -> System.out.println(a+b);
		
	}

}

interface myLamba{
	void foo();
	
}
interface myLamba1{
	void foo(int a, int b);
	
}
