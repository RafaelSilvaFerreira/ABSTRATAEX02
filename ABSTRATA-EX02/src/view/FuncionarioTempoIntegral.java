package view;

public class FuncionarioTempoIntegral extends Funcionario {
	public int bancoHoras;

	 public FuncionarioTempoIntegral(int id, String nome, double salario, int bancoHoras) {
	     super(id, nome, salario);
	     this.bancoHoras = bancoHoras;
	 }

	}