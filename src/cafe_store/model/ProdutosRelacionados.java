package cafe_store.model;

public class ProdutosRelacionados extends Produto{
	private String material;

	public ProdutosRelacionados(int numero, int tipo,String nome, float preco, String material) {
		super(nome,numero, tipo, preco);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Material: " + material);
	}
	
}
