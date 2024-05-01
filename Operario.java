public class Operario extends Empregado {
  double valorproducao;
  double comissao;
  double resultado;
 
public Operario(String nome, String logradouro, String telefone, int codsetor, double salariobase, double imposto,double valorproducao,double comissao) {
  super(nome,logradouro,telefone,codsetor,salariobase,imposto);
  this.valorproducao = valorproducao;
  this.comissao = comissao; }
 
public Operario() {
  super();
  this.valorproducao = 0;
  this.comissao = 0; }

public double getvalorproducao(){
  return this.valorproducao; }

public void setvalorproducao(double valorproducao){
  this.valorproducao = valorproducao; }

public double getcomissao() {
  return this.comissao; }

public void setcomissao(double comissao) {
  this.comissao = comissao; }

public double calcularsalario() {
  double salario = super.calcularsalario() + (valorproducao * comissao);
  System.out.println("Salário do colaborador => " + salario);
  return salario; }
}