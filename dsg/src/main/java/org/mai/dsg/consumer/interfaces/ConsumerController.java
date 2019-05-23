package org.mai.dsg.consumer.interfaces;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private final ConsumerService consumerService;

    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @PostMapping("consumer/draft/request")
    public void requestPower(@RequestParam(value = "power", defaultValue = "0") double requestedPower) {
        consumerService.requestPower(requestedPower);
    }
}
