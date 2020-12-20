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
}
