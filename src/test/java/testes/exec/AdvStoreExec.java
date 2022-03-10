package testes.exec;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/consultar-produto.feature",
		tags="@consultarProduto",glue = "testes")
public class AdvStoreExec {

}