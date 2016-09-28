package cn.itkt.core.exception;

/**
 * 非法参数异常。当在方法中传递的参数不符合逻辑的时候使用。
 * @author Fred
 * Jun 26, 2007 12:52:57 AM
 */
public class UnsupportedValueException extends RuntimeException {

	private static final long serialVersionUID = -332169017090778707L;

    public UnsupportedValueException() {
        super();
    }

    public UnsupportedValueException(String message) {
        super(message);
    }

    public UnsupportedValueException(Throwable cause) {
        super(cause);
    }

    public UnsupportedValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
