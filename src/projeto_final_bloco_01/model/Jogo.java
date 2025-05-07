package projeto_final_bloco_01.model;

public class Jogo extends Produto{
	private String produtora;
	
	public Jogo(int numero, int tipo, int qntEstoque, double preco, String nome, String produtora) {
		super(numero, tipo, qntEstoque, preco, nome);
		this.produtora = produtora;
	}


	@Override
	public void vizualizar() {
		super.vizualizar();
		System.out.println("Produtora:      " + this.produtora);
	}
	
	
	//Getter e Setter
	public String getProdutora() {
	    return produtora;
	}

	public void setProdutora(String produtora) {
	    this.produtora = produtora;
	}

}
