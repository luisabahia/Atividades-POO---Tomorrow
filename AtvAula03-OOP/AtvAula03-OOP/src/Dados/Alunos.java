package Dados;
public class Alunos{
    String nome;
    int matricula;
    String dataNascimento;
  
  public Alunos()
    {
      this.nome = "Não informado";
      this.matricula = 0;
      this.dataNascimento = "Não informado";
    }
  public Alunos(String nome, int matricula, String dataNascimento){
    this.nome = nome;
    this.matricula = matricula;
    this.dataNascimento = dataNascimento;
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }
  
  public void setMatricula(int matricula){
    this.matricula = matricula;
    
  }
  
  public int getMatricula(){
    return matricula;
  }
  
  public void setDataNascimento(String dataNascimento)
    {
      this.dataNascimento = dataNascimento;
    }
  public String getDataNascimento(){
    return this.dataNascimento;
  }
    
  }