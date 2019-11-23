package com.brains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import com.greet.unit1.Person;

public class StandardFunctionalInterfaceExample {
	public static void main(String [] args)
	{
		List<Person> people=Arrays.asList(new Person("love", "bhatia", 26),
				new Person("tarun", "soni", 28),
				new Person("anuj", "soni", 26),
				new Person("prateek", "gupta", 29)
				);
		
		//sort list by last name
		Collections.sort(people,(Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		
		//create a method that prints all elements in list
		System.out.println("All Persons printing");
		printAll(people,p -> true, p -> System.out.println(p));
		System.out.println(" ");
		
		//any condition while print
		performConditionally(people,p -> p.getLastName().startsWith("s"), (p) -> System.out.println(p.getLastName()));
		System.out.println(" ");
		performConditionally(people,p -> p.getFirstName().startsWith("t"), p -> System.out.println(p.getFirstName()));
	}
	
	private static void performConditionally(List<Person> people, Predicate<Person> condition,Consumer<Person> consumer) 
	{
		for(Person p : people)
		{
			if(condition.test(p))
			{
				consumer.accept(p);
				//System.out.println(p);
			}
		}
		
	}
	
	private static void printAll(List<Person> people, Predicate<Person> predicate,Consumer<Person> consumer) 
	{
		for(Person p : people)
		{
			if(predicate.test(p))
			{
					consumer.accept(p);
			}
		}
		
	}
}


