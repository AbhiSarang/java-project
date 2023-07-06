package ontariolicense;

import java.util.Scanner;

public class BramptonLicense {

	public static void main(String[] args) {
		// TODO Auto- method stub
		ServiceOntario V1 = new ServiceOntario();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the person: ");
		V1.age = sc.nextInt();

		System.out.println("Enter the current level: ");
		V1.licenseType = sc.next().toUpperCase();
		V1.minimumAge();
		sc.close();

	}

}
