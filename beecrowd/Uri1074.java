import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int n=teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
    		int x = teclado.nextInt();
    		if (x == 0) System.out.println("NULL");
    		else if (x % 2 == 0 && x > 0) System.out.println("EVEN POSITIVE");
    		else if (x % 2 == 0 && x < 0) System.out.println("EVEN NEGATIVE");
    		else if (x % 2 != 0 && x > 0) System.out.println("ODD POSITIVE");
    		else if (x % 2 != 0 && x < 0) System.out.println("ODD NEGATIVE");
    	}
        
        teclado.close();
    }
}
