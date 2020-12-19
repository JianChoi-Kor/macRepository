package macjavastudy.blackjack;

public class BlackJack {

	public static void main(String[] args) {
		
		Dealer d1 = new Dealer();
		Player p1 = new Player();
		
		CardDeck cd = new CardDeck();
		cd.shuffle();
		
		System.out.println("게임을 시작합니다."+"\n");
		
		
		while(true) {
			System.out.println("카드 두장을 딜러에게 줍니다.");
			cd.piccard();
			System.out.println(cd.cardList[0]);
			cd.piccard();
			System.out.println(cd.cardList[0]);

			
			
			
		
			
			break;
		}
		System.out.println("게임을 종료합니다");
		
	
	}

}
