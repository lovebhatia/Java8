package com.greet.unit1;

@FunctionalInterface
public interface Greeting {
	public void perform();
	default void another()
	{
		System.out.println("hello");
	}

}
