package modelo;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto () {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getnome() {
	return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public double getpreco() {
		return preco;
	}
	
	public void setpreco(double preco) {
		this.preco = preco;
	}
	
	public int getquantidade() {
		return quantidade;
	}
	
	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + 
				" | Preço: R$ " + preco 
				+" | Quantidade: " + quantidade;
				
	}


}
