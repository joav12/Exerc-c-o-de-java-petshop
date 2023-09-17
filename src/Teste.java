
public class Teste {
	public static void main(String[] args) {
		int quantidadeDeClientes = 0, quantidadeDeFunc = 0, quantidadeDeForn = 0, quantidadeServ = 0, quantidadeProd = 0;
		
		/*Clientes*/
		Clientes cliente = new Clientes("João", "123.456.789-00", "40028922", 19, quantidadeDeClientes);
		System.out.println("Olá " + cliente.nome + ", bem víndo");

		/*Funcionários*/
		Funcionarios funcionario = new Funcionarios("Jorge", "123.456.789-00", "40028922", 23, 1200.00, quantidadeDeFunc);
		System.out.println("Olá funcionário " + funcionario.nome + ", bem víndo");
		
		/*Fornecedor*/
		Fornecedores fornecedor = new Fornecedores("Paulo", "123.456.789-00", "40028922", 23, 2000.00, quantidadeDeForn);
		System.out.println("O fornecedor " + fornecedor.nome + " cobra R$" + fornecedor.preco + " por carga");
		
		/*Serviços*/
		Servicos tosa = new Servicos("Tosa", 100.00, quantidadeServ);
		Servicos banho = new Servicos("banho", 95.00, quantidadeServ);
		quantidadeServ = banho.numeroDeServicos + tosa.numeroDeServicos;
		
		System.out.println("Você selecionou o serviço: " + tosa.nome + ", ele custa uma bagatela de: R$" + tosa.preco);
		
		System.out.println("Quantidades de serviços disponíveis: " + quantidadeServ);
		
		
		/*Promises*/
		Produtos racao = new Produtos("Ração pra cachorro", "21-08-2023", "10-09-2023", 30.00, quantidadeProd);
		Produtos coleira = new Produtos("Coleira", "26-08-2023", "15-09-2023", 45.00, quantidadeProd);
		Produtos brinquedo = new Produtos("Brinquedo para gato", "28-08-2023", "17-09-2023", 50.00, quantidadeProd);
		quantidadeProd = racao.numeroDeProdutos + coleira.numeroDeProdutos + brinquedo.numeroDeProdutos;
		
		System.out.println("Você selecionou o produto: " + brinquedo.nome + ", ele custa uma bagatela de: R$" + brinquedo.preco);
		
		System.out.println("Quantidades de produtos disponíveis: " + quantidadeProd);
	}
}
