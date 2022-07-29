package day10.exception;

/**
 * @author Yang Song
 * @date 2022/7/29 16:15
 */
public class MyException extends RuntimeException{
    public MyException() {
        super("我的异常");
    }
    public MyException(String message) {
        super(message);
    }
}
