package org.mai.dsg.telemetry.interfaces;

public interface TelemetryService {

    double getRecentOutput();
    void setRecentOutput(double recentOutput);

    double getPowerUsage();
    void addPowerUsage(double powerUsageToAdd);
}
