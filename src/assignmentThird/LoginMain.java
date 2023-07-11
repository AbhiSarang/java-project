package assignmentThird;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {

		LoginPage L1 = new LoginPage();
		Scanner sc = new Scanner(System.in);
		L1.userName = "pivotAdmin";
		System.out.println("Enter the usename:");
		L1.EnteredUserName = sc.nextLine();
		L1.password = "Admin123";
		System.out.println("Enter password:");
		L1.EnteredPassword = sc.nextLine();
		L1.loginClass();
		sc.close();

	}
}
