
public class Produtos {
	String nome, entrega, saida;
	Double preco;
	int numeroDeProdutos = 0;
	
	public Produtos(String nome, String entrega, String saida, Double preco, int numeroDeProdutos) {
		this.nome = nome;
		this.entrega = entrega;
		this.saida = saida;
		this.preco = preco;
		
		this.numeroDeProdutos = numeroDeProdutos + 1;
	}
}
