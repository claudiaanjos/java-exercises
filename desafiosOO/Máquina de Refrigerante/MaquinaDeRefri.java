package br.com.isidrocorp.MaquinaRefrigerante;

public class MaquinaDeRefri {
	private double credito;
	private Refrigerante lista[];
	
	public MaquinaDeRefri() {
		this.credito = 0.0;
		this.lista = new Refrigerante[5];
		this.lista[0] = new Refrigerante("Coca Cola", 3.50, 5);
		this.lista[1] = new Refrigerante("Fanta", 1.50, 5);
		this.lista[2] = new Refrigerante("Sprite", 2.00, 5);
		this.lista[3] = new Refrigerante("Confiança", 1.00, 2);
		this.lista[4] = new Refrigerante("Antardega", 2.50, 2);
	}
	
	public void adicionarCredito(double valor) {
		this.credito += valor;
	}
	
	public double solicitarTroco() {
		double troco = this.credito;
		this.credito = 0.0;
		return troco;
	}
	
	// 0 - deu certo / -1 falta credito / -2 falta estoque
	public int comprar(int num) {
		// tem credito?
		if (this.credito >= this.lista[num].getPreco()) {
			if (this.lista[num].getQtde() > 0 ) {
				this.credito -= this.lista[num].getPreco(); // diminuí meu crédito
				int qtd = this.lista[num].getQtde() - 1;
				this.lista[num].setQtde(qtd);
				return 0; // deu bom - pode degustar seu refri merecido
			}
			else {
				return -2; // faltou estoque
			}
		}
		else {
			return -1; // faltou crédito
		}
	}
	
	public String exibirDisplay() {
		String msg="";
		for (Refrigerante r: lista) {
			msg = msg + r.getNome() + " R$ "+r.getPreco()+"\n";
		}
		return msg;
	}
	
	public double getCredito() {
		return this.credito;
	}
	
}
