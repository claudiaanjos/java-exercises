import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
        int horaInicial = teclado.nextInt();
        int horaFinal = teclado.nextInt();
        
        if (horaInicial > horaFinal) { 
        	System.out.println("O JOGO DUROU " + (24 - (horaInicial - horaFinal)) + " HORA(S)");
        } else if (horaFinal > horaInicial) {
        	System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
        } else {
        	System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    
    }
    
}
