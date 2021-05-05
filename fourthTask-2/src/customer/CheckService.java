package customer;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckService {

	
		public static void checkIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dateOfBirth);

		
		
			if (result==true) {
				System.out.println("Customer login is successful.");
				
			}
			else if (result==false){
				System.out.println("Customer login failed. Incorrect information input.");
				
			}
		}
	
	
	
	
	
	
	
}
