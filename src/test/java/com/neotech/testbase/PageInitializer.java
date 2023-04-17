package com.neotech.testbase;

import com.neotech.pages.*;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;


	public static void initialize() {
		login = new LoginPageElements();

	}

}
