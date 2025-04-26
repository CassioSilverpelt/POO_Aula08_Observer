package entity;

public interface PublicadorVendas {

	void adicionar(InteressadoEmVendas i);
	void remover (InteressadoEmVendas i);
	void avisarInteressados (Produto p);
	
}
