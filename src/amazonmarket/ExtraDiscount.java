package amazonMarket;

import java.util.Scanner;

public class ExtraDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		discountCalculator V2 = new discountCalculator();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the original price: $");
		V2.originalPrice = sc.nextDouble();
		V2.discountPercent = 50;
		System.out.println("Enter a promo code for additional discount");
		V2.additionalDiscount = sc.nextDouble();

		V2.actualPrice();
		V2.additionalOff();
		V2.salePrice();
		sc.close();
	}

}