package cn.itkt.hotel.exception;

import cn.itkt.core.exception.BaseRuntimeException;

public class HotelException extends BaseRuntimeException {

	private static final long serialVersionUID = -4249492618398206557L;

	public HotelException() {
		super();
	}

	public HotelException(String message) {
		super(message);
	}

	public HotelException(String message, Throwable cause) {
		super(message, cause);
	}

	public HotelException(Throwable cause) {
		super(cause);
	}
}