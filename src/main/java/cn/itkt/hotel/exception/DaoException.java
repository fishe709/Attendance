package cn.itkt.hotel.exception;

import cn.itkt.core.exception.BaseRuntimeException;

public class DaoException extends BaseRuntimeException {

	private static final long serialVersionUID = 3446513357895749344L;

	public DaoException() {
		super();
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DaoException(Throwable cause) {
		super(cause);
	}
}
