import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valor;
        int par=0;
        int impar=0;
        int positivo=0;
        int negativo=0;
        
        for(int cont=1; cont<=5; cont++){
            valor = teclado.nextInt();

            if(valor%2==0){
                par++;
            }
            else {
                impar++;
            }
            if(valor>0){
                positivo++;
            }
            else if (valor<0){
                negativo++;
            }
        }

        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(positivo+" valor(es) positivo(s)");
        System.out.println(negativo+" valor(es) negativo(s)");

    }
        
}
