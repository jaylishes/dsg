package org.mai.dsg.consumer;

import org.junit.Test;
import org.mai.dsg.telemetry.interfaces.TelemetryService;
import org.mai.dsg.telemetry.mocks.TelemetryServiceMock;

public class ConsumerServiceImplTest {

    private static final double REQUESTED_OUTPUT = 150.2;

    @Test
    public void sufficientPowerTest() {
        TelemetryService telemetryService = new TelemetryServiceMock();
        telemetryService.setRecentOutput(REQUESTED_OUTPUT + 20);
        ConsumerServiceImpl consumerService = new ConsumerServiceImpl(telemetryService);

        consumerService.requestPower(REQUESTED_OUTPUT);
    }

    @Test(expected = InsufficientPowerException.class)
    public void insufficientPowerTest() {
        TelemetryService telemetryService = new TelemetryServiceMock();
        telemetryService.setRecentOutput(REQUESTED_OUTPUT - 20);
        ConsumerServiceImpl consumerService = new ConsumerServiceImpl(telemetryService);

        consumerService.requestPower(REQUESTED_OUTPUT);
    }
}
