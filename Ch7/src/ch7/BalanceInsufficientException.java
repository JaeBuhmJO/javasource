package ch7;

public class BalanceInsufficientException extends RuntimeException{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Runtime을 빼면 컴파일 단계 예외가 발생한다
	public BalanceInsufficientException() {
		super();
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
