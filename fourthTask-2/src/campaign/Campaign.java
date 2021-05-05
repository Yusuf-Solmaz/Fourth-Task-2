package campaign;

import game.GameManager;
import game.Games;

public class Campaign {

	
	public double discountRate;
	public Games games;
	
	public Campaign(double discountRate, Games games) {
		super();
		this.discountRate = discountRate;
		this.games = games;
	}
}
