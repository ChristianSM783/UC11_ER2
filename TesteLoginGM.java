package br.senai.sp.testegm;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class TesteLoginGM {
	private static final TimeUnit SECONDS = null;
	private static WebDriver driver;
	
	@Before
	
	
	public void Setup() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Programas\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void TestarLogin() {
		driver.get("http://localhost:4200/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-home/header/a[1]")).click();
		
		//Primeiro Teste
		driver.findElement(By.id("email")).sendKeys("christian@email.com");
		driver.findElement(By.id("senha")).sendKeys("senai");
		
		driver.findElement(By.xpath("/html/body/app-root/app-login/main/form/button")).click();
		
		//WebElement mensagem = driver.findElement(By.xpath("/html/body/app-root/app-login/main/p"));
		
		//System.out.println(mensagem.getText());
	}
}
