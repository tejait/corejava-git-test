package except;

public class InsufficientBalanceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException() {// no detail msg
		super();
	}
	
	public InsufficientBalanceException(String msg) {// detailed msg
		super(msg);
	}
}
