import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double N;

        int cedulaN, moedaN;

        int q100,q50,q20, q10, q5, q2, q1;
        int q050, q025, q010, q005, q001;
        int resto;

        // entrada
        N = teclado.nextDouble();

        // processamento
        cedulaN = (int)N;
        //System.out.println("TESTE --- valor original = "+N);
        //System.out.println("TESTE --- parte inteira dele = "+cedulaN);

        double centavos = N - cedulaN;
        //System.out.println("TESTE --- centavos que sobraram = "+centavos);

        moedaN = (int)(centavos * 100);

        //System.out.println("TESTE --- os centavos agora em inteiro = "+moedaN);

        // 1a coisa - separar a parte inteira da parte decimal
        q100    = cedulaN / 100;
        resto   = cedulaN % 100;

        q50     = resto / 50;
        resto   = resto % 50;

        q20     = resto / 20;
        resto   = resto % 20;

        q10     = resto / 10;
        resto   = resto % 10;    // equivale a resto %= 10;

        q5      = resto / 5;
        resto   = resto % 5;

        q2      = resto / 2;
        q1      = resto % 2;

        q050    = moedaN / 50;
        resto   = moedaN % 50;

        q025    = resto / 25;
        resto   = resto % 25;

        q010    = resto / 10;
        resto   = resto % 10;

        q005    = resto / 5;
        q001    = resto % 5;

        // saída
        System.out.println("NOTAS:");
        System.out.println(q100 + " nota(s) de R$ 100.00");
        System.out.println(q50 + " nota(s) de R$ 50.00");
        System.out.println(q20 + " nota(s) de R$ 20.00");
        System.out.println(q10 + " nota(s) de R$ 10.00");
        System.out.println(q5 + " nota(s) de R$ 5.00");
        System.out.println(q2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(q1 + " moeda(s) de R$ 1.00");
        System.out.println(q050 + " moeda(s) de R$ 0.50");
        System.out.println(q025 + " moeda(s) de R$ 0.25");
        System.out.println(q010 + " moeda(s) de R$ 0.10");
        System.out.println(q005 + " moeda(s) de R$ 0.05");
        System.out.println(q001 + " moeda(s) de R$ 0.01");
        teclado.close();
    }
}
