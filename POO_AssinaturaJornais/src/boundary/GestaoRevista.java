package boundary;
import entity.*;

public class GestaoRevista {

	public static void main(String[] args) {
		
		Revista aVerdade = new Revista();
		
		Estudante e1 = new Estudante ("Pedro", "Colégio Pablo Vittar");
		Estudante e2 = new Estudante ("Rodolfo", "Escola da Vida");
		
		Aposentado a1 = new Aposentado ("Afonso","2005");
		Aposentado a2 = new Aposentado ("Eleutério","2025");
		
		Trabalhador t1 = new Trabalhador ("Figueiredo","Metrô");
		Trabalhador t2 = new Trabalhador ("Neide","Escola Cecília Meirelles");
		
		aVerdade.adicionar(e1);
		aVerdade.adicionar(e2);
		aVerdade.adicionar(a1);
		aVerdade.adicionar(a2);
		aVerdade.adicionar(t1);
		aVerdade.adicionar(t2);
		
		aVerdade.avisarPublicacao("Morte do Elon Musk");
		aVerdade.avisarPublicacao("os EUA finalmente deixam de existir");
	}

}
