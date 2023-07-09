package cadburyShop;

public class ChocolateBag {
	final int max_Chocolates = 63;
	final int add_Chocolates = 5;

	void bagTotal() {
		int chocolates = 27;
		System.out.println("Initial number of chocolates:" + chocolates);

		while (chocolates < max_Chocolates) {
			chocolates += add_Chocolates;
			if (chocolates > max_Chocolates) {
				chocolates = max_Chocolates;
			}
			System.out.println("Add 5 chocolates...");
			System.out.println("Total number of chocolates: " + chocolates);
		}
		System.out.println("Maximum limit of 63 reached: " + max_Chocolates);
	}
}