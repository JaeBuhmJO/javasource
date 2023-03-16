package exam;

import java.util.Scanner;

public class CalculateEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Num1 : ");
		int a = Integer.parseInt(scanner.nextLine());
		System.out.print("Input Operator : ");
		String cal = scanner.nextLine();
		System.out.print("Input Num2 : ");
		int b = Integer.parseInt(scanner.nextLine());

		Calc calc = null;
		switch (cal) {
		case "+":
			calc = new Add();
			break;
		case "-":
			calc = new Sub();
			break;
		case "*":
			calc = new Mul();
			break;
		case "/":
			calc = new Div();
			break;
		}
		calc.setValue(a, b);
		System.out.println("result : " + calc.calculate());
		scanner.close();

	}

}
