package cn.itkt.core.exception;

/**
 * 非法参数异常。当在方法中传递的参数不符合逻辑的时候使用。
 * @author Fred
 * Jun 26, 2007 12:52:57 AM
 */
public class InvalidArgumentException extends RuntimeException {

	private static final long serialVersionUID = -332169017090778707L;

    public InvalidArgumentException() {
        super();
    }

    public InvalidArgumentException(String message) {
        super(message);
    }

    public InvalidArgumentException(Throwable cause) {
        super(cause);
    }

    public InvalidArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
