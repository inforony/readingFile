package com.bfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class readingFile {

	public static void main(String[] args) throws Exception {
		Properties prof = new Properties();
		FileInputStream input = new FileInputStream("C:\\Users\\abull\\workspace\\Selenium\\src\\config.properties");
		prof.load(input);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prof.getProperty("site"));
		driver.findElement(By.id("Email")).sendKeys(prof.getProperty("user"));
		driver.findElement(By.name("signIn")).click();
		driver.findElement(By.name("Passwd")).sendKeys(prof.getProperty("passward"));
		driver.findElement(By.id("signIn")).click();
		
	}

	
}
