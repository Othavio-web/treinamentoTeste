package ExerciciosAbsHer;

public class Moto extends Automovel{
    private int silindradas;

    public Moto(int quantRodas, String marca, String modelo,int peso, int silindradas) {
        super(quantRodas, marca, modelo, peso);
        this.setSilindradas(silindradas);
    }

    public int getSilindradas() {
        return this.silindradas;
    }

    public void setSilindradas(int silindradas) {
        this.silindradas = silindradas;
    }
    
}
