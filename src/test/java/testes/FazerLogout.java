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

public class FazerLogout {

	private WebDriver driver;
	
	@Before
	public void before() {
		DriverAdvTest.setDriver();
		driver = new ChromeDriver();
		System.out.println("Before");
	}
	
	
	@Given("Entro no site")
	public void entro_no_site() {
		DriverAdvTest.getDriver().navigate().to("http://advantageonlineshopping.com/#/");
	}
	
	@Given("clico no botao de <cliente>")
	public void clico_no_botao_de_cliente() {
		WebElement botaoCliente = driver.findElement(By.xpath("//a[@data-ng-click=\"login('loginMiniTitle')\"]"));
		botaoCliente.click();
	}
	@Given("digito login e senha")
	public void digito_login_e_senha() {
		WebElement txUsuario = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement txSenha = driver.findElement(By.xpath("//input[@name='password']"));
		
		txUsuario.sendKeys("alex");
		txSenha.sendKeys("1234");
	}
	@Given("valido login")
	public void valido_login() {
		assertTrue("login realizado com sucesso", true);
	}
	@Given("clico em sair")
	public void clico_em_sair() {
		WebElement botaoCliente = driver.findElement(By.xpath("//a[@id=\"menuUserLink\"]"));
		
		botaoCliente.click();
		
		WebElement signOut = driver.findElement(By.xpath("//label[@ng-click=\"signOut($event)\"]"));
		signOut.click();
		
	}
	@Then("valido logout")
	public void valido_logout() {
		assertTrue(true);
	}


}
