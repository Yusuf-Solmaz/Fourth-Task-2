package campaign;

import game.GameManager;
import game.Games;

public class SummerCampaign extends Campaign implements ICampaignManager {

	
	public SummerCampaign(double discountRate, Games games) {
		super(discountRate, games);
		
	}

	@Override
	public double priceCalculating(Games games) {
		
		
			
		return games.price-(games.price*games.discountRate)/100;
	}

	
		

}

