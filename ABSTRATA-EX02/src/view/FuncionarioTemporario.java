package view;

public class FuncionarioTemporario extends Funcionario {
	public int diaFimContrato;
	public int mesFimContrato;
	public int anoFimContrato;

	 public FuncionarioTemporario(int id, String nome, double salario, int diaFimContrato, int mesFimContrato, int anoFimContrato) {
	     super(id, nome, salario);
	     this.diaFimContrato = diaFimContrato;
	     this.mesFimContrato = mesFimContrato;
	     this.anoFimContrato = anoFimContrato;
	 }
	}
