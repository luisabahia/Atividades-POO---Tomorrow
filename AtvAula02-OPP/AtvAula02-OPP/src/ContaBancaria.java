public class ContaBancaria{
    private String titular;
    private float saldo;
    private int numeroconta;
  
  //construtor padrao
  public ContaBancaria(){
      this.titular = "Indefinido";
      this.saldo = 0;
      this.numeroconta = 0;}
  
  //construtor sobrecarregado
  public ContaBancaria(String titular, float saldo, int numeroconta){
    this.titular = titular;
    this.saldo = saldo;
    this.numeroconta = numeroconta;
  }
  
  public void setSaldo (float saldo)
    {
      this.saldo = saldo;
    }
  
  public void Saque(float s){
    if (saldo >= s){
      saldo = saldo - s;
      }
    else {
      System.out.println("Saldo insuficiente para realizar o saque.");
    }
  }
  
  public void Deposito(float d){
    saldo = saldo + d;
  }
  
  public float getSaldo(){
     return saldo;
     }
  
  public void setTitular(String titular)
    {
      this.titular = titular;
    }
  
  public String getTitular(){
    return titular;
  
  }
  
  public void setNumeroConta(int numeroconta)
      {
        this.numeroconta = numeroconta;
      }
  
    public int getNumeroConta(){
      return numeroconta;
  
    }
  
    public void exibirInfo() {
      System.out.println("Titular: " + titular);
      System.out.println("Saldo: " + saldo);
      System.out.println("Numero da conta: " + numeroconta);
    }
  
  
  }
