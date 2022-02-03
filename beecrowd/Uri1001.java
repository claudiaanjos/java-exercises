import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        int A,B,X;

        A = teclado.nextInt();
        B = teclado.nextInt();

        X = A + B;

        System.out.println("X = " + X);
        teclado.close();
    }
}
