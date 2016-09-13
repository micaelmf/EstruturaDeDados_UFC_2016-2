package _01_1_TAD;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.setCodProduto(1);
		p1.setNomeProduto("Caneta");
		p1.setSaldoEstoque(10);
		p1.setPrecoVenda((float) 0.90);
		p1.setPrecoCusto((float) 0.54);
		p1.setValorLucro();
		p1.setCategoria("Material de expediente");
		
		p1.reduzEstoque(2);
		p1.setValorLucro();
		
		System.out.println("Referencia do produto: " + p1);
		
		System.out.println("Código: " + p1.getCodProduto() + 
				"\nProduto: " + p1.getNomeProduto() +
				"\nEstoque: " + p1.getSaldoEstoque()+
				"\nPreco de Venda: " + p1.getPrecoVenda()+
				"\nValor de Lucro: " + p1.getValorLucro());
	}

}
