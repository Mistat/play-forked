package play.exceptions;

/**
 * Error in application.conf
 */
public class ConfigurationException extends PlayException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public ConfigurationException(String message) {
        super(message);
    }

    @Override
    public String getErrorDescription() {
        return getMessage();
    }

    @Override
    public String getErrorTitle() {
        return "Configuration error.";
    }
    
}
