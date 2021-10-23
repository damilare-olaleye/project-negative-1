package com.revature.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080");

		// pause
		Thread.sleep(6000);

		// Locate the 2 input elements and button for adding numbers
		WebElement addInput1 = driver.findElement(By.id("addNum1"));
		WebElement addInput2 = driver.findElement(By.id("addNum2"));
		WebElement addButton = driver.findElement(By.id("addButton"));

		addInput1.sendKeys("50.4");
		addInput2.sendKeys("43.9");
		addButton.click();

		// this switch inside the add result iframe
		driver.switchTo().frame("addResult");

		WebElement addOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 50.4 and 43.9 is: " + addOutput.getText());

		// Locate the 2 input elements and button for subtracting numbers
		WebElement subtractInput1 = driver.findElement(By.id("addNum1"));
		WebElement subtractInput2 = driver.findElement(By.id("addNum2"));
		WebElement subtractButton = driver.findElement(By.id("subtractButton"));

		subtractInput1.sendKeys("50.4");
		subtractInput2.sendKeys("43.9");
		subtractButton.click();

		// this switch inside the subtract result iframe
		driver.switchTo().frame("subtractResult");

		WebElement subtractOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 50.4 and 43.9 is: " + subtractOutput.getText());
		
		

	}

}
