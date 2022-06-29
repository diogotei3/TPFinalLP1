import java.util.Scanner;

/*
 * @author Rian Gustavo Quintanilha de Aquino e Diogo Santos Teixeira
 */

public class Hora {
    private int hora;
    private int min;
    private int seg;
    
    Scanner in = new Scanner(System.in);
    Hora() {        
        System.out.println("    * Criando um novo horário...");
        this.setHora();
        this.setMin();
        this.setSeg();
    }
    
    Hora(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public void setHora() {
        int aux;
        try {
            System.out.print("    = Digite a hora: ");

            aux = in.nextInt();
            if(aux < 0 || aux > 23){
                throw new Exception("    x Hora inválida");
            }
            
            this.setHora(aux);
        } catch (Exception  err) {
            System.out.println(err.getMessage());
            this.setHora();
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
    
    public void setMin() {
        int aux;
        try {
            System.out.print("    = Digite os minutos: ");

            aux = in.nextInt();
            if(aux < 0 || aux > 59){
                throw new Exception("    x Minútos inválidos");
            }
            
            this.setMin(aux);
        } catch (Exception  err) {
            System.out.println(err.getMessage());
            this.setMin();
        }
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
    
    public void setSeg() {
        int aux;
        try {
            System.out.print("    = Digite os segundos: ");

            aux = in.nextInt();
            if(aux < 0 || aux > 59){
                throw new Exception("    x Segundos inválidos");
            }
            
            this.setSeg(aux);
        } catch (Exception  err) {
            System.out.println(err.getMessage());
            this.setSeg();
        }
    }
    
    //
    public String getHora1() {
        String hora = String.format("%02d", this.getHora());
        String min = String.format("%02d", this.getMin());
        String seg = String.format("%02d", this.getSeg());
        
        return String.join(":", hora, min, seg);
    }
    
    public String getHora2() {
        
        int aux = this.getHora();
        String sufix = "am";
        
        if(this.getHora() > 11) {
            aux -= 12;
            sufix = "pm";
        }
       
        String hora = String.format("%02d", aux);
        String min = String.format("%02d", this.getMin());
        String seg = String.format("%02d", this.getSeg());
        
        return String.join(":", hora, min, seg) + sufix;
    }
    
    public int getSegundos() {
        int hMin = this.getHora() * 60;
        int mSeg = (hMin + this.getMin()) * 60;
        int totalSegundos = mSeg + this.getSeg();
        
        return totalSegundos;
    }
}