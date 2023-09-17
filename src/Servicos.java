
public class Servicos {
	String nome;
	Double preco;
	int numeroDeServicos = 0;
	
	public Servicos(String nome, Double preco, int numeroDeServicos) {
		this.nome = nome;
		this.preco = preco;
		
		this.numeroDeServicos = numeroDeServicos + 1;
	}
	
}
