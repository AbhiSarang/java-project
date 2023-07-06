package ontariolicense;

public class ServiceOntario {
	int age;
	String G1;
	String G2;
	String G;
	String A;
	String licenseType;
    // starting program
	// license
	
	void minimumAge() {
		if (age >= 16) {
			if (licenseType.equalsIgnoreCase("G")) {
				System.out.println("You can proceed for Heavy vehicle license. You already have a full G license.");
			} else if (licenseType.equalsIgnoreCase("G2")) {
				System.out.println("License can be issued. You will receive a G license.");
			} else if (licenseType.equalsIgnoreCase("G1")) {
				System.out.println("License can be issued. You will receive a G2 license.");
			} else {
				System.out.println("Having no prior license. You can apply for G1");
			}
		} else if (age == 16) {
			System.out.println("Having no prior license. You can apply for G1");
		} else {
			System.out.println("License cannot be issued. Minimum age requirement is 16 years.");
		}

	}
}
