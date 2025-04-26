package entity;

public class GestaoLogistica implements InteressadoEmVendas{

	@Override
	public void produtoVendido(Produto p) {
		System.out.println("Preparando a entrega do produto "
				+ p.getNome() + " para o cliente.");
	}

}
