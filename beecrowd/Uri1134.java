import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int codigo=0;
        int gasolina=0;
        int alcool=0;
        int diesel=0;
        
        while(codigo != 4){
            codigo = teclado.nextInt();
            if(codigo<1 || codigo>4){
                codigo = teclado.nextInt();
            }
            switch(codigo){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
        
        teclado.close();
    }
}
