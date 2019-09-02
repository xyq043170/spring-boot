package com.example.demo.proxy;

public class AccountImpl implements Account {

	@Override
	public void queryAccount() {
		System.out.println("查看账户");
	}

	@Override
	public void updateAccount() {
		System.out.println("修改账户");
	}

	@Override
	public boolean getAccount(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		return true;
	}

}
