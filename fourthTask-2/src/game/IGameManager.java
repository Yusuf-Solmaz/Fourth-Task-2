package game;

import customer.Customer;

public interface IGameManager {

	void buy(Customer customer, Games[] games);

	void showInformation(Games[] games);
	
	
}
