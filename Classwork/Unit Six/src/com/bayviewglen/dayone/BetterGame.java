package com.bayviewglen.dayone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BetterGame {
	private ArrayList<Player> players;
	private int numRounds;
	
	public BetterGame(){
		players = new ArrayList<Player>();
		Scanner in = new Scanner(System.in);
		System.out.print("How many players: ");
		int numPlayers = Integer.parseInt(in.nextLine());

		
		for (int i=0; i<numPlayers; i++){
			System.out.print("What is your name:");
			players.add(new Player(in.nextLine()));
		}
		
		System.out.print("How many rounds: ");
		numRounds = Integer.parseInt(in.nextLine());
		in.close();
	}
	
	public void play(){
		for (int i=0; i<numRounds; i++){
			for (int j=0; j<players.size(); j++){
				boolean pair = players.get(j).takeTurn();
				Player p = players.get(j);
				System.out.print(p.getPlayerName() + " : " + p.getDice().displayRoll() + " ");
				if (pair)
					System.out.print("PAIR");
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		BetterGame game = new BetterGame();
		game.play();
		game.sortPlayers();
		game.displayStandings();
	}

	private void displayStandings() {
		System.out.println("\n\nStandings\n---------");
		for (Player p : players){
			System.out.println(p);
		}
		
	}

	private void sortPlayers() {
		Collections.sort(players, new PlayerSort());
	}

}
