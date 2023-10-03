package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WindowsHandling {

	public static void main(String[] args ){

		// Browser configure
		WebDriverManager.edgedriver().setup();

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("i phone 14 pro max",Keys.ENTER);

		List<WebElement> Apple = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 14 Pro Max ')]"));

		System.out.println("All I phone 14 pro mobiles:");

		for(WebElement Iphone : Apple) {

			String Text = Iphone.getText();

			System.out.println(Text);
		}

		System.out.println("----------------------------------------------");

		List<WebElement> All_Price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		System.out.println("All I phone 14 pro mobile Price:");

		for(WebElement Price : All_Price) {

			String Text2 = Price.getText();

			System.out.println(Text2);
		}
	}
}