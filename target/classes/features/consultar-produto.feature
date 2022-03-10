Feature: Consultar Produtos
	Realizar consulta de produtos
	
  @consultarProduto
  Scenario: Consultar Produto
		Given entro na pagina inicial
		And escolho uma categoria
		And escolho um produto
		Then mostro detalhes do produto
		
		