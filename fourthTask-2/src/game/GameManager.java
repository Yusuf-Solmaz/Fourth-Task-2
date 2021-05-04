package game;

import customer.Customer;

public class GameManager implements IGameManager{

	@Override
	public void buy(Customer customer,Games[] games) {
		
		for(int i=0;i<games.length;i++) {
		
			System.out.println(games[i].name + " Purchase is successful.");
	}

	
	
	}

	@Override
	public void showInformation(Games[] games) {
		
	
		for(int i=0;i<games.length;i++) {
			double newPrice_= (games[i].price-(games[i].price*games[i].discountRate)/100);
					
			System.out.println("Game's name: "+ games[i].name+" Discount rate of the game: "+ games[i].discountRate+" The price of the game without discount: "+games[i].price+" The new price of the game: "+ newPrice_+"\n");
	}

	
	}
}
