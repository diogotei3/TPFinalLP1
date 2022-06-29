
/*
 * @author Rian Gustavo Quintanilha de Aquino e Diogo Santos Teixeira
 */

class Main {
  public static void mostrarTemperatura(String titulo, AmostraTemperatura t) {
    titulo = String.format("%-31s", titulo);
    String n = String.format("%02d", t.getNumSeq());
    String d = t.getData();
    String h = t.getHora();
    float  v = t.getValor();
    
    String dados = n + " | " + d + " | " + h + " | " + v;
    
    System.out.println("    +---------------------------------+");
    System.out.println("    | " + titulo                  + " |");
    System.out.println("    +---------------------------------+");
    System.out.println("    | Nº |   Data   |   Hora   | T C° |");
    System.out.println("    | " +          dados          + " |");
    System.out.println("    +---------------------------------+");
  }
  
  public static void main(String[] args) {
    
    System.out.println("LP1I3 - TRABALHO PRÁTICO FINAL\n");
    System.out.println(" > Criando classe por construtor com parâmetros");
    
    AmostraTemperatura t1;
    t1 = new AmostraTemperatura(1, 1, 1, 1, 1, 1, 30);
    
    mostrarTemperatura("Temperatura N1",t1);
    
    //
    System.out.println("");
    System.out.println(" > Criando classe por construtor sem parâmetros");
    
    AmostraTemperatura t2;
    t2 = new AmostraTemperatura();
    
    mostrarTemperatura("Temperatura N2", t2);
    
    //
    System.out.println("");
    System.out.println(" > Editando a data de Temperatura N1");
    t1.setData();
    
    System.out.println("");
    System.out.println(" > Editando a hora de Temperatura N1");
    t1.setHora();
    
    System.out.println("");
    System.out.println(" > Editando o valor de Temperatura N1");
    t1.setValor();
    
    System.out.println("");
    mostrarTemperatura("Temperatura N1",t1);
  }
}
