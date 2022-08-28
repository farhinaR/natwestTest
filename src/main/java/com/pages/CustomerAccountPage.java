package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerAccountPage {
private WebDriver driver;
	
	public CustomerAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By ViewCustomerAccount= By.xpath("//*[@title='View my customer account']");
	
	private By ClickPersonalInformation = By.xpath("//*[@title='Information']");
	
	private By ClickuserFirstName = By.id("firstname");
	
	private By password = By.id("old_passwd");
	
	private By SaveUserFirstName = By.xpath("//span[contains(text(), 'Save')]");
	
	public void clickonViewCustomerAccount() {
		 driver.findElement(ViewCustomerAccount).click();
		}
	
	public void clickonMyPersonalInformation() {
		 driver.findElement(ClickPersonalInformation).click();
		}
	
	public void clickonfirstName() {
		 driver.findElement(ClickuserFirstName).sendKeys("FARHINAR");
		}
	
	public void UserSavesFirstName() {
		driver.findElement(password).sendKeys("GUDDU1coco");
		driver.findElement(SaveUserFirstName).click();
	}
	
	
}
