import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valor;
        int qtdePares=0;
        
        for(int cont=1; cont<=5; cont++){
            valor = teclado.nextInt();
            if(valor%2==0){
                qtdePares++;
            }
        }
        
        System.out.println(qtdePares+" valores pares");
        teclado.close();
    }
}
