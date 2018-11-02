package com.bayviewglen.dayfive;

public class ExampleOne {
	
	// public means everything in the project can see and use the method
	//public refers to viability 
	// static means do not construct a object for the class
	
	
	// round brackets are the parameter
	//public static returnType methodName(parameter list){ ... }
	//methods perform a specific task
	//they may or may not return a value
	public static int cube(int x) {
		return x*x*x;
	}
	
	public static void main(String[] args) {
		
		/*
		String s1 = new String("hello");
		s1.length(); //non- static methods are linked to an instance of the object
						//the object objectname.methodname()
	
		Math.sqrt(10); 	//static method - not linked to an object
						//belongs to the class classname.methodname()
	*/
		/*
		int number = 3;
		int result = cube(number);
		System.out.println("the cube of " + number + " is " + result);
		*/
		/*
		Dog dog1 = new Dog();
		System.out.println("1: " + dog1.display());
		mystery2(dog1);
		System.out.println("4: " + dog1.display());
		*/
		
		
		Integer i = new Integer(10);
		System.out.println("1 : " + i);
		mystery3(i);
		System.out.println("2 : " + i);
		
		//wrapper class are immutable 
		/*
		int x = 10;
		System.out.println("1: " + x);
		mystery(x);
		System.out.println("4: " + x);
		*/
	}
	
	public static void mystery3(Integer i) {
		System.out.println("2 : " + i);
		i++;
		System.out.println("3 : " + i);
		
	}

	public static void mystery(int x) {
		System.out.println("2: " + x);
		x++;
		System.out.println("3: " + x);
	}
	
	//for non-primative method they have the reference to an object so it changes the object

	
	public static void mystery2(Dog dog) {
		System.out.println("2: " + dog.display());
		dog.addSpots();
		System.out.println("3: " + dog.display());
	}
}
