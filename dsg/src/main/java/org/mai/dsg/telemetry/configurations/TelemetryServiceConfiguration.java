package org.mai.dsg.telemetry.configurations;

import org.mai.dsg.telemetry.TelemetryServiceImpl;
import org.mai.dsg.telemetry.interfaces.TelemetryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TelemetryServiceConfiguration {

    @Bean
    TelemetryService telemetryService() {
        return new TelemetryServiceImpl();
    }
}
