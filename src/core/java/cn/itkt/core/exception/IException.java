package cn.itkt.core.exception;

import java.util.List;

public interface IException {

	String getErrorCode();

	String getBottomMessage();

	ErrorInfo getError();

	boolean isPrintLevel();

	boolean isLogLevel();

	List<Throwable> getNotPrintException();
}
