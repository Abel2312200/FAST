package com.example.fast.projet.errors.entities_errors;

public class BankNotFoundException extends Exception {
    
    public BankNotFoundException() {
        super();
    }


    public BankNotFoundException(String message) {
        super(message);
    }


    public BankNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public BankNotFoundException(Throwable cause) {
        super(cause);
    }
    
    public BankNotFoundException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
