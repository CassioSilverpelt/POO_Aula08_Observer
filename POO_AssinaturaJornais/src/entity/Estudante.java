package entity;

public class Estudante implements Assinantes {
	private String nome;
	private String escola;
	
	public Estudante (String nome, String escola) {
		this.nome = nome;
		this.escola = escola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	@Override
	public void lerNoticia(String n) {
		System.out.println("Nossa, essa notícia sobre " + n + " vai me ajudar na escola " + escola);
	}

}
