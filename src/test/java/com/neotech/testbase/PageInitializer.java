package com.neotech.testbase;

import com.neotech.pages.*;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static HomepageElements homepage;
	public static StudentsPageElements studentsTab;

	public static void initialize() {
		login = new LoginPageElements();
		homepage = new HomepageElements();
		studentsTab = new StudentsPageElements();
		
	}

}
