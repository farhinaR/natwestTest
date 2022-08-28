package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStorePage {
	
	private WebDriver driver;
	
	public MyStorePage(WebDriver driver) {
		this.driver = driver;
	}

	
	private By TShirtLink = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
	private By ListViewLink=By.id("list");
	
	private By AddToCartBtn=By.xpath("//*[@title='Add to cart']");
	private By ProceedtoCheckout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	
	 
	
	public void clickonTshirtSlink() {
	 driver.findElement(TShirtLink).click();
	}
	
	public void ChoseListView() {
		 driver.findElement(ListViewLink).click();
		}
	
	public void Click_AddtoCart() {
		driver.findElement(AddToCartBtn).click();
	}
	
	
	public void click_Proceedtocheckout() {
		
		WebElement chkoutbtn=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chkoutbtn);
	}
	
	
}
	
 
 


