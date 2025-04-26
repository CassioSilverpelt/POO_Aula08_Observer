package entity;

public class Aposentado implements Assinantes{
	private String nome;
	private String anoAposentadoria;
	
	public Aposentado (String nome, String anoAposentadoria) {
		this.nome = nome;
		this.anoAposentadoria = anoAposentadoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAnoAposentadoria() {
		return anoAposentadoria;
	}

	public void setAnoAposentadoria(String anoAposentadoria) {
		this.anoAposentadoria = anoAposentadoria;
	}

	@Override
	public void lerNoticia(String n) {
		System.out.println("O pessoal no baile de "+ anoAposentadoria +" vai adorar saber sobre " + n);
	}
	
}
