package Deck;

public class Main {
	public static void main(String[] args) {
		Deck deck=new Deck();
		for(Card card:deck.cards) {
			System.out.println("Suit: "+card.suit+" Face Value: "+card.faceValue);
		}
	}
}
