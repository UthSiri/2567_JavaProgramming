
public class Testcutomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 // Customer's toString()
		 System.out.println(c1);
		 // set customer's discount is 5
		 c1.setDiscount(5);
		 // Customer's toString()
		 System.out.println(c1);

		 Line();
		 // show customer's id
		 // show customer's name
		 // show customer's discount
		 Line();
		 //System.out.println("###Test Invoice class###");
		 //Invoice inv1 = new Invoice(101, c1, 12000.00);
		 // Invoice's toString()
		 // set invoice's amount is 10000
		 // Invoice's toString()

		 Line();
		 // show invoice's id
		 // Customer's toString() by instance inv1
		 // show invoice's amount
		 Line();
		 // show customer's id by instance inv1
		 // show customer's name by instance inv1
		 // show customer's discount by instance inv1
		 // show invoice's amount after discount(format as output)
		 } //end of main method()
		 public static void Line() {
		 //use for() statement to display symbol *
			 for(int i=1; i<40; i++) {
				 System.out.println("*");
			 }
			 System.out.println();
		 }
		} //end of class()
