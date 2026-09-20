package usuario;

public class User {
	private String nome;
	private String plataforma;
	private double preco;
	private int estoque;
	
	


	public User(String nome, String plataforma, double preco, int estoque) {

	  this.nome = nome;
	  this.plataforma = plataforma;
	  this.preco = preco;
	  this.estoque = estoque;
	  
	}

public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getPlataforma() {
	return plataforma;
}


public int getEstoque() {
	return estoque;
}

public void setEstoque(int estoque) {
	this.estoque = estoque;
}

public void setPlataforma(String plataforma) {
	this.plataforma = plataforma;
}



public double getPreco() {
	return preco;
}


public void setPreco(double preco) {
	this.preco = preco;
}

 

}

