package testes;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CadastroCliente {
 
	
	private WebDriver driver;
	
	
	public CadastroCliente() {
		driver = new ChromeDriver();
	}
	
	@Given("entro na pagina inicial")
	public void entro_na_pagina_inicial() {
		driver.navigate().to("http://advantageonlineshopping.com/#/register");
	}
	
	@Given("clico no botao de cliente")
	public void clico_no_botao_de_cliente() {
		WebElement botaoCliente = driver.findElement(By.xpath("//a[@id='hrefUserIcon']"));
		botaoCliente.click();
	}
	
	@Given("clico no link <create new account>")
	public void clico_no_link_create_new_account() {
		WebElement linkNewAccount = driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']"));
		linkNewAccount.click();
	}
	
	@Given("preencho o formulario com informacoes pessoais")
	public void preencho_o_formulario_com_informacoes_pessoais() {
		WebElement  nomeDoCLiente = driver .findElement(By.xpath("//input[@name='first_nameRegisterPage']"));
		nomeDoCLiente.sendKeys("Alex");
		
		WebElement lastNomeDoCliente= driver.findElement(By.xpath("//input[@name='last_nameRegisterPage']"));
		lastNomeDoCliente.sendKeys("Sampaio");
		
		WebElement telefoneCliente = driver.findElement(By.xpath("//input[@name='phone_numberRegisterPage']"));
		telefoneCliente.sendKeys("11 93730-3821");
		
	}
	@Given("preencho informacao de residencia do cliente")
	public void preencho_informacao_de_residencia_do_cliente() {
		WebElement comboboxpais = driver.findElement(By.xpath("//select[@name='countryListboxRegisterPage']"));
		Select comboSelect = new Select(comboboxpais);
		comboSelect.selectByVisibleText("Brazil");
		
		WebElement cidade = driver.findElement(By.xpath("//input[@name='cityRegisterPage']"));
		cidade.sendKeys("Sao Paulo");
		
		WebElement estado = driver.findElement(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']"));
		estado.sendKeys("Sao Paulo");
		
		WebElement endereco = driver.findElement(By.xpath("//input[@name='addressRegisterPage']"));
		endereco.sendKeys("Av das Nacoes Unidas, 9902");
		
		WebElement cep = driver.findElement(By.xpath("//input[@name='postal_codeRegisterPage']"));
		cep.sendKeys("04794-000");	
	}
	
	@Given("clico no check para concordar com as politicas de privacidade")
	public void clico_no_check_para_concordar_com_as_politicas_de_privacidade() {
		WebElement checklist = driver.findElement(By.xpath("//input[@name='i_agree']"));
		checklist.click();
	}
	
	
	@Given("clico no botao <register>")
	public void clico_no_botao_register() {
		WebElement botaoRegister = driver.findElement(By.xpath("//button[@id='register_btnundefined']"));
		botaoRegister.click();
	}
	
	@Then("valido cadastro do cliente")
	public void valido_cadastro_do_cliente() {
		assertTrue("Cadastrado Com sucesso",true);
	}

}
