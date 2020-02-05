package com.rnbros.Test;

import org.testng.annotations.Test;

import com.rnbros.WebDriverParalleService.PreStep;
import com.rnbros.WebDriverParalleService.WDService;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class NewTest {

	@BeforeSuite
	public void beforeSuite() {
		new WDService(WDService.CHROME, new PreStep() {

			public void initDriver(WebDriver wd) {
				wd.get("http://www.google.co.in");
			}
		});
	}

	@Test
	public void f() {
		WebDriver wd = WDService.getDriver();
		WebElement wE = wd.findElement(By.name("q"));
		wE.clear();
		wE.sendKeys("India" + Keys.ENTER);
	}

	@Test
	public void f1() {
		WebDriver wd = WDService.getDriver();
		WebElement wE = wd.findElement(By.name("q"));
		wE.clear();
		wE.sendKeys("Japan" + Keys.ENTER);
	}

	@Test
	public void f2() {
		WebDriver wd = WDService.getDriver();
		WebElement wE = wd.findElement(By.name("q"));
		wE.clear();
		wE.sendKeys("US" + Keys.ENTER);
	}

	@Test
	public void f3() {
		WebDriver wd = WDService.getDriver();
		WebElement wE = wd.findElement(By.name("q"));
		wE.clear();
		wE.sendKeys("South Africa" + Keys.ENTER);
	}

	@Test
	public void f4() {
		WebDriver wd = WDService.getDriver();
		WebElement wE = wd.findElement(By.name("q"));
		wE.clear();
		wE.sendKeys("Nepal" + Keys.ENTER);
	}

	@Test
	public void f6() {
		WebDriver wd = WDService.getDriver();
		WebElement wE = wd.findElement(By.name("q"));
		wE.clear();
		wE.sendKeys("Bhutan" + Keys.ENTER);
	}

	@AfterSuite
	public void afterSuite() {
		WDService.close();
	}

}
