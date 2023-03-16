package ExerciciosAbsHer;

public class Filho extends Pessoa{
    Pai pai;
    Mae mae;
    public Filho(String nome, int idade, Pai pai, Mae mae) {
        super(nome, idade);
        this.pai = pai;
        this.mae = mae;
    }
    public Pessoa getPai() {
        return this.pai;
    }
    public void setPai(Pai pai) {
        this.pai = pai;
    }
    public Pessoa getMae() {
        return this.mae;
    }
    public void setMae(Mae mae) {
        this.mae = mae;
    }
}
