package keyholder.exception;

public class PartInputException extends PartException {
	public static final String MSG="�з������Է¿� �����Ͽ����ϴ�.";
	
	public PartInputException() {
		this(MSG);
	}

	public PartInputException(String message) {
		super(message);
	}

}
