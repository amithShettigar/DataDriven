package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
		static{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		}
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.infibeam.com/");
		
		Sample s=new Sample(driver);
		
		driver.findElement(By.id("loginlink")).click();
		
		s.username("bw25013@gmail.com");
		s.password("Bruceinfibeam2018");

	}

}
