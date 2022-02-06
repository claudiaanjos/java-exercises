import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaI, horaF, minuI, minuF, tempoI, tempoF, tempoT, horaT, minuT;
        horaI = teclado.nextInt();
        minuI = teclado.nextInt();
        horaF = teclado.nextInt();
        minuF = teclado.nextInt();

        // 1a coisa - converter todo mundo pra minutos
        tempoI = horaI * 60 + minuI;
        tempoF = horaF * 60 + minuF;

        tempoT = tempoF - tempoI;

        if (tempoT <= 0){
            tempoT = tempoT + 24*60; // ou 1440
        }

        // desconverto
        horaT = tempoT / 60;
        minuT = tempoT % 60;

        System.out.println("O JOGO DUROU "+horaT+ " HORA(S) E " + minuT+ " MINUTO(S)");

        teclado.close();
    }
}
