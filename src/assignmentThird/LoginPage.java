package assignmentThird;

import java.util.Scanner;

public class LoginPage {
	String userName = "pivotAdmin";
	String password = "Admin123";
	String EnteredUserName;
	String EnteredPassword;
	int maxAttempts = 2;

	void loginClass()

	{
		Scanner sc = new Scanner(System.in);
		int attempts = 0;

		while (attempts < maxAttempts) {
			if (EnteredUserName.equals(userName) && EnteredPassword.equals(password)) {
				System.out.println("you are logged in to the application");
				break;
			} else {
				attempts++;
				System.out.println("Incorrect username or password. Try Again");
				int remainingAttempts = maxAttempts - attempts;
				System.out.println("Enter the usename:");
				EnteredUserName = sc.nextLine();
				System.out.println("Enter password:");
				EnteredPassword = sc.nextLine();
				if (EnteredUserName.equals(userName) && EnteredPassword.equals(password)) {
					System.out.println("you are logged in to the application");
					break;
				}
				System.out.println("Remaining attempts left: " + remainingAttempts);

			}
			if (attempts == 2) {
				System.out.println("Maximum attempts reached. Account is locked");
			}
		}
		
	}

}
