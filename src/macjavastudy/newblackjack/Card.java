package macjavastudy.newblackjack;

public class Card {
	
	private String shape;
	private String val;
	private int score;
	
	public Card(String shape, String val, int score) {
		this.shape = shape;
		this.val = val;
		this.score = score;
	}
	
	public String getShape() {
		return shape;
	}
	
	
	public String getVal() {
		return val;
	}
	
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s)\n",shape, val);
	}
	
	
	
}
