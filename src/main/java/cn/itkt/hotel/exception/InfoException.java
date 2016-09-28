package cn.itkt.hotel.exception;

import cn.itkt.core.exception.BaseRuntimeException;

public class InfoException extends BaseRuntimeException {

	private static final long serialVersionUID = 7610479614854965559L;

	public InfoException() {
		super();
	}

	public InfoException(String message) {
		super(message);
	}

	public InfoException(String message, Throwable cause) {
		super(message, cause);
	}

	public InfoException(Throwable cause) {
		super(cause);
	}
}
