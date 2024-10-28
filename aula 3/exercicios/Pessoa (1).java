class Pessoa{
  private String nome;
  private int idade;
  private String cpf;

  public Pessoa(String nome, int idade , String cpf){
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
  }

  //Sobreescrevendo o metodo  Equals
  @Override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Pessoa outraPessoa = (Pessoa) obj;
    return cpf == outraPessoa.cpf;
    
  }
}