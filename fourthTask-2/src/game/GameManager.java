package game;

import campaign.ICampaignManager;
import customer.Customer;

public class GameManager implements IGameManager{

	@Override
	public void buy(Customer customer,Games[] games) {
		
		for(int i=0;i<games.length;i++) {
		
			System.out.println(games[i].name + " Purchase is successful.");
	}

	
	
	}

	@Override
	public void showInformation(Games games,ICampaignManager campaignManager) {
		
		
		
					
			System.out.println("Game's name: "+ games.name+" Discount rate of the game: "+ games.discountRate+" The price of the game without discount: "+games.price+" The new price of the game: "+ campaignManager.priceCalculating(games)+"\n");
	}

	
	}

	

