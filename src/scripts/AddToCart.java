package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.Excel;

public class AddToCart implements Auto_constant{
	
	static
	{
		System.setProperty(key,value);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		String us = Excel.abc(excelpath,"Sheet1",0,0);
		String pwd = Excel.abc(excelpath, "Sheet1", 1, 0);
		
		WebDriver driver= new ChromeDriver();
		
		//Enter URL
		driver.get("https://www.infibeam.com/");
				
			//Log In
			driver.findElement(By.id("loginlink")).click();	
			driver.findElement(By.id("userHandle")).sendKeys(us);
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.xpath("//div/button[.='LOGIN']")).click();
			
			
			Thread.sleep(4000);
			
			//Search Product
			driver.findElement(By.id("suggest")).sendKeys("google pixel");
			driver.findElement(By.id("search-icon")).click();
			driver.findElement(By.xpath("//a[@title='Google Pixel, very silver, 128 gb']")).click();
			Thread.sleep(4000);
			
			
			//Add to Wishlist
			driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
			Thread.sleep(4000);
			
			//View Cart
						//driver.findElement(By.xpath("//span[@class='img']")).click();
			
			//Remove the product from Cart
			     
			driver.findElement(By.xpath("//a[@class='button is-link']")).click();
			
	}

}
