package controller;

import view.Funcionario;
import view.FuncionarioTempoIntegral;
import view.FuncionarioTempoParcial;
import view.FuncionarioTemporario;

class Controle {
	 public static Funcionario contratarFuncionario(String tipo, int id, String nome, double salario, String... att) {
		 
		 Funcionario funcionario = null;
		 
	     switch (tipo) {
	         case "Integral":
	             int bancoHoras = Integer.parseInt(att[0]);
	             funcionario = new FuncionarioTempoIntegral(id, nome, salario, bancoHoras);
	             break;
	         case "Parcial": 
	             String horaEntrada = att[0];
	             String horaSaida = att[1];
	             funcionario = new FuncionarioTempoParcial(id, nome, salario, horaEntrada, horaSaida);
	             break;
	         case "Temporario": 
	             int diaFimContrato = Integer.parseInt(att[0]);
	             int mesFimContrato = Integer.parseInt(att[1]);
	             int anoFimContrato = Integer.parseInt(att[2]);
	             funcionario = new FuncionarioTemporario(id, nome, salario, diaFimContrato, mesFimContrato, anoFimContrato);
	             break;
	     }
	     return funcionario;
	 }
	}
