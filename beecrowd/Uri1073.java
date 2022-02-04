import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        
        int valor=teclado.nextInt();
        
        for(int cont=2; cont<=valor; cont+=2){
            System.out.println(cont+"^2 = "+cont*cont);
        }
        
        teclado.close();
    }
}
