package models;

public class Livro {

	String titulo;
	String autor;
	Integer ano;
	
	public void setTitulo(String titulo) {
		
		if(titulo == null || titulo.isEmpty() || titulo.length()<3){
			throw new IllegalArgumentException("Titulo invalido");
		}
		
		this.titulo = titulo;
		
	}

	public void setAno(Integer ano) {
		
		if(ano == null ||/* ano.isEmpty() ||*/ ano < 100){
			throw new IllegalArgumentException("Ano invalido");
		}
		
		this.ano = ano;
		
	}

	public void setAutor(String autor) {
		 
		if(autor == null || autor.isEmpty() || autor.length()<3){
			throw new IllegalArgumentException("Autor invalido");
		}
		
		this.autor = autor;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}
	
	public String getAutor() {
		return autor;
	};
	
	
}
