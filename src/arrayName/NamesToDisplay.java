package arrayName;

import java.util.Scanner;

public class NamesToDisplay {

	String[] names = new String[5];
	Scanner sc = new Scanner(System.in);

	void populatingnamesArray() {
		System.out.println("Enter five names:");

		for (int i = 0; i < 5; i++) {
			System.out.println("Name " + (i + 1) + ": ");
			names[i] = sc.next();
		}
		System.out.println("The names you entered are: ");

		for (String name : names) {
			System.out.println(name);
		}
	}
}
