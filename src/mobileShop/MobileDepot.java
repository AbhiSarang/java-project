package mobileShop;

import java.util.Scanner;

public class MobileDepot {
	String brandName;
	String productName;

	String[] Samsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] Google = { "Google pixel 6", "Google pixel 6 Pro", "Google pixel Pro", "Google pixel 5" };
	String[] Apple = { "Iphone 12", "Iphone 12 mini", "Iphone 11", "Iphone 13" };
	Scanner sc = new Scanner(System.in);

	void productToFind() {

		System.out.println("Enter the brand you want:");
		brandName = sc.nextLine();
		System.out.println("Enter the name of the product");
		productName = sc.nextLine();
	}

	void samsungShop() {
		for (int i = 0; i < Samsung.length; i++) {
			if (productName.equals(Samsung[i])) {
				System.out.println("Product selected is: " + Samsung[i] + "  Available at index " + i);
				break;

			}
		}
	}

	void googleShop() {
		for (int j = 0; j < Google.length; j++) {
			if (productName.equals(Google[j])) {
				System.out.println("Product selected is: " + Google[j] + "  Available at index " + j);
				break;
			}
			
		}
		
	}

	void appleShop() {
		for (int k = 0; k < Apple.length; k++) {
			if (productName.equals(Apple[k])) {
				System.out.println("Product selected is: " + Apple[k] + "  Available at index " + k);
				break;
			} else {
				System.out.println("invalid entry");
			}

		}

	}
}
