package com.greet.unit1;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String fristName,String lastName,int age)
	{
		super();
		this.age=age;
		this.firstName=fristName;
		this.lastName=lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return "Person [firstname =" +firstName + ", lastName="+lastName+", age="+age+"]";
	}
	

}
