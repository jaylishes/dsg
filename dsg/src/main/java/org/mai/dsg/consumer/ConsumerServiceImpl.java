package org.mai.dsg.consumer;

import org.mai.dsg.consumer.interfaces.ConsumerService;
import org.mai.dsg.telemetry.interfaces.TelemetryService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    private final TelemetryService telemetryService;

    public ConsumerServiceImpl(TelemetryService telemetryService) {
        this.telemetryService = telemetryService;
    }

    @Override
    public void requestPower(double requestedPower) {
        addRequestedPower(requestedPower);
    }

    private void addRequestedPower(double requestedPower) {
        double remainingPower = calculateRemainingPower();
        if (requestedPower > remainingPower) {
            throw new InsufficientPowerException("Insufficient power!\n" +
                    "Requested: " + requestedPower + "\n" +
                    "Remaining: " + remainingPower);
        }
        telemetryService.addPowerUsage(requestedPower);
    }

    private double calculateRemainingPower() {
        return telemetryService.getRecentOutput() - telemetryService.getPowerUsage();
    }
}
