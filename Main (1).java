
public class Main {
  public static void main(String[] args) {
    Pessoa P1 = new Pessoa("Tiago","para","555-1234");
    P1.dados();
    Pessoa P2 = new Pessoa();
    P2.dados();

    Fornecedor F1 = new Fornecedor("Roger","Rua","555-4321",1000,500);
    F1.obterSaldo();

    Empregado E1 = new Empregado("Ze mane","clodoaldo","555-4321",1,1000,55);
    E1.calcularsalario();

    Administrador A1 = new Administrador("ZECA","Catapimbas","555-8574",4,1000,10,50);
    A1.calcularsalario();

    Operario O1 = new Operario("Papai noel","polo norte","0800 25252525",2,20000,5000,0.8,2);
    O1.calcularsalario();

    Vendededor V1 = new Vendedor("Madmax","Deserto da desolação","666-0512",1,1000,85,0.5,2);
    }
  }


    
