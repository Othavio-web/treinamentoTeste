package POO;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	private Pessoa pai;
	private Pessoa mae;

	
	public Pessoa(String nome, int idade, String sexo, Pessoa pai, Pessoa mae) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.pai = pai;
		this.mae = mae;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public Pessoa getMae() {
		return mae;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
