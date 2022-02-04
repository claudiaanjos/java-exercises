import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int num=teclado.nextInt();
        int contador=0;
        
        while(contador<6){
            if(num%2!=0){
                System.out.println(num);
                contador++;
            }
            num++;
        }
        
        teclado.close();
    }
}
