package org.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testing.base.Base;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver; 
	}
	
	
	public void clickSignin() {
		
		driver.findElement(By.xpath("//a[@id='gb_70']")).click();
	}
}
