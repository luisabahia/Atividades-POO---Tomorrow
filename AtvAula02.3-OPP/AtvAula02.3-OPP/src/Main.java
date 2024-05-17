public class Main {
    public static void main(String[] args) {
        Produto produtoPadrao = new Produto();
        Produto camiseta = new Produto("Camiseta", 17.00, 70);

        System.out.println("Dados do Produto");
        produtoPadrao.exibirInfo();
        camiseta.exibirInfo();
    }
}
