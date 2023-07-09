package assignmentThird;

public class LoginPage {
	String userName = "pivotAdmin";;
	String password = "Admin123";;
	String EnteredUserName;
	String EnteredPassword;
	int maxAttempts = 3;

	void loginClass()

	{
		int attempts = 0;

		while (attempts < maxAttempts) {
			if (EnteredUserName.equals(userName) && EnteredPassword.equals(password)) {

				System.out.println("you are logged in to the application");
				break;
			} else {
				attempts++;
				int remainingAttempts = maxAttempts - attempts;
				System.out.println("incorrect username or password " + remainingAttempts);

			}
			if (attempts == 0) {
				System.out.println("account locked");
			}
		}
	}

}
