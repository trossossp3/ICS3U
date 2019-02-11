package com.bayviewglen.dayone;

public class ThinkingCap {

	//class is the blueprint
	//object is instance of class
	/* private instance variable/members 
	 * every instance of the class (each object)
	 * gets its own instance variables.
	 * 
	 * They also get their own instance methods.
	 * The instance methods belong to the object 
	 */
	
	// non-static members belong to the Object
	// define the State of the Object
	private String redWords;
	private String greenWords;
	
	// static member belong to the Class
	private static String blueWords;
	
	public ThinkingCap(){
		redWords = "";
		greenWords = "";
	}
	
	// this refers to an instance of this class
	// if code elsewhere was called cap1 = ThinkingCap("a","b");
	// then "this" is another way to represent "cap1"
	
	public ThinkingCap(String redWords, String greenWords){
		this.redWords = redWords;
		this.greenWords = greenWords;
	}
	
	public ThinkingCap(String redWords, String greenWords, String blueWords){
		this.redWords = redWords;
		this.greenWords = greenWords;
		ThinkingCap.blueWords = blueWords;
	}
	
	// methods describe the behaviour / actions of the object
	public String pushRed(){
		return redWords;
	}
	
	public String pushGreen(){
		return greenWords;
	}
	
	public String pushBlue(){
		return blueWords;
	}
	
	public void insertBlue(String msg){
		blueWords = msg;
	}
	
	public void insertGreen(String msg){
		greenWords = msg;
	}
	
	public void insertRed(String msg){
		redWords = msg;
	}

}
