package ExerciciosAbsHer;

public class CarroAutomatico extends Carro{
    private boolean presFreio = false;

    public CarroAutomatico(int quantRodas, String marca, String modelo, int peso, int quantPortas, boolean presFreio) {
        super(quantRodas, marca, modelo, quantPortas, peso);
        this.presFreio = presFreio;
    }

    public boolean isPresFreio() {
        return this.presFreio;
    }

    public void setPresFreio(boolean presFreio) {
        this.presFreio = presFreio;
    }
    public void liga() {
        if(presFreio) {
            super.setLiga(true);
        }
    }
}