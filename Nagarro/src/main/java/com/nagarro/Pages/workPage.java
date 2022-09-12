/**
 * 
 */
package com.nagarro.Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.nagarro.Testcases.GlobalVariable;
import com.nagarro.Testcases.TestCase1;

import net.bytebuddy.asm.Advice.Enter;
/**
 * @author siddharthj
 *This class will store all the locators and methods of Fleet studio Work Page (POM)
 */
public class workPage extends TestCase1 {
	
	public static ExtentTest test1;
	 ExtentTest Loggers;
	 ExtentReports report;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	
	By Career = By.xpath("//div[@class=\"mainHeader--nav\"]//*[text()='careers']");
	By oppurtubities = By.xpath("//*[text()='View job opportunities']");
	By Country = By.xpath("//*[text()='India']");
	By Email = By.xpath("//*[@type='email']");
	By Mobile  = By.xpath("//*[@type='tel']");
	
	
	
	public workPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void navigateCarrerPage() {
		driver.findElement(Career).click();
	}
	
	public void VerifyDestinationURL() {
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(oppurtubities));
		System.out.println("Use of Explicit wait");
		String URL1 = driver.getCurrentUrl();
		System.out.println(URL1);
		
		if(URL1.equalsIgnoreCase("https://www.nagarro.com/en/careers")) {
			System.out.println("Landed on Carrer Page successfully");
		}
		else{
			System.out.println("Landed on incorrect page");
		}	
	}
	
	
	public void EnterData() {
		driver.findElement(oppurtubities).click();
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Country));
		
		driver.findElement(Country).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
		
		
		driver.findElement(Email).sendKeys("Jain.siddharth91@hotmail.com");
		driver.findElement(Mobile).sendKeys("7738106746");
		}
	
		
	}
