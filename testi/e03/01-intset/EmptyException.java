public class EmptyException extends RuntimeException {
    public EmptyException(String errorMessage) {
        super(errorMessage);
    }

    public EmptyException(){
        super();
    }
}
