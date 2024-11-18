public class Cliente {
  private String nome;
  private String CPF;
  private String endereco;
  private String telefone;

  public Cliente(String nome, String CPF, String endereco, String telefone) {
    this.nome = nome;
    this.CPF = CPF;
    this.endereco = endereco;
    this.telefone = telefone;
  }
   @Override
  public String toString(){
     return "Nome: " + nome + "CPF: " + CPF + "Endereco: " + endereco + "Telefone: " + telefone;


  }
}