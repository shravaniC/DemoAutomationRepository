package com.sgtesting.tests;

public class CreateNDeleteProject {
	public static void main(String[] args) {
		ActitimeDemo.launchBrowser();
		ActitimeDemo.navigate();
		ActitimeDemo.login();
		ActitimeDemo.minimizeFlyOutWindow();
		ActitimeDemo.createcustomer();
		ActitimeDemo.createProject();
		ActitimeDemo.deleteProject();
		ActitimeDemo.deletecustomer();
		ActitimeDemo.logout();
		ActitimeDemo.closeApplication();
	}
}
