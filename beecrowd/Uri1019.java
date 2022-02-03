import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int tempo, horas, minutos, segundos;
        
        tempo = teclado.nextInt();
        
        horas = tempo / 3600;
		minutos = (tempo % 3600) / 60;
		segundos = (tempo % 3600) % 60;
        
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        teclado.close();
    }
}
