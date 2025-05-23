package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{

	//Criar collection array list
		private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		//Variável para controlar o numero das contas
		int numero = 0;
	
		
	//Metodos CRUD
	@Override
	public void procurarPorNumero(int numero) {
		Optional<Produto> produto = buscarNaCollection(numero);
		
		if(produto.isPresent())
			produto.get().vizualizar();
		else
			System.out.printf("\n O produto numero: %d não foi encontrado!", numero);
	}

	@Override
	public void listarTodas() {
		for(var produto : listaProdutos) {
			produto.vizualizar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O produto foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
	    Optional<Produto> busca = buscarNaCollection(produto.getNumero());

	    if (busca.isPresent()) {
	        int index = listaProdutos.indexOf(busca.get());
	        listaProdutos.set(index, produto);
	        System.out.println("Produto atualizado com sucesso!");
	    } else {
	        System.out.println("Produto não encontrado.");
	    }
	}


	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);
		
		if(produto.isPresent()) {
			listaProdutos.remove(produto.get());
			System.out.println("Produto removido com sucesso");
		}else
			System.out.println("O produto não foi encontrado");	
	}

	@Override
	public void listarPorTipo(int tipo) {
		List<Produto> listaTipo = listaProdutos.stream()
				.filter(p -> p.getTipo() == tipo)
				.collect(Collectors.toList());
		
		if(listaTipo.isEmpty())
			System.out.printf("\nNenhum produto foi encontrado com base no critério %d\n", tipo);
		
		for(var produto:listaTipo)
			produto.vizualizar();
	}
	

	//Metodos Produto
	@Override
	public void comprar(int numero, int quantidade) {
	    Optional<Produto> produto = buscarNaCollection(numero);
	    if (produto.isPresent()) {
	        produto.get().comprar(quantidade); // ou setQuantidadeAtual
	        System.out.println("Compra realizada com sucesso!");
	    } else {
	        System.out.println("Produto não encontrado para compra.");
	    }
	}

	@Override
	public void vender(int numero, int quantidade) {
	    Optional<Produto> produto = buscarNaCollection(numero);
	    if (produto.isPresent()) {
	        if (produto.get().getQntEstoque() >= quantidade) {
	            produto.get().vender(quantidade); // ou setQuantidadeAtual
	            System.out.println("Venda realizada com sucesso!");
	        } else {
	            System.out.println("Estoque insuficiente para a venda.");
	        }
	    } else {
	        System.out.println("Produto não encontrado para venda.");
	    }
	}

	
	//Metodos auxiliares
	public Optional <Produto> buscarNaCollection(int numero) {
		for(var produto: listaProdutos) {
			if(produto.getNumero() == numero)
				return Optional.of(produto);
		}
		return Optional.empty();
	}

}
