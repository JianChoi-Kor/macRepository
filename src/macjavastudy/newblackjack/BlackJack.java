package macjavastudy.newblackjack;

import java.util.Scanner;

public class BlackJack {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CardDeck carddeck= new CardDeck();
		Dealer dealer = new Dealer();
		Player player = new Player();

		System.out.println("\n" + "게임을 시작합니다." + "\n");
		
		while(true) {
			if(dealer.dealerList.size() == 0 && player.playerList.size() == 0) {
				
				System.out.println("딜러가 카드 1장을 뽑습니다.");
				Card card1 = carddeck.pickCard();
				dealer.saveCard(card1);
				
				System.out.println("플레이어가 카드 1장을 뽑습니다.");
				Card card2 = carddeck.pickCard();
				dealer.saveCard(card2);
				
				System.out.println("딜러가 카드 1장을 뽑습니다.");
				Card card3 = carddeck.pickCard();
				player.saveCard(card3);
				
				System.out.println("플레이어가 카드 1장을 뽑습니다.");
				Card card4 = carddeck.pickCard();
				player.saveCard(card4);
				
				
				
				
				
				
				if(dealer.countScore() <= 16) {
					System.out.println("딜러가 가진 카드 2장의 합이 16이하입니다. 카드를 한 장 더 뽑습니다.");
					Card card5 = carddeck.pickCard();
					dealer.saveCard(card5);
				}
				
				if(dealer.countScore() > 21 || player.countScore() >21) {
					if(dealer.countScore() > 21) {
						System.out.println("딜러 카드의 합이 21이 넘습니다. 딜러가 패했습니다.");
					} else {
						System.out.println("플레이어 카드의 합이 21이 넘습니다. 플레이어가 패했습니다.");
					}
					break;
				}
				
			}
		
			
			System.out.print("플레이어는 카드를 한장 더 받으시겠습니까? (y / n)");
			String onemore = scan.next();
			
			if(onemore.equals("y") || onemore.equals("Y")) {
				System.out.println("카드를 한 장 더 받습니다.");
				Card card5 = carddeck.pickCard();
				player.saveCard(card5);
			} else if(onemore.equals("n") || onemore.equals("N")) {
				System.out.println("카드를 더 받지 않습니다.");
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			
			System.out.println("게임을 종료하시겠습니까? (y / n)");
			String end = scan.next();
			
			if(end.equals("y") || end.equals("n")) {
				if(player.countScore() > dealer.countScore()) {
					System.out.printf("플레이어의 점수 : %d, 딜러의 점수 : %d\n"+player.countScore(), dealer.countScore());
					System.out.println("\n"+"플레이어가 승리했습니다.");
				} else if(player.countScore() == dealer.countScore()) {
					System.out.printf("플레이어의 점수 : %d, 딜러의 점수 : %d\n"+player.countScore(), dealer.countScore());
					System.out.println("\n"+"비겼습니다.");
				}
				
				
			}
			
			
				
			
			
			
			
			
			break;
		}
		System.out.println("게임을 종료합니다.");
		

	}
	
}
