package customer;
import java.rmi.RemoteException;

import campaign.ICampaignManager;
import campaign.SummerCampaign;
import game.GameManager;
import game.Games;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Customer customer = new Customer("1111111111","YUSUF MÜCAHÝT","SOLMAZ",2000);
		CheckingUser checkingUser = new CheckingUser();
		
		checkingUser.check(customer);
		
		
		CustomerManager customerManager = new CustomerManager(customer);
		
		customerManager.updateInformation(new Customer("1111111111","YUSUF","SOLMAZ",2000));
		
		
		
		Games game1= new Games("1","GTA V",120,15);
		Games game2= new Games("2", "RDR 2", 250, 5);
		
		Games [] games = {game1,game2};
		
		GameManager gameManager = new  GameManager();
		
		ICampaignManager campaignManager = new SummerCampaign(15, game2);
		
		gameManager.showInformation(game2,campaignManager);
		gameManager.showInformation(game1, campaignManager);
		
		gameManager.buy(customer, games );
		
		
		
		
		
	}

}
