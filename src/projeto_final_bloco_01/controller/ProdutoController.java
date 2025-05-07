package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarPorTipo(int tipo) {
		List<Produto> listaTipo = listaProdutos.stream()
				.filter(p -> p.getTipo())
				.collect(Collectors.toList());
		
		if(listaTipo.isEmpty())
		
			System.out.printf("\nNenhuma conta foi encontrada com base no criterio %s" + tipo);
		
		for(var conta:listaTipo)
			produto.vizualizar();
	}
	

	//Metodos Produto
	@Override
	public void comprar(int numero, double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vender(int numero, double valor) {
		// TODO Auto-generated method stub
		
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
