package com.sgtesting.tests;

public class CreateNDeleteCustomer {
	public static void main(String[] args) {
		ActitimeDemo.launchBrowser();
		ActitimeDemo.navigate();
		ActitimeDemo.login();
		ActitimeDemo.minimizeFlyOutWindow();
		ActitimeDemo.createcustomer();
		ActitimeDemo.deletecustomer();
		ActitimeDemo.logout();
		ActitimeDemo.closeApplication();

	}
}
