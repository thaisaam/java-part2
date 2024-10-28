
public class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("João", 25, "12345678900");
    Pessoa pessoa2 = new Pessoa("Marta", 30,"98765432100");
    Pessoa pessoa3 = new Pessoa("João", 25,"12345678900");

    System.out.println("A pessoa1 e igual a pessoa2? " + pessoa1.equals(pessoa2));
    System.out.println("A pessoa1 e igual a pessoa3? " + pessoa1.equals(pessoa3));
    

    
  }

  
}