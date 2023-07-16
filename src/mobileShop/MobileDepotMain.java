package mobileShop;

import java.util.Arrays;

public class MobileDepotMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileDepot M1 = new MobileDepot();
		System.out.println("...Products available in Mobile shop...");
		System.out.println("\n");
		System.out.println("Samsung products available in Shop:" + Arrays.toString(M1.Samsung));
		System.out.println("Google products available in Shop:" + Arrays.toString(M1.Google));
		System.out.println("Apple products available in Shop:" + Arrays.toString(M1.Apple));

		M1.productToFind();
		M1.samsungShop();
		M1.googleShop();
		M1.appleShop();
	}

}
