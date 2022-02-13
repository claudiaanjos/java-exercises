import java.util.Scanner;

public class SomaDeParesConsecutivos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0;
		
		
		do {
			
			valor = teclado.nextInt();
			
			int soma = 0;
			
			if(valor != 0) {
				if(valor % 2 == 0) {
					soma = valor * 5 + 20;
				} 
				else {
					soma = (valor+1) * 5 + 20;
				}
				
				System.out.println(soma);
			}
			
		} while (valor != 0);
		
		
		teclado.close();
	}
}
