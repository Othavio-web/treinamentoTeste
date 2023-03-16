package ExerciciosAbsHer;

public class Mae extends Filho{

    public Mae(String nome, int idade, Pai pai, Mae mae) {
        super(nome, idade, pai, mae);
        
    }
    
    public Mae(String nome, int idade, Pai pai) {
        super(nome, idade, pai, null);
    }
    public Mae(String nome, int idade) {
        super(nome, idade, null, null);
    }
    public Mae(String nome, int idade, Mae mae) {
        super(nome, idade, null, mae);
    }
    
}
