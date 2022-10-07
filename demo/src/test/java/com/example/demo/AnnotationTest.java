package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnnotationTest {

    @Mock
    private DummyCustomerService dummyCustomerService;

// @RunWith ve @Mock sayesinde initialize yapmammıza gerek kalmadı
//
//    @Before
//    public void setUp() throws Exception{
//        dummyCustomerService= Mockito.mock(DummyCustomerService.class);
//    }


    @Test
    public void testAnnotation() throws Exception{
        dummyCustomerService.addCustomer("istanbul");
    }
}
