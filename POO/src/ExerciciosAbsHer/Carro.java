package ExerciciosAbsHer;

public class Carro extends Automovel{
    private int quantPortas;
    
    public Carro(int quantRodas, String marca, String modelo,int peso, int quantPortas) {
        super(quantRodas, marca, modelo, peso);
        this.quantPortas = quantPortas;
    }

    public int getQuantPortas() {
        return this.quantPortas;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }    
}
