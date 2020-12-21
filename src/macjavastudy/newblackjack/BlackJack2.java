package macjavastudy.newblackjack;

import java.util.Scanner;

public class BlackJack2 {
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CardDeck carddeck= new CardDeck();
		Dealer dealer = new Dealer();
		Player player = new Player();
		
		System.out.println("\n" + "게임을 시작합니다." + "\n");
		
		if(dealer.dealerList.size() == 0 && player.playerList.size() == 0) {
			
			System.out.println("딜러가 카드 1장을 뽑습니다.");
			dealer.saveCard(carddeck.pickCard());
			
			System.out.println("플레이어가 카드 1장을 뽑습니다.");
			dealer.saveCard(carddeck.pickCard());
			
			System.out.println("딜러가 카드 1장을 뽑습니다.");
			player.saveCard(carddeck.pickCard());
			
			System.out.println("플레이어가 카드 1장을 뽑습니다.");
			player.saveCard(carddeck.pickCard());
			
			
			if(dealer.countScore() <= 16) {
				System.out.println("딜러가 가진 카드 2장의 합이 16이하입니다. 카드를 한 장 더 뽑습니다.");
				dealer.saveCard(carddeck.pickCard());
			}
			
			while(true) {
				System.out.println("게임을 계속 진행하시겠습니까? (y / n)");
				String play = scan.next();
				
				if(play.equals("y")) {
					System.out.print("카드를 한 장 더 뽑으시겠습니까? (y / n)");
					String onemore = scan.next();
					if(onemore.equals("y")) {
						System.out.println("카드를 한 장 더 뽑습니다.");
						player.saveCard(carddeck.pickCard());
						System.out.println("플레이어의 점수는 :"+player.countScore());
					} else if(onemore.equals("n")) {
						continue;
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
					
				} else if(play.equals("n")) {
					System.out.println("게임 결과로 넘어갑니다."+"\n");
					
					System.out.println("게임 결과를 출력합니다.");
					
					if(player.countScore() > 21 && dealer.countScore() > 21) {
						System.out.println("둘 다 21점을 넘겼습니다.");
					} else if(player.countScore() > 21) {
						System.out.printf("플레이어의 점수 %d, 딜러의 점수 %d\n", player.countScore(), dealer.countScore());
						System.out.println("플레이어가 21점을 넘겨 패하였습니다.");
					} else if(dealer.countScore() > 21) {
						System.out.printf("플레이어의 점수 %d, 딜러의 점수 %d\n", player.countScore(), dealer.countScore());
						System.out.println("딜러가 21점을 넘겨 패했습니다.");
					} else if(player.countScore() > dealer.countScore()) {
						System.out.printf("플레이어의 점수 %d, 딜러의 점수 %d\n", player.countScore(), dealer.countScore());
						System.out.println("플레이어 승리");
					} else if(player.countScore() == dealer.countScore()) {
						System.out.printf("플레이어의 점수 %d, 딜러의 점수 %d\n", player.countScore(), dealer.countScore());
						System.out.println("비겼습니다.");
					} else if(player.countScore() < dealer.countScore()) {
						System.out.printf("플레이어의 점수 %d, 딜러의 점수 %d\n", player.countScore(), dealer.countScore());
						System.out.println("딜러 승리");
					}
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			
			
			
			
			
		}
		
	}
}
