package cafe_store.model;

public abstract class Produto {
	private String nome;
	private int numero, tipo;
	private float preco;

	public Produto(String nome, int numero, int tipo, float preco) {
		this.nome = nome;
		this.numero = numero;
		this.tipo = tipo;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome do Produto: " + this.nome);
		System.out.println("Número do Produto: " + this.numero);
		System.out.println("Preço: " + this.preco);
	}

}
