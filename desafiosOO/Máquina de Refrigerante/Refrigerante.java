ackage br.com.isidrocorp.MaquinaRefrigerante;

public class Refrigerante {
	private String nome;
	private double preco;
	private int    qtde;
	
	public Refrigerante(String nome, double preco, int qtde) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
		
}

