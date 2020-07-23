package keyholder.exception;

public class PartInputException extends PartException {
	public static final String MSG="분류정보입력에 실패하였습니다.";
	
	public PartInputException() {
		this(MSG);
	}

	public PartInputException(String message) {
		super(message);
	}

}
