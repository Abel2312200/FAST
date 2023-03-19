package com.example.fast.projet.errors.entities_errors;

public class AgencyNotFoundException extends Exception {
    
    public AgencyNotFoundException() {
        super();
    }


    public AgencyNotFoundException(String message) {
        super(message);
    }


    public AgencyNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public AgencyNotFoundException(Throwable cause) {
        super(cause);
    }
    
    public AgencyNotFoundException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
