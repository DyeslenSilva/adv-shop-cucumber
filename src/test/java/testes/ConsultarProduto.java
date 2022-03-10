package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testes.driver.DriverAdvTest;

public class ConsultarProduto {
	
	
	private WebDriver driver;

	@Before
	public void before() {
		//DriverAdvTest.setDriver();
		driver = new ChromeDriver();
		System.out.println("Before");
	}
		
	
	@Given("escolho uma categoria")
	public void escolho_uma_categoria() {
		DriverAdvTest.getDriver().navigate().to("http://advantageonlineshopping.com/#/");
		WebElement speaker = driver.findElement(By.xpath("//div[@id='speakersImg']"));
		speaker.click();
	}
	@Given("escolho um produto")
	public void escolho_um_produto() {
		WebElement escolheSpeaker = driver.findElement(By.xpath("//img[@id='20']"));
		escolheSpeaker.click();
		
	}
	@Then("mostro detalhes do produto")
	public void mostro_detalhes_do_produto() {
		DriverAdvTest.getDriver().navigate().to("http://advantageonlineshopping.com/#/product/20");
	}
}
