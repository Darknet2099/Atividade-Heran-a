public class Fornecedor extends Pessoa {
double ValorCredito;
double ValorDivida;
double resultado;

public Fornecedor(String nome, String logradouro, String telefone, double ValorCredito,double ValorDivida) {
  super(nome,logradouro,telefone);
  this.ValorCredito = ValorCredito;
  this.ValorDivida = ValorDivida; }

public Fornecedor(){
  super();
  this.ValorCredito = 0;
  this.ValorDivida = 0; }
  
public double getValorCredito() {
  return this.ValorCredito; }

public void setValorCredito(double ValorCredito) {
  this.ValorCredito = ValorCredito; }
  
  public double getValorDivida() {
    return this.ValorDivida; }
  
  public void setValorDivida(double valorDivida) {
    this.ValorDivida = ValorDivida;}

public double obterSaldo(){
  resultado = ValorCredito - ValorDivida;
  System.out.println("Saldo: " + resultado);
  return resultado; }
}