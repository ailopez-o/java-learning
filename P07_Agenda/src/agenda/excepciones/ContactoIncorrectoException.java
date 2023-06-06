package agenda.excepciones;

public class ContactoIncorrectoException extends RuntimeException {

	public ContactoIncorrectoException() {
		super();
	}

	public ContactoIncorrectoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ContactoIncorrectoException(String message, Throwable cause) {
		super(message, cause);
	}

	public ContactoIncorrectoException(String message) {
		super(message);
	}

	public ContactoIncorrectoException(Throwable cause) {
		super(cause);
	}

	
}
