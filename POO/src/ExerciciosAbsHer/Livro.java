package ExerciciosAbsHer;

public class Livro {
    private String nome;
    private int nPag;
    public Livro(String nome, int nPag) {
        super();
        this.nome = nome;
        this.nPag = nPag;
    }
    public Livro() {
        super();
        this.nome = "";
        this.nPag = -1;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnPag() {
        return this.nPag;
    }
    public void setnPag(int nPag) {
        this.nPag = nPag;
    }    
}
