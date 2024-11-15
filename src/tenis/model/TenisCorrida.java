package tenis.model;

public class TenisCorrida extends Tenis {
	
	private float peso;

	public TenisCorrida(int numero, int tamanho, String cor, int estoque, String marca, float valor, float peso) {
		super(numero, tamanho, cor, estoque, marca, valor);
		this.peso = peso;
		
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Peso do tênis: "+this.peso+"g");
	}
	
}
