package campaign;

import game.GameManager;
import game.Games;

public class WinterCampaign extends Campaign implements ICampaignManager {

	public WinterCampaign(double discountRate, Games games) {
		super(discountRate, games);
		
	}

	@Override
	public double priceCalculating(Games games) {
		
		
		
		return games.price-(games.price*games.discountRate)/100;
	}
	}
