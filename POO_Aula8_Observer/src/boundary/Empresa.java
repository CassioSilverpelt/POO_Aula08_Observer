package boundary;
import entity.*;

public class Empresa {
	public static void main (String[] args) {
		GestaoVendas gv = new GestaoVendas();
		
		Marketing mkt = new Marketing();
		GestaoLogistica g1 = new GestaoLogistica();
		
		Produto p1 = new Produto("Camiseta", 60.00f);
		Produto p2 = new Produto("Boné", 20.00f);
		
		gv.adicionar(g1);
		gv.adicionar(mkt);
		
		gv.fazerVenda(p2);
		gv.fazerVenda(p1);
	}
}
