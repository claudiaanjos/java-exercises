import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado =new Scanner(System.in);

        float valor, media;
        int   qtdePositivos=0;
        float somaPositivos=0;

        for (int cont=1; cont<=6; cont++){
            valor = teclado.nextFloat();
            if (valor > 0){
                qtdePositivos++;
                somaPositivos += valor;
            }
        }
        
        media=somaPositivos/qtdePositivos;

        System.out.println(qtdePositivos+ " valores positivos");
        System.out.printf("%.1f\n", media);
        teclado.close();
    }
}
