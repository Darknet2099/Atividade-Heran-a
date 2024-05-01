public class Administrador extends Empregado {
  double ajudacusto;
  

public Administrador(String nome, String logradouro, String telefone, int codsetor, double salariobase, double imposto, double ajudacusto) {
  super(nome,logradouro,telefone,codsetor,salariobase,imposto);
  this.ajudacusto = ajudacusto; }

public Administrador() {
  super();
  this.ajudacusto = 0; }

public double getajudacusto() {
  return this.ajudacusto; }
  

public void setajudacusto(double ajudacusto) {
  this.ajudacusto = ajudacusto; }

public double calcularsalario() {
  double salario = super.calcularsalario() + ajudacusto;
  System.out.println("Salário do colaborador => " + salario);
  return salario; }
  
}