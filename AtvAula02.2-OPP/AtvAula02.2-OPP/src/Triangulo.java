class Triangulo{
    private int base;
    private int altura;
  
  //construtor padrao
    public Triangulo(){
      this.altura = 0;
      this.base = 0;  
      }
  
  
  //construtor sobrecarregado
  public Triangulo(int base, int altura){
    this.altura = altura;
    this.base = base;  
    }
    public int getBase(){
      return base;
    }
    public void setBase(int base){
      this.base = base;
    }
    public int getAltura(){
      return altura;
    }
    public void setAltura(int altura){
      this.altura = altura;
    }
  public int calculoArea(){
    return (base*altura)/2;
  }
   
    }