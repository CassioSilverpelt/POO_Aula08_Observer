package entity;

import java.util.ArrayList;
import java.util.List;

public class GestaoVendas implements PublicadorVendas{
	
	private List<InteressadoEmVendas> lista = new ArrayList<>();

	@Override
	public void adicionar(InteressadoEmVendas i) {
		lista.add(i);
	}

	@Override
	public void remover(InteressadoEmVendas i) {
		lista.remove(i);
	}

	@Override
	public void avisarInteressados(Produto p) {
		for (InteressadoEmVendas i : lista) {
			i.produtoVendido(p);
		}
	}

	public void fazerVenda(Produto p) {
		System.out.printf("Eba, conseguimos vender %s por R$%7.2f %n",p.getNome(), p.getPreco());
		avisarInteressados(p);
	}
	
}
