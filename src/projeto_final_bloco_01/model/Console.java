package projeto_final_bloco_01.model;

public class Console extends Produto{
	private String marca;
	
	public Console(int numero, int tipo, int qntEstoque, double preco, String nome, String marca) {
		super(numero, tipo, qntEstoque, preco, nome);
		this.marca = marca;
	}


	@Override
	public void vizualizar() {
		super.vizualizar();
		System.out.println("Marca:      " + this.marca);
	}
	
	
	//Getter e Setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
