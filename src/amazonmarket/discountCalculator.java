package amazonmarket;

public class discountCalculator {
	double originalPrice;
	double discountPrice;
	double discountAmount;
	double additionalDiscount;
	double additionalDiscountAmount;
	double discountPercent;
	double discountedPrice;
	double totalPrice;
	double promo5 = 5.0;
	double promo10 = 10.0;
	double promo20 = 20;

	void actualPrice() {
		discountAmount = originalPrice * (discountPercent / 100);
		discountedPrice = originalPrice - discountAmount;
		System.out.println("50% discount applied: $" + discountedPrice);
	}

	void additionalOff() {
		if (additionalDiscount == promo5) {
			additionalDiscount = 5.0;
			additionalDiscountAmount = originalPrice * (additionalDiscount / 100);
			discountedPrice -= additionalDiscountAmount;
			System.out.println("Additional discount applied: $" + discountedPrice);
		} else if (additionalDiscount == promo10) {
			additionalDiscount = 10.0;
			additionalDiscountAmount = originalPrice * (additionalDiscount / 100);
			discountedPrice -= additionalDiscountAmount;
			System.out.println("Additional discount applied: $" + discountedPrice);
		} else if (additionalDiscount == promo20) {
			additionalDiscount = 20.0;
			additionalDiscountAmount = originalPrice * (additionalDiscount / 100);
			discountedPrice -= additionalDiscountAmount;
			System.out.println("Additional discount applied: $" + discountedPrice);
		} else {
			System.out.println("No Additional discount applied: $" + discountedPrice);
		}
	}

	void salePrice() {
		totalPrice = discountedPrice;
		System.out.println("Sale price after total discounts: $" + totalPrice);

	}

}
