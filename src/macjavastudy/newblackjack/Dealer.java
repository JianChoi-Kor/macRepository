package macjavastudy.newblackjack;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
	
	List<Card> dealerList = new ArrayList<Card>();
	
	public Dealer() {
		System.out.println("딜러 입장");
	}
	
	public void saveCard(Card card) {
		dealerList.add(card);
	}

	public int countScore() {
		int score = 0;
		
		for(int i=0; i<dealerList.size(); i++) {
			score += dealerList.get(i).getScore();
		}
		
		return score;
	}
}
