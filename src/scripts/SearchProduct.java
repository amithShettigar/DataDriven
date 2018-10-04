package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import generic.Auto_constant;
import generic.Excel;

public class SearchProduct implements Auto_constant {
	
	static
	{
		System.setProperty(key,value);
	}

	public static void main(String[] args) throws InterruptedException {
		
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
		
		//Search Product
		driver.findElement(By.id("suggest")).sendKeys("google pixel");
		driver.findElement(By.id("search-icon")).click();
		driver.findElement(By.xpath("//a[@title='Google Pixel, very silver, 128 gb']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
