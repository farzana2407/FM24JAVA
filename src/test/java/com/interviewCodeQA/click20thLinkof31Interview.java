package com.interviewCodeQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class click20thLinkof31Interview {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
        driver.manage().window().maximize();
		driver.findElement(By.linkText("Sample Forms")).click();

		
	    List<WebElement> links = driver.findElements(By.xpath("//div[@id='left_col_top']//a"));
	    
	    System.out.println("Total number of links :"+links.size());

	   
		   for(int i=0;i<links.size();i++) {
			   links.get(20).click();
			 
		   //System.out.println(links.get(i).getText());
		   //xpath= "//*[@id=\"left_col_top\"]/ul/li"
	//	   for (int i = 1; i < links.size(); i++) {
//				List<WebElement> links2=driver.findElements(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li/a"));
//			     for (int j = 1; j < links2.size(); j++) {
//					driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li["+j+"]/a")).click();
//					
//				}
   
//		   for (int i = 1; i < links.size(); i++) {
//				List<WebElement> links2=driver.findElements(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li/a"));
//			     for (int j = 1; j <= links2.size(); j++) {
//					driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li["+j+"]/a")).click();
//				System.out.println("Section: "+i+" Element:"+j+"."+driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li["+j+"]/a")).getText());
//				} 

		 
	   }
	
	
	}

}
