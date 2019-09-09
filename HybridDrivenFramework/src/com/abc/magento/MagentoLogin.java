package com.abc.magento;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLogin {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Selenium\\HybridDrivenFramework\\src\\com\\abc\\utilities\\HybridDriven.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String nurl = p.getProperty("url");
		String nusername = p.getProperty("username");
		String npassword = p.getProperty("password");
		String nmyacct = p.getProperty("myacct");
		String nemail = p.getProperty("email");
		String npass = p.getProperty("pass");
		String nlogin = p.getProperty("login");
		String nlogout = p.getProperty("logout");
		
		System.out.println(npass);
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait
		                    (20, TimeUnit.SECONDS);
		
		driver.get(nurl);
		
		driver.findElement(By.xpath(nmyacct)).click();
		driver.findElement(By.xpath(nemail)).sendKeys(nusername);
		driver.findElement(By.xpath(npass)).sendKeys(npassword);
		driver.findElement(By.xpath(nlogin)).click();
		driver.findElement(By.xpath(nlogout)).click();
		
		driver.close();
		
		
		
		

	}

}
