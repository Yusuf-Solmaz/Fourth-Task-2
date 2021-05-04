package customer;
import java.rmi.RemoteException;

public class CheckingUser {
	
	
	public void check(Customer customer) throws RemoteException {
		
		CheckService.checkIfRealPerson(customer);
	}
	
}
