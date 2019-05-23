package org.mai.dsg.telemetry;

import org.mai.dsg.telemetry.interfaces.TelemetryService;

public class TelemetryServiceImpl implements TelemetryService {

    private double recentOutput;
    private double powerUsage;

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
        return powerUsage;
    }

    @Override
    public void addPowerUsage(double powerUsageToAdd) {
        this.powerUsage += powerUsageToAdd;
    }
}
