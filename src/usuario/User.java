package usuario;

public class User {
	private String nome;
	private String plataforma;
	private double preco;
	
	


	public User(String nome, String plataforma, double preco) {

	  this.nome = nome;
	  this.plataforma = plataforma;
	  this.preco = preco;
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

