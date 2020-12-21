package macjavastudy.newblackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

	Card[] preCardList = new Card[52];
	List<Card> cardList = new ArrayList<Card>();
	
	
	public CardDeck() {
		init();
		change();
		System.out.println("카드 생성");
	}
	
	private void init() {
		
		String[] shapes = {"heart", "diamond", "clover", "spade"};
		int idx = 0;
		
		for(String shape : shapes) {
			for(int i=1; i<=13; i++) {
				
				String val;
				int score;
				
				switch(i) {
				
				case 1:
					val = "A";
					score = 1;
					break;
				
				case 11:
					val = "J";
					score = 10;
					break;
					
				case 12:
					val = "Q";
					score = 10;
					break;
					
				case 13:
					val = "K";
					score = 10;
					break;
				
				default:
					val = String.valueOf(i);
					score = i;
				}
				preCardList[idx++] = new Card(shape, val, score);
			}
		}	
	}
	
	private void change() {
		for(int i=0; i<52; i++) {
			cardList.add(preCardList[i]);
		}
	}
	
	public Card pickCard() {
		int rn = (int)(Math.random()*52)+1;
		Card pickedCard;
		
		try {
			pickedCard = cardList.get(rn);
			cardList.remove(rn);
		} catch(IndexOutOfBoundsException e) {
			int newrn = (int)(Math.random()*52)+1;
			pickedCard = cardList.get(newrn);
			cardList.remove(newrn);
		}
		
		
		
		return pickedCard;
	}
	
	
	
	
}
