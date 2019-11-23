package com.greet.unit1;

public class TypeInterfernce {
	public static void main(String [] args)
	{
		StringLengthLambda myLambda = (String s) -> s.length();
		StringLengthLambda strlambda = (s) -> s.length();
		StringLengthLambda strLambda2= s -> s.length();
		System.out.println(myLambda.getlength("Hello Lambda"));
		System.out.println(strlambda.getlength("Hello Lambda1"));
		System.out.println(strLambda2.getlength("helloLambda123"));
		
		printLmabda(s -> s.length());
	}
	
	public static void printLmabda(StringLengthLambda l)
	{
		System.out.println(l.getlength("Hello Lambdawer"));
	}

}

interface StringLengthLambda
{
	int  getlength(String s);
}
