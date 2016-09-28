package cn.itkt.hotel.exception;

/**
 * 操作的前置条件未被满足的异常。
 * @author Fred
 *
 */
public class PreconditionCheckFailedException extends GenericException {

    private static final long serialVersionUID = 6957478607588513228L;

	/**
     * @param message
     */
    public PreconditionCheckFailedException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public PreconditionCheckFailedException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public PreconditionCheckFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
