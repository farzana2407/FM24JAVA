package com.interviewCodeQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Print the title of the page
		String script = "return document.title;";
		String title = (String)js.executeScript(script);
		System.out.println(title);
		
		//Click button
		driver.switchTo().frame("iframeResult");
		js.executeScript(" myFunction()");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("alert clicked");
		
		//HighLight button
		WebElement button = driver.findElement(By.xpath("/html/body/button "));
		js.executeScript("arguments[0].style.border='5px solid red'", button);
		System.out.println("highlight done");
		
		//Scroll down or scroll down to click specific element
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certifiButton = driver.findElement(By.xpath("//a[@class='w3-button w3-block tut-button']"));
		js.executeScript("arguments[0].scrollIntoView(true);", certifiButton);
		certifiButton.click();
		System.out.println("scrolldown done ");
		
		
		
		
		
		
		
		
		
		
		
	}

}
