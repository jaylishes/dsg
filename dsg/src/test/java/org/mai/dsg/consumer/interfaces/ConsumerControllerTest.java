package org.mai.dsg.consumer.interfaces;

import org.junit.Test;
import org.mai.dsg.consumer.InsufficientPowerException;
import org.mai.dsg.consumer.mocks.ConsumerServiceMock;

import static org.mai.dsg.consumer.mocks.ConsumerServiceMock.MAX_OUTPUT;

public class ConsumerControllerTest {

    @Test
    public void sufficientPowerTest() {
        double requestedPower = MAX_OUTPUT - 12.2;
        ConsumerService consumerService = new ConsumerServiceMock();
        ConsumerController consumerController = new ConsumerController(consumerService);

        consumerController.requestPower(requestedPower);
    }

    @Test(expected = InsufficientPowerException.class)
    public void insufficientPowerTest() {
        double requestedPower = MAX_OUTPUT + 12.2 ;
        ConsumerService consumerService = new ConsumerServiceMock();
        ConsumerController consumerController = new ConsumerController(consumerService);

        consumerController.requestPower(requestedPower);
    }
}
