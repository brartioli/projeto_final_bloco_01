package cafe_store.repository;

import cafe_store.model.Produto;

public interface Cafe_storeRepository {
	public void cadastrar(Produto produto);
	public void listarTodos();
	public void procurarPorNumero(int numero);
	public void atualizar(Produto produto);
	public void deletar(int numero);
	
	

}
