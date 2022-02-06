import java.util.Scanner;

public class Main{
	
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
      
        double salario = teclado.nextDouble();
        double imposto;
      
        if (salario >= 0 && salario <= 2000) {
        	System.out.println("Isento");
        } else if (salario > 2000 && salario <= 3000) {
          imposto = (salario - 2000) * 0.08;
        	System.out.printf("R$ %.2f\n",imposto);
        } else if (salario > 3000 && salario <= 4500) {
          imposto = ((salario - 3000)  * 0.18) + 80;
        	System.out.printf("R$ %.2f\n",imposto);
        } else {
        	System.out.printf(String.format("R$ %.2f\n", ((salario - 4500) * 0.28) + 350));
        }
      
      teclado.close();
      
      }
	
}
