package com.greet.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7 {
	public static void main(String [] args)
	{
		List<Person> people=Arrays.asList(new Person("love", "bhatia", 26),
				new Person("tarun", "soni", 28),
				new Person("anuj", "soni", 26),
				new Person("prateek", "gupta", 29)
				);
		
		//Step 1-: sort list by last name
		Collections.sort(people, new Comparator<Person>()
		{

			@Override
			public int compare(Person o1, Person o2) 
			{
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		
		// Step 2-: create a method that prints all elements in list
		
		System.out.println("All Persons printing");
		printAll(people);
		System.out.println(" ");
		
		//create a methos that print all people that last anme begining with t
		
		System.out.println("last name begin with s");
		printLastNamebeginwithC(people);
		System.out.println("");
		
		//any condition while print
		
		printConditionally(people,new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("s");
			}
		});
		printConditionally(people,new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("t");
			}
		});
		
		
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

	private static void printLastNamebeginwithC(List<Person> people)
	{
		for(Person p : people)
		{
			if(p.getLastName().startsWith("s"))
			{
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people)
	{
		for(Person p : people)
		{
			System.out.println(p);
		}
	}
}


class lastNameComparator implements Comparator<Person>
{
	@Override
	public int compare(Person o1, Person o2)
	{
		// TODO Auto-generated method stub
		return o1.getLastName().compareTo(o2.getLastName());
	}
}


interface Condition{
	boolean test(Person p);
}

