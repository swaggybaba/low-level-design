package Deck;

import java.util.*;

public class Deck {
	List<Card> cards;
	
	public Deck() {
		this.cards=new ArrayList<>();
		for(int faceValue=1;faceValue<=13;faceValue++) {
			for(Suit s: Suit.values()) {
				this.cards.add(new Card(faceValue, s));
			}
		}
		shuffle();
	}
	public void shuffle() {
		Random random=new Random();
		int size=this.cards.size();
		for(int i=0;i<size;i++) {
			int r=i+random.nextInt(size-i);
			swap(i,r);
		}
	}
	public void swap(int i,int j) {
		Card card=this.cards.get(i);
		this.cards.set(i, this.cards.get(j));
		this.cards.set(j, card);
	}
}
