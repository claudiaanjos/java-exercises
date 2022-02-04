import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        
        for (int i = 0; i <= valor; i++) {
          if (i % 2 == 1) {
              System.out.println(i);
            }
        }
        
        teclado.close();
    }
}
