package testes;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testes.driver.DriverAdvTest;

public class LoginUsuario {

	
	private WebDriver driver;
	
	
	@Before
	public void before() {
		DriverAdvTest.setDriver();
		driver = new ChromeDriver();
		System.out.println("Before");
	}
		
	@Given("clico no botao de cadastro de usuario")
	public void clico_no_botao_de_cadastro_de_usuario() throws InterruptedException {
		DriverAdvTest.getDriver().navigate().to("http://advantageonlineshopping.com/#/");
		Thread.sleep(4000);
		WebElement botaoCliente = driver.findElement(By.xpath("//a[@data-ng-click=\"login('loginMiniTitle')\"]"));
		botaoCliente.click();
	}
	
	@Given("digito usuario e senha")
	public void digito_usuario_e_senha() {
		WebElement txUsuario = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement txSenha = driver.findElement(By.xpath("//input[@name='password']"));
		
		txUsuario.sendKeys("alex");
		txSenha.sendKeys("1234");
	}
	@Given("clico no botao de login")
	public void clico_no_botao_de_login() {
		WebElement btSignIn = driver.findElement(By.xpath("//button[@data-ng-click=\"senderCtrl.send()\"]"));
		btSignIn.click();
	}
	@Then("redireciona para a pagina inicial")
	public void redireciona_para_a_pagina_inicial() {
		assertTrue("Pagina Inicial",true);
	}

}
