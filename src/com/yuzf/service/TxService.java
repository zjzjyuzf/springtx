package com.yuzf.service;

import com.yuzf.dao.TxDao;

public class TxService {

	private TxDao txDao;

	public void setTxDao(TxDao txDao) {
		this.txDao = txDao;
	}
	
	//转账业务
	public void changeAccount() {
		
		txDao.giveMoney();
		
		int i = 1/0;
		
		txDao.getMoney();
		
		
	}
	
}
