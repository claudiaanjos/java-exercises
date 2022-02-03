import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int idadeDias, ano, mes, dia;
        
        idadeDias = teclado.nextInt();
        
        ano = idadeDias / 365;
        mes = (idadeDias % 365) / 30;
        dia = (idadeDias % 365) % 30; 
        
        
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        
        teclado.close();
    }
}
