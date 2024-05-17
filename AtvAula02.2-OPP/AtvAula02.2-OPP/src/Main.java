import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a base do triangulo:");
    int base = scanner.nextInt();

    System.out.print("Digite a altura do triangulo:");
    int altura = scanner.nextInt();

    Triangulo triangulo = new Triangulo();

    triangulo.setBase(base);
    triangulo.setAltura(altura);

    System.out.println("Área do triangulo: " + triangulo.calculoArea());

    scanner.close();

  }

}