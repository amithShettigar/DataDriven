package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import generic.Auto_constant;
import generic.Excel;

public class Logout implements Auto_constant {
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
		
		//Log out
		
		WebElement acc = driver.findElement(By.xpath("//a[@href='/MyAccount.action']"));
		Actions a= new Actions(driver);
		a.moveToElement(acc).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='/jsp/logout.jsp']")).click();
		
		

	}

}
