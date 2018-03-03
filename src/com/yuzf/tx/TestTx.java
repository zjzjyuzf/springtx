package com.yuzf.tx;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuzf.service.TxService;

public class TestTx {

	
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("anno3.xml");
		TxService txService = (TxService) applicationContext.getBean("txService");
		txService.changeAccount();
	}
	
	
}
