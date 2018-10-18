package com.bayviewglen.testreview;

public class ReviewQuestions {

	public static void main(String[] args) {
		int count = 5;
		double multiplier = 2.5;
		int answer = (int) (count * multiplier);
		answer = (answer*count)%10;
		System.out.println(answer);
		
		
		int var = 12;
		var = var%7;
		var--;
		System.out.println(var);
		
		
		
		String cat = "cat";
		System.out.println(cat.substring(0,3)); //why is it that three is ok but 4 is not
		
		
		System.out.println(7+8+(7+8)+"Hello"+7+8+(7+8)); //30Hello7815
		
		String entry2 = "CS";
		String entry1 = "AP";
		
		entry2 = entry1;
		entry1 = entry1+entry2;
		String entry3 =entry1+entry2;
		System.out.println(entry3);
		
		String str1 = "presto chango";
		String str2 = "abracadabra";
		int i = str1.indexOf("a");
		System.out.println(str2.substring(i,i+1)+i);
		
		/*String s1 = "avocado";
		String s2 = "banana";
		System.out.println(s1.compareTo(s2)+" "+s2.compareTo(s1));
		*/
		System.out.printf("\n%06.3f\n", 23.123);
		System.out.printf("%-10.2f", 1.32);
		
		
		int x= 3;
		int y=2;
		
		System.out.println(x+y/4);
		
		String s1 = "java";
		String s2 = "java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		
		int number = 123232;
		int digit1 = number/100000;
		int digit6 = number%10;
		int digit2 = number/10000%10;
		int digit3 = number/1000%10;
		int digit4 = number/100%10;
		int digit5 = number/10%10;
		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit3);
		System.out.println(digit4);
		System.out.println(digit5);
		System.out.println(digit6);
		
		
		int n1;
		Integer N1 = new Integer(2);
		System.out.println(N1);
		System.out.println();
		System.out.println(N1.intValue());
		System.out.println(Integer.MAX_VALUE);
		
		double d1 = 1.232;
		Double D1 = new Double(d1);
		System.out.println(D1);
		System.out.println(D1.doubleValue());
		
		final int CONSTANT_VALUE = 10;
		System.out.println(CONSTANT_VALUE);
		
		int upper = 10;
		int lower = 5;
		
		int rand = (int) (Math.random()*(upper-lower+1))+lower;
		System.out.println(rand);
		
		//int n2 = 10/0; //arithmetic exception
		
		//String s5 = "Happy".substring(10); //String index out of bounds exception
		
		String s6 = null;
		
		//System.out.println(s6.length());
		
		
		int rand2 = (int) Math.random() * 5;
		System.out.println("i like caker".substring(rand2));
		
	}
}
