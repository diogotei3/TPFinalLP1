import java.util.Scanner;

class AmostraTemperatura {
  private int numseq;
  private Data data;
  private Hora hora;
  private float valor;
  
  Scanner in = new Scanner(System.in);
  
  //
  AmostraTemperatura() {
    System.out.println("  * Criando nova amostra:");
    this.setData();
    
    System.out.println("");
    this.setHora();
    
    System.out.println("");
    this.setValor();
  };
  
  AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v) {
    this.setData(a, b, c);
    this.setHora(d, e, f);
    this.setValor(v);
  };
  
  AmostraTemperatura(Data d, Hora h, float v) {
    this.data = d;
    this.hora = h;
    this.setValor(v);
  };
  
  //
  public void setData() {
    this.data = new Data();
  }
  
  public void setHora() {
    this.hora = new Hora();
  }
  
  public void setValor() {
  	float aux;
      try {
        System.out.print("    = Digite a temperatura: ");

        aux = in.nextFloat();
        
        this.valor = aux;
        this.numseq++;
      } catch (Exception  err) {
        System.out.println(err.getMessage());
        this.setValor();
      }
  }
  
  //
  public void setData(int a, int b, int c) {
    this.data = new Data(a, b, c);
  }
  
  public void setHora(int d, int e, int f) {
    this.hora = new Hora(d, e, f);
  }
  
  public void setValor(float v) {
    this.valor = v;
    this.numseq++;
  }
  
  //
  public int getNumSeq() {
    return this.numseq;
  }
  
  public String getData() {
    return this.data.getData1();
  }
  
  public String getHora() {
    return this.hora.getHora1();
  }
  
  public float getValor() {
    return this.valor;
  }
}
