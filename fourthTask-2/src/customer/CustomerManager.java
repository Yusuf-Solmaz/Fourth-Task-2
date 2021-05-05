package customer;

public class CustomerManager implements ICustomerManager{

	private Customer _customer;
	
	public CustomerManager(Customer _customer) {
	
		this._customer = _customer;
	}

	
	
	
	@Override
	public void updateInformation(Customer customer) {
		
		_customer=customer;
		
		
		showCustomerInformation(customer);
	}

	
	@Override
	public void showCustomerInformation(Customer customer) {
		
		System.out.println("Your current information: "+"\n" + customer.firstName +"\n"+customer.lastName+"\n"+customer.dateOfBirth+"\n"+customer.nationalityId+"\n"  );
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		
		System.out.println(customer.firstName+" deleted.");
	}
	
	public Customer getCustomer() {
		return _customer;
	}

	public void setCustomer(Customer _customer) {
		this._customer = _customer;
	}




	

}
