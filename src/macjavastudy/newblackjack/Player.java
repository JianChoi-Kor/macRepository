package macjavastudy.newblackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> playerList = new ArrayList<Card>();
	
	public Player() {
		System.out.println("플레이어 입장");
	}

	public void saveCard(Card card) {
		playerList.add(card);
	}
	
	public int countScore() {
		int score = 0;
		
		for(int i=0; i<playerList.size(); i++) {
			score += playerList.get(i).getScore();
		}
		
		return score;
	}
	
}
