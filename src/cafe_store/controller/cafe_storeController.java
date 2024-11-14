package cafe_store.controller;

import java.util.ArrayList;

import cafe_store.model.Produto;
import cafe_store.repository.Cafe_storeRepository;

public class cafe_storeController implements Cafe_storeRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto " + produto.getNome() + " foi cadastrado com sucesso!");

	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollection(numero);
		if(produto != null) {
			produto.visualizar();
		}else
			System.out.println("O produto numero: " + numero + " não foi encontrado!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getNumero());
		if(buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto " + produto.getNome() + " foi atualizado com sucesso!");
		}else {
			System.out.println("\nO produto " + produto.getNome() + " não foi encontrado!");
		}

	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);
		if(produto != null) {
			if(listaProdutos.remove(produto) == true);
			System.out.println("\nO produto " + produto.getNome() + " foi removido!");
		}else
			System.out.println("\nO produto" + produto.getNome() + " não foi encontrado");
	}

	public int gerarNumero() {
		return ++numero;
	}
	public Produto buscarNaCollection(int numero) {
		for(var produto : listaProdutos) {
			if(produto.getNumero() == numero) {
				return produto;
			}
		}
		return null;
	}

}
