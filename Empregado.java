public class Empregado extends Pessoa {
int codsetor;
double salariobase;
double imposto;

public Empregado(String nome, String logradouro, String telefone, int codsetor, double salariobase, double imposto) {
  super(nome,logradouro,telefone);
  this.codsetor = codsetor;
  this.salariobase = salariobase;
  this.imposto = imposto; }

public Empregado() {
  super();
  this.codsetor = 0;
  this.salariobase = 0;
  this.imposto = 0; }

public int getcodsetor() {
  return this.codsetor; }

public void setcodsetor(int codsetor) {
  this.codsetor = codsetor; }

public double getsalariobase() {
  return this.salariobase; }

public void setsalariobase(double salariobase) {
  this.salariobase = salariobase; } 

  public double getimposto() {
  return this.imposto; }  

public void setimposto(double imposto){
  this.imposto = imposto; }

public double calcularsalario(){
  double salario = salariobase - (salariobase * imposto/100);
  System.out.println("Salário do colaborador => " + salario);
  return salario; }
  
}
