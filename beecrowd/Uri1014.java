import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int distancia;
        double gasto, consumo;
        
        distancia = teclado.nextInt();
        gasto = teclado.nextDouble();
        
        consumo = distancia/gasto;
        
        System.out.printf("%.3f km/l\n", consumo);
        
        teclado.close();
    }
}
