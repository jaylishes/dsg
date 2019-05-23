package org.mai.dsg.telemetry;

import org.junit.Assert;
import org.junit.Test;

public class TelemetryServiceImplTest {

    @Test
    public void getterSetterForRecentOutputTest() {
        double recentOutput = 1324.34;
        TelemetryServiceImpl telemetryService = new TelemetryServiceImpl();

        telemetryService.setRecentOutput(recentOutput);
        double recentOutputFromService = telemetryService.getRecentOutput();
        Assert.assertEquals(recentOutput, recentOutputFromService, 0.0);
    }

    @Test
    public void getterSetterForPowerUsageTest() {
        double powerUsageToAdd = 12.2;
        TelemetryServiceImpl telemetryService = new TelemetryServiceImpl();

        double powerUsage = telemetryService.getPowerUsage();
        Assert.assertEquals(0, powerUsage, 0.0);
        telemetryService.addPowerUsage(powerUsageToAdd);
        powerUsage = telemetryService.getPowerUsage();
        Assert.assertEquals(powerUsageToAdd, powerUsage, 0.0);
    }
}
