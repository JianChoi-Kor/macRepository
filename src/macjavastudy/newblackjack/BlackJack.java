package macjavastudy.newblackjack;

public class BlackJack {

	public static void main(String[] args) {

		CardDeck carddeck = new CardDeck();
		Dealer dealer = new Dealer();
		Player player = new Player();

		System.out.println("\n" + "게임을 시작합니다." + "\n");
		
		System.out.println("딜러의 카드 2장을 뽑습니다.");
		Card card1 = carddeck.pickCard();
		Card card2 = carddeck.pickCard();
		
		dealer.saveCard(card1);
		dealer.saveCard(card2);
		
		System.out.println(card1);
		System.out.println(card2);
		
		

	}

}
