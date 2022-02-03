import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d, diferenca;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " + diferenca);

        teclado.close();
    }
}
