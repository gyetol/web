package keyholder.exception;

public abstract class PartException extends RuntimeException { //RuntimeException�� ��������Ƿ� throw�� �ǹ��� �ƴϴ�. �ǹ��� �Ϸ��� Exception�� ���̷�Ʈ�� ����ϸ�ȴ�
	public PartException(String message) {
		super(message);
	}
}
