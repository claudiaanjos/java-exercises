import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        int valor = teclado.nextInt(); 
        int cont=0;
        
        for (int i=0; i<valor; i++){
            System.out.printf("%d %d %d PUM\n", ++cont, ++cont, ++cont);
            cont++;
        }
        
        teclado.close();
    }
}
