package ExerciciosAbsHer;

public class Pai extends Filho{

    public Pai(String nome, int idade, Pai pai, Mae mae) {
        super(nome, idade, pai, mae);
        
    }
    public Pai(String nome, int idade, Pai pai) {
        super(nome, idade, pai, null);
    }public Pai(String nome, int idade) {
        super(nome, idade, null, null);
    }
    public Pai(String nome, int idade, Mae mae) {
        super(nome, idade, null, mae);
    }
    
}
