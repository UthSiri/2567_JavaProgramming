import java.util.*;
public class javaLab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input product name	: ");
		String productName = input.nextLine();
		System.out.print("Input product unit	: ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit	: ");
		float productPrice = input.nextFloat();
		System.out.println("------------------------------");
		float totalPriceOfProduct = productUnit * productPrice;
		System.out.println("Total Price is "+ (totalPriceOfProduct) + "baht.");
		System.out.println("------------------------------");
		
		
	}

}
