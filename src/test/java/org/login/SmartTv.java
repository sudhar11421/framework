package org.login;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SmartTv extends BaseClass {

	public static BaseClass b = new BaseClass();

	@BeforeClass
	public static void getBrowser() {
		try {
			b.getDriver("Chrome");
			b.windowsMax();

		} catch (Exception e) {

		}
	}

	@Before
	public void urlLaunched() {
		try {
			b.getUrl("https://www.amazon.in/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		} catch (Exception e) {

		}

	}

	@Test
	public void logininDataEntering() {
		try {
			b.getThread(2000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart tv", Keys.ENTER);

			List<WebElement> smartTv = driver
					.findElements(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']"));

			List<WebElement> price = driver.findElements(By.cssSelector("span[class=a-price-whole]"));

			Map<Integer, String> m = new TreeMap();
			for (WebElement smart : smartTv) {
				String text = smart.getText();
				// System.out.println(text);

				for (WebElement Price : price) {

					String text1 = Price.getText();
					// System.out.println(text1);

					String string = text1.replaceAll("[^0-9]", "");

					int PriceValue = Integer.parseInt(string);

					m.put(PriceValue, string);
				}
			}

			Set<Integer> PriceList = m.keySet();
			// System.out.println(p);

			ArrayList<Integer> arraylist = new ArrayList<Integer>(PriceList);
			Integer LOW_Price = arraylist.get(0);
			System.out.println("Lower Price Is : " + LOW_Price);
		} catch (Exception e) {
		}
	}

	private String String() {
		return null;
	}

}
