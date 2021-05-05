package game;

import campaign.ICampaignManager;
import customer.Customer;

public interface IGameManager {

	void buy(Customer customer, Games[] games);

	void showInformation(Games games,ICampaignManager campaignManager);
	
	
}
