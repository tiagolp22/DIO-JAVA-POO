package desafiocontrolefluxo;

/**
 * This custom exception is thrown when the first parameter is greater than the second parameter.
 */
public class InvalidParametersException extends Exception {
    public InvalidParametersException(String message) {
        super(message);
    }
}
