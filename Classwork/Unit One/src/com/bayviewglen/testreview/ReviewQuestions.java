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
		
		
		
		
		
		
		
		
		
	}
}
