public class Vendedor extends Empregado{
  double valorvenda;
  double comissao;


  public Vendedor(String nome, String logradouro, String telefone, int codsetor, double salariobase, double imposto, double valorvenda, double comissao){
    super(nome,logradouro,telefone,codsetor,salariobase,imposto);
    this.valorvenda = valorvenda;
    this.comissao = comissao;
  }

  public Vendedor(){
    super();
    this.valorvenda = 0;
    this.comissao = 0;
  }

  public double getvalorvenda(){
    return this.valorvenda;
  }

  public void setvalorvenda(double valorvenda){
    this.valorvenda = valorvenda;
  }

  public double getcomissao(){
    return this.comissao;
  }

  public void setcomissao(double comissao){
    this.comissao = comissao; }
  
  public double calcularsalario() {
    double salario = super.calcularsalario() + (valorvenda * comissao);
    System.out.println("Salário do colaborador => " + salario);
    return salario; }
}