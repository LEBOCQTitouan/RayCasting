package engine.logicExceptions;

public class VectorException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -4728321741972910075L;

    public VectorException() {
    }

    public VectorException(String message) {
        super(message);
    }

    public VectorException(Throwable cause) {
        super(cause);
    }

    public VectorException(String message, Throwable cause) {
        super(message, cause);
    }

    public VectorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString() {
        return "VectorException ["+this.getMessage()+"]";
    }
    
}
