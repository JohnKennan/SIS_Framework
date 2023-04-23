package com.neotech.testbase;

import com.neotech.pages.HomepageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.ParentalTabElements;
import com.neotech.pages.StaffPageElements;
import com.neotech.pages.StudentsPageElements;
import com.neotech.pages.UserPageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static HomepageElements homepage;
	public static StudentsPageElements studentsTab;
	public static UserPageElements userPage;
	public static ParentalTabElements parental;
	public static StaffPageElements staff;
	
	
	public static void initialize() {
		login = new LoginPageElements();
		homepage = new HomepageElements();
		studentsTab = new StudentsPageElements();
		userPage = new UserPageElements();
		parental = new ParentalTabElements();
		staff = new StaffPageElements();
		
	}

}
