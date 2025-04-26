package entity;

public interface Publicadora {

	void adicionar(Assinantes a);
	void remover(Assinantes a);
	void avisarPublicacao(String s);
	
}
