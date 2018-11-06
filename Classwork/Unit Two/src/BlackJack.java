
public class BlackJack {	
	
	private static final double NUM_SUITS = 4;
	private static final double NUM_FACES = 13;
	private static final int BLACK_JACK = 21;
	
public static void main(String[] args) {
	int numAces = 0;
	String playerHand = "";
	int playerHandValueLowAce = 0;
	int playerHandValue = 0;
	
	for (int i =0; i<2; i++) {
		String card = getCard();		
		playerHand += card + " ";
		
		if(isAce(card)) {
			numAces++;
		}		
		playerHandValueLowAce = updateHandValueLowAce(playerHandValueLowAce, card);
		playerHandValue = updateHandValue(playerHandValueLowAce, numAces);
	}
	System.out.println(playerHand);
	System.out.println("NUmber of Aces: " + numAces);
	System.out.println("Total with low Aces: " + playerHandValueLowAce);
	System.out.println("Total: " + playerHandValue);
		
	}


	private static int updateHandValue(int playerHandValueLowAce, int numAces) {
		int total = playerHandValueLowAce;
		while(numAces>0 && total <= BLACK_JACK - 10) {
			total+=10;
			numAces--;
		}
		return total;
	}	


	public static String getCard(){
	 	return getFace() + getSuit();
	}

	public static String getFace(){
		int x = (int) (Math.random()*NUM_FACES)+2;
		
		if (x>=2 && x<=10) {
			return "" + x;
		}
		
		else if (x==11) {
			return "J";
		}else if(x==12) {
			return "Q";
		}else if(x==13) {
			return "K";
		}else {
			return "A";
		}
	} 

	public static String getSuit(){
		int x = (int) (Math.random() * NUM_SUITS);
		if (x==0) {
			return "H";
		}else if(x==1) {
			return "C";
		}else if(x==2) {
			return "S";
		}else {
			return "D";
		}
		
	}

	public static boolean isAce(String card){
	
		return card.indexOf("A") >= 0;
	}  

	public static int getCardValue(String card){	
		
		if(card.length()==3) {
			return 10;
		}
		String face = card.substring(0,1);
		if (face.equals("A")) {
			return 1;
		}
		try {
			int x = Integer.parseInt(face);
			return x;
		}catch(Exception ex) {
			return 10;
		}
	} 

	public static int updateHandValueLowAce(int playerHandValue, String newCard){
		
		playerHandValue += getCardValue(newCard);
		return playerHandValue;
	} 


	

}
