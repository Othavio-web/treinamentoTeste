package ExerciciosAbsHer;

public class Pessoa {
    private String nome;
    private String numTelefone;
    private int idade;
    public Pessoa(String nome, int idade) {
        super();
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa() {
        this.nome = "";
        this.idade = -1;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNumTelefone() {
        return this.numTelefone;
    }
    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }
    
}
