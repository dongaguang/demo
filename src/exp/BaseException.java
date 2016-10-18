package exp;

/**
 * 测试自定义异常
 * @author Administrator
 *
 */
public class BaseException extends Exception {
	public BaseException() {
	}

	public BaseException(String message) {
		super(message);
	}

}
