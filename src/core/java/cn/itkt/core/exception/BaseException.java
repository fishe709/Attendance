package cn.itkt.core.exception;

import java.util.ArrayList;
import java.util.List;

public class BaseException extends Exception implements IException {

	private static final long serialVersionUID = 1005447088784489022L;

	private String errorCode = ErrorInfo.ERRORCODE_DEFAULT;

	private ErrorInfo error = null;

	public BaseException() {
		super();
		this.error = ErrorInfo.initError(errorCode);
	}

	public BaseException(String errorCode) {
		super(errorCode);
		this.errorCode = errorCode;
		this.error = ErrorInfo.initError(errorCode);
	}

	public BaseException(String errorCode, Throwable cause) {
		super(errorCode, cause);
		this.errorCode = errorCode;
		this.error = ErrorInfo.initError(errorCode);
	}

	public BaseException(Throwable cause) {
		super(cause);
		this.error = ErrorInfo.initError(errorCode);
	}

	String getMyErrorCode() {
		return this.errorCode;
	}

	@Override
	public String getErrorCode() {
		String errorCode = "";
		List<Throwable> notPrintExceptions = getNotPrintException();
		if (notPrintExceptions != null && !notPrintExceptions.isEmpty()) {
			for (Throwable notPrintException : notPrintExceptions) {
				if (notPrintException instanceof BaseException) {
					errorCode += ((BaseException) notPrintException).getMyErrorCode() + ";";
				} else if (notPrintException instanceof BaseRuntimeException) {
					errorCode += ((BaseRuntimeException) notPrintException).getMyErrorCode() + ";";
				}
			}
			errorCode = errorCode.substring(0, errorCode.length() - 1);
		} else {
			errorCode = getMyErrorCode();
		}

		return errorCode;
	}

	@Override
	public String getMessage() {
		String message = null;

		String errorCode = getErrorCode();
		if (errorCode.indexOf(";") == -1) {
			message = ErrorInfo.getMessage(errorCode);
			if (message == null) {
				message = super.getMessage();
			}
		} else {
			message = "";
			String[] errorCodes = errorCode.split(";");
			for (String _errorCode : errorCodes) {
				String msg = ErrorInfo.getMessage(_errorCode);
				if (msg == null) {
					message += super.getMessage() + ";";
				} else {
					message += msg + ";";
				}
			}
		}

		return message.isEmpty() ? null : message;
	}

	@Override
	public String getBottomMessage() {
		String message = null;
		Throwable cause = super.getCause();
		if (cause != null) {
			if (cause instanceof IException) {
				message = ((IException) cause).getBottomMessage();
			} else {
				Throwable childCause = cause.getCause();
				if (childCause != null) {
					message = childCause.getMessage();
				} else {
					message = cause.getMessage();
				}
			}
		} else {
			message = super.getMessage();
		}
		if (message != null) {
			String msg = ErrorInfo.getMessage(message);
			if (msg != null) {
				message = msg;
			}
		}
		return message;
	}

	@Override
	public void printStackTrace() {
		if (isPrintLevel()) {
			super.printStackTrace();
		}
	}

	@Override
	public ErrorInfo getError() {
		return this.error;
	}

	@Override
	public boolean isPrintLevel() {
		boolean isPrint = true;
		if (this.error.isInfo() || this.error.getLevel() > ErrorInfo.getPrintLevel()) {
			isPrint = false;
		} else {
			Throwable cause = super.getCause();
			if (cause != null) {
				if (cause instanceof IException) {
					isPrint = ((IException) cause).isPrintLevel();
				}
			}
		}
		return isPrint;
	}

	@Override
	public boolean isLogLevel() {
		boolean isLog = true;
		if (this.error.isInfo() || this.error.getLevel() > ErrorInfo.getLogLevel()) {
			isLog = false;
		} else {
			Throwable cause = super.getCause();
			if (cause != null) {
				if (cause instanceof IException) {
					isLog = ((IException) cause).isLogLevel();
				}
			}
		}
		return isLog;
	}

	@Override
	public List<Throwable> getNotPrintException() {
		return getNotPrintException(this);
	}

	private List<Throwable> getNotPrintException(Throwable cause) {
		List<Throwable> notPrintExceptions = new ArrayList<Throwable>();
		if (cause instanceof IException) {
			IException exception = (IException) cause;
			if (exception.getError().isInfo() || exception.getError().getLevel() > ErrorInfo.getPrintLevel()) {
				notPrintExceptions.add((Throwable) exception);
			}
		}

		Throwable childCause = cause.getCause();
		if (childCause != null) {
			notPrintExceptions.addAll(getNotPrintException(childCause));
		}
		return notPrintExceptions;
	}
}
