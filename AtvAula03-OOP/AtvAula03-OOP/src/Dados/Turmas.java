package Dados;
public public class Turmas {
    String codigoTurma;
    String disciplina;
  
    public Turmas() {
      this.codigoTurma = "Nao identificado";
      this.disciplina = "Nao identificada";
    }
  
    public Turmas(String codigoTurma, String disciplina) {
      this.codigoTurma = codigoTurma;
      this.disciplina = disciplina;
    }
  
    public void setCodigoTurma(String codigoTurma) {
      this.codigoTurma = codigoTurma;
    }
  
    public String getCodigoTurma() {
      return codigoTurma;
    }
  
    public void setDisciplina(String disciplina){
      this.disciplina = disciplina;
        }
    public String getDisciplina(){
      return disciplina;
    }
  
    
}
