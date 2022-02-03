import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int peca1, numeroPeca1, peca2, numeroPeca2;
        double valorPeca1, valorPeca2, total;
        
        peca1 = teclado.nextInt();
        numeroPeca1 = teclado.nextInt();
        valorPeca1 = teclado.nextDouble();
        System.out.printf("");
        
        peca2 = teclado.nextInt();
        numeroPeca2 = teclado.nextInt();
        valorPeca2 = teclado.nextDouble();
        
        total = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
        teclado.close();
    }
}
