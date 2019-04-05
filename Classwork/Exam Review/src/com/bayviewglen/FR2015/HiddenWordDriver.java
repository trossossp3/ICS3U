package com.bayviewglen.FR2015;

public class HiddenWordDriver {
	public static void main(String[] args) {
		HiddenWord Puzzle = new HiddenWord("HARPS");
		System.out.println(Puzzle.getHint("AAAAA"));
		System.out.println(Puzzle.getHint("Hello"));
		System.out.println(Puzzle.getHint("HEART"));
		System.out.println(Puzzle.getHint("HARMS"));
		System.out.println(Puzzle.getHint("HARPS"));
	}

}
