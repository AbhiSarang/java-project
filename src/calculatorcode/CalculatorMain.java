package calculatorCode;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		Scanner sc = new Scanner(System.in);

		calc.performOperation();
		calc.continuity();

		sc.close();

	}

}
