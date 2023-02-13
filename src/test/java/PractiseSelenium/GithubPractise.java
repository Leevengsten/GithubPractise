package PractiseSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GithubPractise {
	@Test
	public void tc1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.get("https://github.com/Leevengsten/PostCheck");
		//driver.findElement(By.id("projects-tab")).click();
		//driver.findElement(By.id("insights-tab")).click();
		
	}

}
