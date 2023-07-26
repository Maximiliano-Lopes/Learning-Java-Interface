package entities;

public class Livro {
	private int id;
	private double precoBase;
	private String titulo;
	private Precificacao precificacao;
	
	
	public Livro() {
	}

	public Livro(int id, double precoBase, String titulo) {
		super();
		this.id = id;
		this.precoBase = precoBase;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Precificacao getPrecificacao() {
		return precificacao;
	}

	public void setPrecificacao(Precificacao precificacao) {
		this.precificacao = precificacao;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	
}
