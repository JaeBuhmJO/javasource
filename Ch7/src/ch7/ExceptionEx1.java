package ch7;

public class ExceptionEx1 {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			//예외가 발생할 수 있는 구문
			Class.forName("");
		} catch (ClassNotFoundException e) {
			//예외가 발생했을 때 처리하기 위한 구문
			e.printStackTrace();
		}
		
		Class.forName("");
		
		System.out.println("Hello");
	}

}
