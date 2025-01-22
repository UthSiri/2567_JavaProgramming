package labsheet06;

public class product {
	private String productname;
	private double Eprice;
	private double vatRate;
	
	public void setProductDetails (String name,double price, double Rate) {
		
		productname = name;
		Eprice = price;
		vatRate = Rate;
		
		
	}
}
