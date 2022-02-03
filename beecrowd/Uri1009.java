import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        double salario, totalVendas, total;
        
        nome = teclado.nextLine();
        salario = teclado.nextDouble();
        totalVendas = teclado.nextDouble();
        
        total = (totalVendas * 0.15) + salario;
        
        System.out.printf("TOTAL = R$ %.2f\n", total);
        
        teclado.close();
        
    }
}
