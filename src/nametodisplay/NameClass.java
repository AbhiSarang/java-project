package nametodisplay;

import java.util.Scanner;

public class NameClass {
	String[] names = new String[10];

	Scanner sc = new Scanner(System.in);
	String userChoice;

	void populateNameArray() {
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter the names:" + (i + 1));
			names[i] = sc.next();
		}
	}

	void printNames() {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	void findNameInArray() {
		String enteredName;
		int occurrence = 0;
		int foundAtIndex = 0;
		System.out.println("Enter the name you want to search");
		enteredName = sc.next();
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(enteredName)) {
				occurrence++;
				if (foundAtIndex == 0) {
					foundAtIndex = i;
				}
			}
		}
		if (occurrence > 0) {
			System.out.println("Name is present in the array");
			System.out.println("Number of times: " + occurrence);
			System.out.println("Index of first occurrence: " + foundAtIndex);
		} else {
			System.out.println("Name is not present in the array");
		}
	}

	void continuity() {

		System.out.println("do you want to continue? Press Y for yes or N for no");
		userChoice = sc.next();
		while (userChoice.equals("Y")) {

			findNameInArray();
			System.out.println("do you want to continue? Press Y for yes or N for no");
			userChoice = sc.next();

		}
		System.out.println("Thanks");
	}

}
