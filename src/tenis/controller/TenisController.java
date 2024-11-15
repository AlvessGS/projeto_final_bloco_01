package tenis.controller;

import java.util.ArrayList;

import tenis.model.Tenis;
import tenis.repository.TenisRepository;

public class TenisController implements TenisRepository {
	
	private ArrayList<Tenis> listaTenis = new ArrayList<Tenis>();
	int numero=0;

	@Override
	public void procurarPorNumero(int numero) {
		
	}

	@Override
	public void listarTodas() {
		for (var tenis : listaTenis) {
			tenis.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Tenis tenis) {
		listaTenis.add(tenis);
		System.out.println("\nA tênis número: "+tenis.getNumero()+" foi cadastrado com sucesso");
		
	}

	@Override
	public void atualizar(Tenis tenis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
}
