package game;

public class Games {

	
	public String id;
	public String name;
	public double price;
	public double discountRate;

	public double newPrice= price-(price*discountRate)/100;
	
	
	public Games(String id, String name, double price, int indirimOraný) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountRate = indirimOraný;
		
	}
	
	
	
	
	
}
