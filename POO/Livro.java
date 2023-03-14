package POO;

public class Livro {
	private String nome;
	private int numPaginas;
	public Livro(String nome, int numPaginas) {
		super();
		this.nome = nome;
		this.numPaginas = numPaginas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
}
