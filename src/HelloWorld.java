
public class HelloWorld {

	public static void main(String[] args) {
		Card michaelCard = new Card("M", 17); // suit, rank
		
		michaelCard.setRank(18);
		
		System.out.println(michaelCard.getSuit());
		System.out.println(michaelCard.getRank());
		
		Card eveCard = new Card("E", 15); // suit, rank
		
		System.out.println(eveCard.getSuit());
		System.out.println(eveCard.getRank());
	
	}

}
