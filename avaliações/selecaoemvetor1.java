import java.util.Scanner;

public class SelecaoEmVetorI {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double vetor[] = new double[100];
		double valor;
		
		for(int cont = 0; cont < vetor.length; cont++) {
			valor = teclado.nextDouble();
			if(valor <= 10) {
				vetor[cont] = valor;
				System.out.println("A["+cont+"] = "+valor);
			}
			
		}
		
		teclado.close();
	}
}
