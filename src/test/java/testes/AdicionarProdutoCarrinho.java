package testes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testes.driver.DriverAdvTest;

public class AdicionarProdutoCarrinho {

	private WebDriver driver;
	
	
	public AdicionarProdutoCarrinho() {
		DriverAdvTest.getDriver();
	}
			
	
	
	@Given("realizo login")
	public void realizo_login() throws InterruptedException {
		driver.navigate().to("https://advantageonlineshopping.com/#/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement botaoCliente = driver.findElement(By.xpath("//a[@data-ng-click=\"login('loginMiniTitle')\"]"));
		botaoCliente.click();
		
		WebElement txUsuario = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement txSenha = driver.findElement(By.xpath("//input[@name='password']"));
		
		txUsuario.sendKeys("alex");
		txSenha.sendKeys("1234");
	}
	@Given("escolho produto que desejo comprar")
	public void escolho_produto_que_desejo_comprar() {
		DriverAdvTest.getDriver().navigate().to("http://advantageonlineshopping.com/#/");
		
		WebElement speaker = driver.findElement(By.xpath("//div[@id='speakersImg']"));
		speaker.click();
		
		WebElement escolheSpeaker = driver.findElement(By.xpath("//img[@id='20']"));
		escolheSpeaker.click();
	}
	
	@Given("adiciona produto no carrinho")
	public void adiciona_produto_no_carrinho() {
		WebElement botaoCompar = driver.findElement(By.xpath("//button[@name='save_to_cart']"));
		botaoCompar.click();
	}
	@Given("clico no botao <checkout>")
	public void clico_no_botao_checkout() {
		WebElement botaoCheckout = driver.findElement(By.xpath("//button[@data-ng-click=\"checkout($event)\"]"));
		botaoCheckout.click();
	}
	@Given("clico no botao <next>")
	public void clico_no_botao_next() {
		WebElement botaoNext = driver.findElement(By.xpath("//button[@data-ng-click=\"shippingDetails_next()\"]"));
		botaoNext.click();
	}
	@Given("escolho metodo de pagamento")
	public void escolho_metodo_de_pagamento() {
		WebElement radioButton = driver.findElement(By.xpath("//input[@ng-checked=\"checkedRadio == 1\"]"));
		radioButton.click();
	}
	@Given("Digito dados para o pagamento")
	public void digito_dados_para_o_pagamento() {
		WebElement check = driver.findElement(By.xpath("//input[@ng-checked=\"checkedRadio == 1\"]"));
		WebElement txSafeUser = driver.findElement(By.xpath("//input[@name='safepay_username']"));
		WebElement txSafePass = driver.findElement(By.xpath("//input[@name='safepay_password']"));
		
		check.click();
		
		txSafeUser.sendKeys("dyeslen");
		txSafePass.sendKeys("Dy3513n$ilv4");
	}
	@Then("Confirmo compra")
	public void confirmo_compra() {
		WebElement payNow = driver.findElement(By.xpath("//button[@id='pay_now_btn_SAFEPAY']"));
		payNow.click();
	}

	
}
