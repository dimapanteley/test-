package exteption;

public class DivisionByZeroExption  extends  RuntimeException{
    public DivisionByZeroExption() {
    }

    public DivisionByZeroExption(String message) {
        super(message);
    }

    public DivisionByZeroExption(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionByZeroExption(Throwable cause) {
        super(cause);
    }

    public DivisionByZeroExption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
