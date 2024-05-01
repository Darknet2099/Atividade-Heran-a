public class Pessoa {
private String nome;
private String logradouro;
private String telefone;

  //Crie um método construtor que receba como parâmetro o nome, o logradouro e o telefone
  public Pessoa(String nome, String logradouro, String telefone) {
      this.nome = nome;
      this.logradouro = logradouro;
      this.telefone = telefone; }

  public Pessoa(){
  this.nome = "Não inserido";
  this.logradouro = "Não inserido";
  this.telefone = "Não inserido"; }
  
  public String getnome(){
    return this.nome; }
  
  public void setnome(String nome){
    this.nome = nome; }

  public String getlogradouro(){
    return this.logradouro; }
  
  public void setlogradouro(String logradouro){
    this.logradouro = logradouro; }
  
  public String gettelefone(){
    return this.telefone; }
  
  public void settelefone(String telefone){
    this.telefone = telefone; }
  
  public void dados(){
    System.out.println("Nome: " + nome + ". Logradouro: " + logradouro + ". Telefone: " + telefone);
  }

  //nome

  //endereço

  //telefone 
}