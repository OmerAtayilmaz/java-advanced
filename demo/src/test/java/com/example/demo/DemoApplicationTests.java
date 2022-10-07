package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class DemoApplicationTests {

	@Test
	void testWorld() throws Exception {
		DummyCustomerService dcService=org.mockito.Mockito.mock(DummyCustomerService.class);
		dcService.addCustomer("AAA");
		dcService.addCustomer("BBB");
		dcService.addCustomer("CCC");

		// fonksiyonun kullanılıp, belli parametre girilip girilmediği testi
		org.mockito.Mockito.verify(dcService).addCustomer("AAA"); // "AAA" ile çağırıldı mı?
		org.mockito.Mockito.verify(dcService).addCustomer("BBB"); // addCustomer "BBB" '' ''
		//org.mockito.Mockito.verify(dcService).addCustomer("XXX");
	}

	//kaç kere cagırıldıgını test etmek
	@Test
	void howManyTimesCalled() throws Exception{
		DummyCustomerService dcService=org.mockito.Mockito.mock(DummyCustomerService.class);

		dcService.addCustomer("AAA");
		dcService.addCustomer("AAA");
		dcService.addCustomer("BBB");

		org.mockito.Mockito.verify(dcService,
				org.mockito.Mockito.times(2))
				.addCustomer("AAA");
		//hiç çagırılmadıgını test etmek
		org.mockito.Mockito.verify(dcService,
				org.mockito.Mockito.never())
				.removeCustomer(org.mockito.ArgumentMatchers.anyString());

		//en az 2 defa cagırıldıysa
		org.mockito.Mockito.verify(dcService,
				org.mockito.Mockito.atLeast(2))
				.addCustomer("AAA");
	}

	@Test
	void testSirasiKontrolu() throws Exception{
		DummyCustomerService dcService=org.mockito.Mockito.mock(DummyCustomerService.class);

		dcService.addCustomer("istanbul");
		dcService.addCustomer("ankara");
		dcService.updateCustomer("izmir");

		org.mockito.InOrder inOrder=org.mockito.Mockito.inOrder(dcService);
		inOrder.verify(dcService).addCustomer("istanbul");
		inOrder.verify(dcService).addCustomer("ankara");
		inOrder.verify(dcService).updateCustomer("izmir");
	}


	@Test
	void testBaskaKontrolYok() throws Exception{
		DummyCustomerService dcService=org.mockito.Mockito.mock(DummyCustomerService.class);
		DummyCustomerService dcService2=org.mockito.Mockito.mock(DummyCustomerService.class);
		dcService.addCustomer("istanbul");
		dcService.addCustomer("ankara");
		dcService.updateCustomer("izmir");

		org.mockito.Mockito.verify(dcService).addCustomer("istanbul");
		org.mockito.Mockito.verify(dcService).addCustomer("ankara");
		org.mockito.Mockito.verify(dcService).updateCustomer("izmir");
		//hata: dcService.addCustomer("adasdsa");

		//baska cagirilamsın, eklenen ve verify edilenler aynı olmalıdır
		org.mockito.Mockito.verifyNoMoreInteractions(
				dcService
		);

		//hiç çagırılma olmasın demektir!
		//error: dcService2.addCustomer("asdadsad");
		org.mockito.Mockito.verifyNoInteractions(dcService2);
	}

}
