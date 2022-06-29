import java.text.*;
import java.util.*;

/*
 * @author Rian Gustavo Quintanilha de Aquino e Diogo Santos Teixeira
 */

public class Data {

    private int dia;
    private int mes;
    private int ano;
    Scanner scan = new Scanner(System.in);

    Data(){
      System.out.println("    * Criando uma nova data...");

      this.setDia();
      this.setMes();
      this.setAno();
    }
  
    Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }

    public void setDia(int d){
        dia = d;
    }

    public void setMes(int m){
        mes = m;
    }

    public void setAno(int a){
        ano = a;
    }

    public void setDia(){
        do{
            System.out.print("    = Digite o dia: ");
            dia=scan.nextInt();

            if(!(dia>0 && dia<32)){
                System.out.println("    x Dia inválido");
            }
        }while(dia<=0 || dia>=32);
    }

    public void setMes(){
        do{
            System.out.print("    = Digite o mes: ");
            mes=scan.nextInt();

            if(mes<=0 || mes>=13){
                System.out.println("    x Mês inválido");
            }
        }while(mes<=0 || mes>=13);
    }

    public void setAno(){
        do {
            System.out.print("    = Digite o ano: ");
            ano=scan.nextInt();

            if(ano<0 || ano>9999){
                System.out.println("    x Ano inválido (Ex. correto: 2024)");
            }
        } while(ano<0 || ano>9999);
    }

    public int getDia(){
        return dia;
       
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public String getData1(){
      	String dia = String.format("%02d", this.getDia());
        String mes = String.format("%02d", this.getMes());
        String ano = String.format("%04d", this.getAno());
      
        String ret = dia + "/" + mes + "/" + ano.substring(2);
        return ret;
    }

    public String getData2() {
        String text;
        switch (mes) {
            case 1:
                text = "janeiro";
                break;
            case 2:
                text = "fevereiro";
                break;
            case 3:
                text = "março";
                break;
            case 4:
                text = "abril";
                break;
            case 5:
                text = "maio";
                break;
            case 6:
                text = "junho";
                break;
            case 7:
                text = "julho";
                break;
            case 8:
                text = "agosto";
                break;
            case 9:
                text = "setembro";
                break;
            case 10:
                text = "outubro";
                break;
            case 11:
                text = "novembro";
                break;
            case 12:
                text = "dezembro";
                break;
            default:
                text = "InvalidMonth";
                break;
        }
        return dia + "/" + text + "/" + ano;
    }

    public boolean bissexto(){
        boolean bi;
        if (ano % 4 == 0) {
            bi = true;
        }
        else{
            bi = false;
        }
        return bi;
    }

    public int diasTranscorridos(){
        int dias= dia + 31*(mes-1);
        return dias;
    }
    public static void getDataAtual (){
        DateFormat DFormat = DateFormat.getDateInstance();
        System.out.println( "A data atual: " + DFormat.format(new Date()));
    }

}