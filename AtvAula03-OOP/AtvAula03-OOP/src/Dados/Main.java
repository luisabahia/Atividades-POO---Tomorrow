package Dados;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  private static int maximo = 3;

  public static void registroAlunos(Alunos[] aluno, int qtdAluno) {
    Scanner scanner = new Scanner(System.in);

    aluno[qtdAluno] = new Alunos();
    System.out.println("Digite o nome do aluno: ");
    aluno[qtdAluno].nome = scanner.nextLine();

    System.out.println("Digite o numero de matricula: ");
    aluno[qtdAluno].matricula = scanner.nextInt();

    System.out.println("Digite a data de nascimento (dd/mm/aaaa): ");
    aluno[qtdAluno].dataNascimento = scanner.nextLine();

    scanner.close();
}

public static void registroTurma(Turmas[] turma, int qtdTurma) {
  Scanner scanner = new Scanner(System.in);

  turma[qtdTurma] = new Turmas();

  System.out.println("Digite o codigo da turma: ");
  turma[qtdTurma].codigoTurma = scanner.nextLine();

  System.out.println("Digite o nome da disciplina: ");
  turma[qtdTurma].disciplina = scanner.nextLine();

  scanner.close();
}
public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  System.out.print("O que deseja realizar?")
  System.out.print("Opções (1- Registrar um aluno, 2-Registrar uma turma, 3-Registrar dia-aula, 4- Registrar uma nota, 5- Registrar uma frequencia, 6-Identificar alunos presentes dado dia-aula e turma, 7-Identificar presenças e faltas dado um aluno e uma turma, 8-Ver nota, dado aluno e turma, 9- Listar alunos inscritos na turma, 10- Listar as turmas, 11-Listar total de faltas e presenças dado aluno, 12-Listar notas por aluno dado turma, 13-Sair);");
  int Opções= scanner.nextInt();

  switch (Opções) {
    case 1:
      
      break;
  
    default:
      break;
  }
  //fazer registro de frequencias
  //fazer registro de notas
}