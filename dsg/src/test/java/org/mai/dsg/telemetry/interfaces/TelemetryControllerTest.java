package org.mai.dsg.telemetry.interfaces;

import org.junit.Assert;
import org.junit.Test;
import org.mai.dsg.telemetry.interfaces.TelemetryController;
import org.mai.dsg.telemetry.interfaces.TelemetryService;
import org.mai.dsg.telemetry.mocks.TelemetryServiceMock;

public class TelemetryControllerTest {

    @Test
    public void setRecentOutputTest() {
        TelemetryService telemetryService = new TelemetryServiceMock();
        double recentOutput = 1500.23;
        TelemetryController telemetryController = new TelemetryController(telemetryService);
        telemetryController.setRecentOutput(recentOutput);
        double recentOutputFromService = telemetryService.getRecentOutput();
        Assert.assertEquals(recentOutput, recentOutputFromService, 0.0);
    }
}
