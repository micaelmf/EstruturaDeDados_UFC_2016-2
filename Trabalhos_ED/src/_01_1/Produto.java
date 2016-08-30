package _01_1;

public class Produto {
	private int codProduto;
	private String nomeProduto;
	private int saldoEstoque;
	private float precoVenda;
	private float precoCusto;
	private float valorLucro;
	private String categoria;
	
	Produto(int codProduto, String nomeProduto, int saldoEstoque, double precoVenda, double precoCusto, String categoria){
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.saldoEstoque = saldoEstoque ;
		this.precoVenda = (float) precoVenda;
		this.precoCusto = (float) precoCusto;
		this.categoria = categoria;
	}
	
	public void reduzEstoque(int saida){
		int estoque = getSaldoEstoque() - saida;
	
		if(estoque >= 0){
			setSaldoEstoque(estoque);
		}else{
			System.out.println("Saldo insuficiente");
		}
	}
	
	public int getSaldoEstoque() {
		return saldoEstoque;
	}
	public void setSaldoEstoque(int saldoEstoque) {
		this.saldoEstoque = saldoEstoque;				
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public float getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}
	public float getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public float getValorLucro() {
		return valorLucro;
	}
	public void setValorLucro() {
		this.valorLucro = getPrecoVenda() - getPrecoCusto(); 
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
