package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class TestSpy {

    @Test
    public void testSpy() throws Exception{
        DummyCustomerService service=org.mockito.Mockito.spy(new DummyCustomerServiceImpl());
        doNothing().when(service).addCustomer("istanbul");
        doThrow(new IllegalArgumentException()).when(service).removeCustomer(anyString());

        doNothing().when(service).addCustomer("ankara");
        doNothing().when(service).addCustomer("istanbul");
        doCallRealMethod().when(service).removeCustomer("istanbul");

        service.addCustomer("ankara");
        service.addCustomer("istanbul");
    }
}
