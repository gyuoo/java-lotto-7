package lotto.exception;

public enum ErrorMessage {
	;

	private final String message;

	ErrorMessage(String message) {
		this.message = message;
	}

	public String getErrorMessage() {
		return message;
	}
}