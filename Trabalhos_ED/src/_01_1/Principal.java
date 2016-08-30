package _01_1;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto(1, "Caneta", 10, 0.9, 0.54, "Material de Expediente");
		
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
