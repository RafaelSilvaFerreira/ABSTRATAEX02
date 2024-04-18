package view;


public class FuncionarioTempoParcial extends Funcionario {
	public String horaEntrada;
	public String horaSaida;

 public FuncionarioTempoParcial(int id, String nome, double salario, String horaEntrada, String horaSaida) {
     super(id, nome, salario);
     this.horaEntrada = horaEntrada;
     this.horaSaida = horaSaida;
 }

}

