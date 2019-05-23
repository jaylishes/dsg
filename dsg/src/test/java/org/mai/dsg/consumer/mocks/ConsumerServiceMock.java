package org.mai.dsg.consumer.mocks;

import org.mai.dsg.consumer.InsufficientPowerException;
import org.mai.dsg.consumer.interfaces.ConsumerService;

public class ConsumerServiceMock implements ConsumerService {

    public static final double MAX_OUTPUT = 124;

    @Override
    public void requestPower(double requestedPower) {
        if (requestedPower > MAX_OUTPUT) {
            throw new InsufficientPowerException("Power not available: " + String.valueOf(requestedPower));
        }
    }
}
