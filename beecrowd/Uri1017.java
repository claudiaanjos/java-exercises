import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int tempo, velocidade;
        double litros;
        
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
        
        litros = (float)(velocidade*tempo)/12;
        
        System.out.printf("%.3f\n", litros);
        
        teclado.close();
    }
}
