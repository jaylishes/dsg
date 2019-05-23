package org.mai.dsg.consumer;

public class InsufficientPowerException extends RuntimeException {
    public InsufficientPowerException(String errorMessage) {
        super(errorMessage);
    }
}
