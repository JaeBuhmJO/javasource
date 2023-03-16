package inheritance;

public class ComputerEx {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Calculator calculator = new Calculator();
		
		double result = computer.areaCircle(10);
		System.out.println(result);
		System.out.println(calculator.areaCircle(10));
		
	}

}
