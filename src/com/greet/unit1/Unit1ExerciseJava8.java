package com.greet.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseJava8 {
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
		printAll(people,p -> true);
		System.out.println(" ");
		
		//any condition while print
		printConditionally(people,p -> p.getLastName().startsWith("s"));
		System.out.println(" ");
		printConditionally(people,p -> p.getFirstName().startsWith("t"));
	}
	
	private static void printConditionally(List<Person> people, Condition condition) 
	{
		for(Person p : people)
		{
			if(condition.test(p))
			{
				System.out.println(p);
			}
		}
		
	}
	
	private static void printAll(List<Person> people, Predicate<Person> predicate) 
	{
		for(Person p : people)
		{
			if(predicate.test(p))
			{
				System.out.println(p);
			}
		}
		
	}
}
	

/*
 * private static void printLastNamebeginwithC(List<Person> people) { for(Person
 * p : people) { System.out.println(p);
 * 
 * } }
 */



