package org.mai.dsg.telemetry.mocks;

import org.mai.dsg.telemetry.interfaces.TelemetryService;

public class TelemetryServiceMock implements TelemetryService {

    private double recentOutput;

    @Override
    public double getRecentOutput() {
        return recentOutput;
    }

    @Override
    public void setRecentOutput(double recentOutput) {
        this.recentOutput = recentOutput;
    }

    @Override
    public double getPowerUsage() {
        return 0;
    }

    @Override
    public void addPowerUsage(double powerUsageToAdd) {

    }
}
