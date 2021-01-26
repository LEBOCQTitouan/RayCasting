package engine.logicExceptions;

public class PlaneException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -7427305695528704534L;

    public PlaneException() {
    }

    public PlaneException(String message) {
        super(message);
    }

    public PlaneException(Throwable cause) {
        super(cause);
    }

    public PlaneException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlaneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString() {
        return "PlaneException ["+this.getMessage()+"]";
    }
    
}
