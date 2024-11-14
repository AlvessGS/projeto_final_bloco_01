package tenis.repository;

import tenis.model.Tenis;

public interface TenisRepository {
	
	//CRUD
	public void procurarPorNumero(int numero);
	public void listarTodas ();
	public void cadastrar(Tenis tenis);
	public void  atualizar(Tenis tenis);
	public void deletar (int numero);
	
	//Métodos de compra
	public void pagar();
}
