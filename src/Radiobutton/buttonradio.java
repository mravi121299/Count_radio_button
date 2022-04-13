package Radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class buttonradio {
	@Test
	public void IDdemo() {
		System.setProperty("webdriver.chrome.driver", "D:\\DXC Training testing tools\\DXC Selenium Automation  Class\\LaunchChromeBroweser\\chromebrowersjars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Ravi%20Mishra/Downloads/RadioButtons.html");
		List<WebElement>Buttons=driver.findElements(By.name("group-1"));
		int n=Buttons.size();
		System.out.println("Number of buttons is..."+n);

}}
