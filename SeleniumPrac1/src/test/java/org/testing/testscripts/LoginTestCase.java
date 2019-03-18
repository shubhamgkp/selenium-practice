package org.testing.testscripts;

import org.testing.base.Base;
import org.testing.pages.LoginPage;
import org.testing.utilities.Logs;
import org.testng.annotations.Test;

public class LoginTestCase extends Base {

	@Test
	public void gmailLogin() {
				
		LoginPage login = new LoginPage(driver);
		login.clickSignin();
		Logs.takeLog("LoginTestCase", "Clicking on Signin button successfully!!!");
	}
}
