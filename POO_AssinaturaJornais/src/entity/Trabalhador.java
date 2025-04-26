package entity;

public class Trabalhador implements Assinantes{
	private String nome;
	private String empresa;
	
	public Trabalhador (String nome, String empresa) {
		this.nome = nome;
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public void lerNoticia(String n) {
		System.out.println("Espera só até o patrão da "+ empresa +" ficar sabendo sobre " + n);
	}
	
}
