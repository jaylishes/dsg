package org.mai.dsg.telemetry.interfaces;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelemetryController {

    private final TelemetryService telemetryService;

    public TelemetryController(TelemetryService telemetryService) {
        this.telemetryService = telemetryService;
    }

    @PostMapping("telemetry/draft/output")
    public void setRecentOutput(@RequestParam(value = "output", defaultValue = "0") double recentOutput) {
        telemetryService.setRecentOutput(recentOutput);
    }
}
