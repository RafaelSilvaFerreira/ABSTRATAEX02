package controller;

import view.Funcionario;
import controller.Controle;

public class Main {
 public static void main(String[] args) {
	 
     Funcionario funcionario1 = Controle.contratarFuncionario("Integral", 101, "João", 3000.0, "40");
     Funcionario funcionario2 = Controle.contratarFuncionario("Parcial", 102, "Maria", 2000.0, "08:00", "17:00");
     Funcionario funcionario3 = Controle.contratarFuncionario("Temporario", 103, "Pedro", 2500.0, "30", "6", "2024");

     System.out.println("Integral:");
     System.out.println(funcionario1);

     System.out.println("\nParcial:");
     System.out.println(funcionario2);

     System.out.println("\nTemporário:");
     System.out.println(funcionario3);
 }
}
