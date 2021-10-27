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
		driver.switchTo().defaultContent();
		
		WebElement addInput1 = driver.findElement(By.id("addNum1"));
		WebElement addInput2 = driver.findElement(By.id("addNum2"));
		WebElement addButton = driver.findElement(By.id("addButton"));
		
		addInput1.sendKeys("50.4");
		addInput2.sendKeys("43.9");
		addButton.click();
		driver.switchTo().frame("addResult");
		
		WebElement addOutput = driver.findElement(By.tagName("pre"));
		String addFrameText = addOutput.getText();
		System.out.println("Add frame prints: " + addFrameText);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		// Subtract Elements
		WebElement subtractInput1 = driver.findElement(By.id("subtractNum1"));
		WebElement subtractInput2 = driver.findElement(By.id("subtractNum2"));
		WebElement subtractButton = driver.findElement(By.id("subtractButton"));

		subtractInput1.sendKeys("60.4");
		subtractInput2.sendKeys("43.9");
		subtractButton.click();
		driver.switchTo().frame("subtractResult");

		WebElement subtractOutput = driver.findElement(By.tagName("pre"));
		String subtractFrameText = subtractOutput.getText();
		System.out.println("Subtract frame prints: " + subtractFrameText);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();

		// Locate the 2 input elements and button for dividing numbers
		WebElement divideInput1 = driver.findElement(By.id("divideNum1"));
		WebElement divideInput2 = driver.findElement(By.id("divideNum2"));
		WebElement divideButton = driver.findElement(By.id("divideButton"));
		
		divideInput1.sendKeys("50.0");
		divideInput2.sendKeys("10.0");
		divideButton.click();
		driver.switchTo().frame("divideResult");

		WebElement divideOutput = driver.findElement(By.tagName("pre"));
		String divideFrameText = divideOutput.getText();
		System.out.println("Divide frame prints: " + divideFrameText);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		// Locate the 2 input elements and button for multiplying numbers
		WebElement multiplyInput1 = driver.findElement(By.id("multiplyNum1"));
		WebElement multiplyInput2 = driver.findElement(By.id("multiplyNum2"));
		WebElement multiplyButton = driver.findElement(By.id("multiplyButton"));
		
		multiplyInput1.sendKeys("67");
		multiplyInput2.sendKeys("16");
		multiplyButton.click();
		driver.switchTo().frame("multiplyResult");

		WebElement multiplyOutput = driver.findElement(By.tagName("pre"));
		String multiplyFrameText = multiplyOutput.getText();
		System.out.println("Multiply frame prints: " + multiplyFrameText);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		
		// input elements for mod numbers
		WebElement modInput1 = driver.findElement(By.id("modNum1"));
		WebElement modInput2 = driver.findElement(By.id("modNum2"));
		WebElement modButton = driver.findElement(By.id("modButton"));
		
		modInput1.sendKeys("1583");
		modInput2.sendKeys("7");
		modButton.click();
		driver.switchTo().frame("modResult");

		WebElement modOutput = driver.findElement(By.tagName("pre"));
		String frameText = modOutput.getText();
		System.out.println("Mod frame prints: " + frameText);
		driver.switchTo().defaultContent();
		
		// closing the driver
		driver.close();

	}

}
