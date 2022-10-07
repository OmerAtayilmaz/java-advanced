package com.example.demo;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
//wth?
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;
import static java.lang.System.out;

public class OnAsamaTest {

    //şart koyma, eğer gelen deger boyleyse test başarısız olur
    @Test
    public void testWhen() throws Exception{
        DummyCustomerService dcService=mock(DummyCustomerService.class);
        //bunu eklemezsek null atar.
        when(dcService.getCustomer(eq("ankara"))).thenReturn("istanbul");
        /* HATAA - ALTTAKI KOD ICIN
        * org.opentest4j.AssertionFailedError:
          Expected :"customerIstanbul"
          Actual   :null
        * */
        String customer= dcService.getCustomer("ankara");
        assertThat(customer).isEqualTo("customerIstanbul");
    }

    @Test
    public void testWhen2() throws Exception{
        DummyCustomerService dcService=mock(DummyCustomerService.class);
        //spesifik bir degere spesifik exception atmak
        when(dcService.getCustomer(eq("ankara"))).thenThrow(new RuntimeException());
        String customer= dcService.getCustomer("ankara");
    }

    @Test
    public void testWhen3() throws Exception{
        DummyCustomerService dcService=mock(DummyCustomerService.class);

        doNothing().when(dcService).addCustomer(anyString());
        //return ankara if true
        doReturn("ankara").when(dcService).getCustomer("istanbul");

        doThrow(new RuntimeException()).when(dcService).getCustomer("ankara");

    }
}
