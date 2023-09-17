
public class Fornecedores extends Pessoas{
	int numeroDeFornecedores = 0;
	double preco;
	
	public Fornecedores(String nome, String cpf, String numero, int idade, Double preco, int numeroDeFornecedores) {
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
		this.idade = idade;
		this.preco = preco;
		
		this.numeroDeFornecedores = numeroDeFornecedores + 1;
	}
}
