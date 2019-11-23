package com.brains.unit1;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
	public static void main(String [] args)
	{
		int [] someNumber= {1,2,3,4};
		int key=0;
		
		processNumbers(someNumber,key,(a,b) -> 
		{
			try {
				System.out.println(a/key);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		});
	}

	private static void processNumbers(int [] someNumbers,int key,BiConsumer<Integer, Integer> biConsumer) {
		for(int i : someNumbers)
		{
		biConsumer.accept(i, key);
		}
		
		
	}

}
