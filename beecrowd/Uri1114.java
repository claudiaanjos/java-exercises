import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int senha=2002;
        int leitura=teclado.nextInt();
        
        while(leitura!=senha){
            System.out.println("Senha Invalida");
            leitura=teclado.nextInt();
        }
        
        System.out.println("Acesso Permitido");
        
        teclado.close();
    }
}
