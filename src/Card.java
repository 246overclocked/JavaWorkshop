
public class Card {
	
	private String suit; // D for Diamonds, H for Hearts, S for Spades, C for Clubs
	private int rank; //1 for Ace, 11 for Jack, 12 for Queen, 13 for King

	public Card(String cardSuit, int cardRank) {
		suit = cardSuit;
		rank = cardRank;
	}
	
//	SETTERS:
	public void setSuit(String newSuit) {
		if(newSuit == "D" 
				|| newSuit == "H" 
				|| newSuit == "S" 
				|| newSuit == "C") 
		{
			suit = newSuit;
		}
	}
	public void setRank(int newRank) {
		rank = newRank;
	}
	
//	GETTERS:
	public String getSuit() {
		return suit;
	}
	public int getRank() {
		return rank;
	}
}
