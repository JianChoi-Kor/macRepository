package macjavastudy.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
	
	Card[] cardList = new Card[52];
	List<Integer> shuffleCard = new ArrayList<Integer>();
	

	public CardDeck() {
		init();
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
				cardList[idx++] = new Card(shape, val, score);
			}
		}	
	}
	
	public void shuffle() {
		for(int i=0; i<52; i++) {
			shuffleCard.add(i);
		}
		Collections.shuffle(shuffleCard);
		System.out.println("카드를 섞습니다.");
	}
	
	public void piccard() {
		int cardNum = 0;
		System.out.println("뽑은 카드는 : "+cardList[shuffleCard.get(cardNum)]);
		shuffleCard.remove(cardNum);
		cardNum++;
	}
}
