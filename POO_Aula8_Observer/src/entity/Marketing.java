package entity;

public class Marketing implements InteressadoEmVendas{

	@Override
	public void produtoVendido(Produto p) {
		System.out.println("Fazendo enquete com o cliente para saber identificar a satisfação com o produto " + p.getNome() + ".");
	}

}
