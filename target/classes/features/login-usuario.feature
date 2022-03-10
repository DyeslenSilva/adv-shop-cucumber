
Feature: Login de um usuario
  @realizarLogin
  Scenario: Realizar Login
		Given entro na pagina inicial
		And clico no botao de cadastro de usuario
		And digito usuario e senha
		And clico no botao de login
		Then redireciona para a pagina inicial
