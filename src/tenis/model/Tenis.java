package tenis.model;

public abstract class Tenis  {
	
	private int numero;
	private int tamanho;
	private String cor;
	private int estoque;
	private String marca;
	private float valor;
	
	public Tenis(int numero, int tamanho, String cor, int estoque, String marca, float valor) {	
		this.numero = numero;
		this.tamanho = tamanho;
		this.cor = cor;
		this.estoque = estoque;
		this.marca = marca;
		this.valor = valor;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int conta) {
		this.numero = conta;
	
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		
		if(this.estoque==0) {
			System.out.println("Tênis indisponível no estoque!");
		}else {
		
		System.out.println("Tamanho do tênis: "+this.tamanho);
		System.out.println("cor do tênis: "+this.cor);
		System.out.println("Quantidade no estoque: "+this.estoque);
		System.out.println("Marca: "+this.marca);
		System.out.println("valor do tênis: R$ "+this.valor);
		}
	}
}
