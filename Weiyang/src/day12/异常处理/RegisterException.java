package day12.异常处理;


public class RegisterException extends RuntimeException {

    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}

