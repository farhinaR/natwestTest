package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

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
	
public void Summary_checkout() throws InterruptedException {
	
//	WebElement element = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
	
	}
	
public void Address_checkout() {
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
	
}

public void Shipping_checkout() {
	driver.findElement(By.id("cgv")).click();
	driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();

}

public void Payment_checkout() {
	driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
	driver.findElement(By.xpath("//*[@id=\'cart_navigation\']/button")).click();
}

public void Order_Completed() {
	
	
	String str = driver.getPageSource();

    if(driver.getPageSource().contains("Your order on My Store is complete.")){
		System.out.println("Order verified");
		}else{
		System.out.println("Order is not verified");
		}
	
}

}
	
 
 


