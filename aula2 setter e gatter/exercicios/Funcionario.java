public class Funcionario{
  private String nome;
  private int idade;
  private int salario;

// getter para nome
  public String getNome(){
    return this.nome;
  }
// setter para nome
  public void setNome(String nome){
    this.nome = nome;
  }
  //Getter para idade
  public int getIdade(){
    return this.idade;
  }
//Setter para idade
  public void setIdade(int idade){
    this.idade = idade;
  }
  //Getter para salario
  public int getSalario(){
    return salario;
  }
  //Setter para salario
  public void setSalario(int salario){
    this.salario = salario;
  }
}