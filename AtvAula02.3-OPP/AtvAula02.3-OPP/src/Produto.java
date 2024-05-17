public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    //construtor padrão
    public Produto(){
        this.nome = "Indefinido";
        this.preco = 0;
        this.estoque = 0;}

    //construtor sobrecarregado
    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    public void DiminuiEstoque(int qd){
        if(qd <= estoque)
        {
            estoque = estoque - qd;
        }
        else{
            System.out.println("Estamos sem estoque do produto");
        }
    }
    public void AumentaEstoque(int qa){
        estoque = qa + estoque;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;

    }

    public int getEstoque(){
        return estoque;
    }

    public void exibirInfo(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque);
    }
}
