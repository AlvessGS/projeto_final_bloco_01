package tenis.model;

public class chuteira extends Tenis {
	
	 int tipo;

	public chuteira(int tamanho, String cor, int estoque, String marca, float valor, int tipo) {
		super(tamanho, cor, estoque, marca, valor);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar () {
		String tipo = "";
		
		switch (this.tipo) {
		case 1:
			tipo = "Society";
			break;
		case 2:
			tipo = "Campo";
			break;
		}
		
			super.visualizar();
			System.out.println("Tipo de chuteira: "+tipo);
		
	}
}
