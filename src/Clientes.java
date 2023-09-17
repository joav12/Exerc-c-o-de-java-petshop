
public class Clientes extends Pessoas {
	int numeroDeClientes = 0;
	
	public Clientes(String nome, String cpf, String numero, int idade, int numeroDeClientes) {
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
		this.idade = idade;
		
		this.numeroDeClientes = numeroDeClientes + 1;
		
	}
	
}
