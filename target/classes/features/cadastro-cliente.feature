 @cadastroDeCliente
Feature: Cadastro de Clientes
   Scenario: cadastro
		Given entro na pagina inicial
		And clico no botao de cliente
		And clico no link <create new account>
		And preencho o formulario com informacoes pessoais
		And preencho informacao de residencia do cliente
		And clico no check para concordar com as politicas de privacidade
		And clico no botao <register>
		Then valido cadastro do cliente
		
		
		