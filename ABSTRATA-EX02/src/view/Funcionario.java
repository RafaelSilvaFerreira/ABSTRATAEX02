package view;


public abstract class Funcionario {
 public int id;
 public String nome;
 public double salario;

 public Funcionario(int id, String nome, double salario) {
     this.id = id;
     this.nome = nome;
     this.salario = salario;
 }

}
