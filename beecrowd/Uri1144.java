import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        int valor = teclado.nextInt(); 
        int cont=1;
        
        for(int i=0; i<valor; i++){
            System.out.println(cont+" "+cont*cont+" "+cont*cont*cont);
            int a = (cont*cont)+1;
            int b = (cont*cont*cont)+1;
            System.out.println(cont+" "+a+" "+b);
            cont++;
        }
        
        teclado.close();
    }
}
