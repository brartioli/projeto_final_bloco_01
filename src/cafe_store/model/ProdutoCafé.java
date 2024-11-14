package cafe_store.model;

public class ProdutoCafé extends Produto {

	private String produtor;
	private String origem;

	public ProdutoCafé(int numero, String nome, float preco, String produtor, String origem) {
		super(nome, numero, preco);
		this.produtor = produtor;
		this.origem = origem;
	}

	public String getProdutor() {
		return produtor;
	}

	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public void visualizar() {
		super.visualizar();
        System.out.println("Produtor: " + produtor);
        System.out.println("Origem: " + origem);
	}
	
	

}
