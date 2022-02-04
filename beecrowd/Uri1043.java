import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double A, B, C, p, area;
        
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        
        if ((A < B + C) && (B < A + C) && (C < B + A)) {
            p = A + B + C;
            System.out.printf("Perimetro = %.1f\n", p);
        } else {
            area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
        
        teclado.close();
    }
}
