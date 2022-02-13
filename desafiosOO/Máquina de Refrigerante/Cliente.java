package br.com.isidrocorp.MaquinaRefrigerante;

import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		MaquinaDeRefri m = new MaquinaDeRefri();
		
		int opcao; 
		double valor;
		
		do {
			System.out.println("=======================================");
			System.out.println("   M A Q U I N A   D E    R E F R I");
			System.out.println("=======================================");
			System.out.println(" 100 - Inserir Credito");
			System.out.println(" 101 - Solicitar Troco");
			System.out.println("  -1 - Sair");
			System.out.println(" Escolha seu Refri ");
			System.out.println(m.exibirDisplay());
			System.out.println(" CREDITO = R$ "+m.getCredito());
			opcao = teclado.nextInt();
			switch(opcao) {
			case 100:
				System.out.println("Digite o credito a inserir");
				valor = teclado.nextDouble();
				m.adicionarCredito(valor);
				break;
			case 101:
				System.out.println("Seu troco = R$ "+m.solicitarTroco());
				break;
			case -1:
				System.out.println("Ate mais");
				break;
			case 0: case 1: case 2: case 3: case 4:
				int resultado = m.comprar(opcao);
				if (resultado == 0) {
					System.out.println("Aproveite seu Refri!");
				}
				else if (resultado == -1) {
					System.out.println("Credito insuficiente");
				}
				else {
					System.out.println("Desculpe, estoque finalizado");
				}
				break;
			default: 
				System.out.println("Opcao Invalida");
			}
			
		} while (opcao != -1);
	}
	
	

}

