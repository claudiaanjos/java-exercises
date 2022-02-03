import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        int numero, horasTrabalhadas;
        double valorPorHora, salario;

        numero = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorPorHora = teclado.nextDouble();
        
        salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        teclado.close();
    }
}
