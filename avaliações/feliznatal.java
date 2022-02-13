import java.util.Scanner;

public class FelizNatal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int I = teclado.nextInt();
		
		System.out.print("Feliz nat");
		
		for(int cont=0; cont < I; cont++) {
			System.out.print("a");
		}
		
		System.out.print("l!\n");
		
		teclado.close();
	}
}
