package com.bayviewglen.FR2015;

public class HiddenWord {
	private String target;
	public HiddenWord(String newTarget){
		target = newTarget;
	}
	
	public String getHint(String guess) {
		String s2 ="";
		for(int i =0; i< target.length();i++) {
			if(target.substring(i,i+1).equals(guess.substring(i, i+1))) {
				s2+=guess.substring(i,i+1);
			}else if(target.indexOf(guess.substring(i,i+1))>-1) {
				s2+="+";
			}else {
				s2+="*";
			}
		}
		return s2;
	}

}
