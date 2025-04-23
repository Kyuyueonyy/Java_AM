package library;

public class InsufficientException extends Exception {
    public InsufficientException() {
    }
    public InsufficientException(String message) {
        super(message);

        //동일하게 처리하고 싶은 내용을 여기 적으면 된다
    }
}
