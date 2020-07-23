package keyholder.exception;

public abstract class PartException extends RuntimeException { //RuntimeException을 상속했으므로 throw가 의무가 아니다. 의무로 하려면 Exception을 다이렉트로 상속하면된다
	public PartException(String message) {
		super(message);
	}
}
