package exceptionmulticatch;

public class InvalidBinaryStringException extends RuntimeException{
    public InvalidBinaryStringException(String message) {
        super(message);
    }
}
