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
		Thread.sleep(1000);

		// Locate the 2 input elements and button for adding numbers
		WebElement addInput1 = driver.findElement(By.id("addNum1"));
		WebElement addInput2 = driver.findElement(By.id("addNum2"));
		WebElement addButton = driver.findElement(By.id("addButton"));

		addInput1.sendKeys("50.4");
		addInput2.sendKeys("43.9");
		addButton.click();

		// pause
		Thread.sleep(1000);
		// this switch inside the add result iframe
		driver.switchTo().frame("addResult");

		WebElement addOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 50.4 and 43.9 is: " + addOutput.getText());

		// Locate the 2 input elements and button for subtracting numbers

		WebElement subtractInput1 = driver.findElement(By.id("subtractNum1"));
		WebElement subtractInput2 = driver.findElement(By.id("subtractNum2"));
		WebElement subtractButton = driver.findElement(By.id("subtractButton"));

		subtractInput1.sendKeys("50.4");
		subtractInput2.sendKeys("43.9");
		subtractButton.click();

		// pause
		Thread.sleep(1000);
		// this switch inside the subtract result iframe
		driver.switchTo().frame("subtractResult");

		WebElement subtractOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 50.4 and 43.9 is: " + subtractOutput.getText());

		// Locate the 2 input elements and button for dividing numbers
		WebElement divideInput1 = driver.findElement(By.id("divideNum1"));
		WebElement divideInput2 = driver.findElement(By.id("divideNum2"));
		WebElement divideButton = driver.findElement(By.id("divideButton"));

		divideInput1.sendKeys("50.4");
		divideInput2.sendKeys("43.9");
		divideButton.click();

		// pause
		Thread.sleep(1000);
		// this switch inside the divide result iframe
		driver.switchTo().frame("subtractResult");

		WebElement divideOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 50.4 and 43.9 is: " + divideOutput.getText());

		// Locate the 2 input elements and button for multiplying numbers
		WebElement multiplyInput1 = driver.findElement(By.id("multiplyNum1"));
		WebElement multiplyInput2 = driver.findElement(By.id("multiplyNum2"));
		WebElement multiplyButton = driver.findElement(By.id("multiplyButton"));

		multiplyInput1.sendKeys("50.4");
		multiplyInput2.sendKeys("43.9");
		multiplyButton.click();

		// pause
		Thread.sleep(1000);
		// this switch inside the multiply result iframe
		driver.switchTo().frame("multiplyResult");

		WebElement multiplyOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 50.4 and 43.9 is: " + multiplyOutput.getText());

		// Locate the 2 input elements and button for mod numbers
		WebElement modInput1 = driver.findElement(By.id("modNum1"));
		WebElement modInput2 = driver.findElement(By.id("modNum2"));
		WebElement modButton = driver.findElement(By.id("modButton"));

		modInput1.sendKeys("50.4");
		modInput2.sendKeys("43.9");
		modButton.click();

		// pause
		Thread.sleep(1000);
		
		// this switch inside the mod result iframe
		driver.switchTo().frame("multiplyResult");

		WebElement modOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 50.4 and 43.9 is: " + modOutput.getText());

	}

}
