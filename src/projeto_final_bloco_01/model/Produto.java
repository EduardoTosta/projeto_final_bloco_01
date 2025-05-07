package projeto_final_bloco_01.model;

import java.text.NumberFormat;

public abstract class Produto {
	//Atributos 
	private int numero;
	private int tipo;
	private int qntEstoque;
	private double preco;
	private String nome;
	
	
	//Metodo Construtor
	public Produto(int numero, int tipo,int qntEstoque, double preco, String nome) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.qntEstoque = qntEstoque;
		this.preco = preco;
		this.nome = nome;
	}
	
	
	//Metodos de impressão
	public void vizualizar() {
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		String tipo = "";
		
		switch(this.tipo) {
			case 1 -> tipo = "Console";
			case 2 -> tipo = "Jogo";
			default -> tipo = "Inválido";
		}
		System.out.println("**************************************************");
		System.out.println("                 DADOS DO PRODUTO                 ");
		System.out.println("**************************************************");
		System.out.println("Codigo do Produto:      " + this.numero);
		System.out.println("Nome do Produto:    " + this.nome);
		System.out.println("Tipo do produto:        " + tipo);
		System.out.println("Quantidade em estoque:    " + this.qntEstoque);
		System.out.println("Preço:       " + nfMoeda.format(this.preco));
	}
	
	//Getters e Setters
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQntEstoque() {
		return qntEstoque;
	}
	public void setQntEstoque(int qntEstoque) {
		this.qntEstoque = qntEstoque;
	}
	
}
