package projeto_final_bloco_01.model;

public class Jogo extends Produto{
	private String produtora;
	
	public Jogo(int numero, int tipo, int qntEstoque, double preco, String nome, String marca) {
		super(numero, tipo, qntEstoque, preco, nome);
		this.produtora = marca;
	}


	@Override
	public void vizualizar() {
		super.vizualizar();
		System.out.println("Produtora:      " + this.produtora);
	}
	
	
	//Getter e Setter
	public String getMarca() {
		return produtora;
	}

	public void setMarca(String marca) {
		this.produtora = marca;
	}

}
