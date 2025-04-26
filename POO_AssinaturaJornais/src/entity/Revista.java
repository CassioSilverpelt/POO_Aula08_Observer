package entity;

import java.util.ArrayList;
import java.util.List;

public class Revista implements Publicadora{

	List<Assinantes> assinantes = new ArrayList<>();
	
	@Override
	public void adicionar(Assinantes a) {
		assinantes.add(a);
	}

	@Override
	public void remover(Assinantes a) {
		assinantes.remove(a);
	}

	@Override
	public void avisarPublicacao(String s) {
		for (Assinantes a : assinantes) {
			a.lerNoticia(s);
		}
	}

	public void publicarNoticia(String s) {
		System.out.println("Estamos publicando a notícia sobre " + s);
		avisarPublicacao(s);
	}
	
}
