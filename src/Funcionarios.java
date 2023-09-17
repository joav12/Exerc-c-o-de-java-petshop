
public class Funcionarios extends Pessoas {
	int numeroDeFuncionarios = 0;
	double salario;
	
	public Funcionarios(String nome, String cpf, String numero, int idade, Double salario, int numeroDeFuncionarios) {
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
		this.idade = idade;
		this.salario = salario;
		this.numeroDeFuncionarios = numeroDeFuncionarios + 1;
	}
}
