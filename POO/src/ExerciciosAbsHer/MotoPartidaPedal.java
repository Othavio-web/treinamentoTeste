package ExerciciosAbsHer;

public class MotoPartidaPedal extends Moto{
    private boolean puxaAcelerador;
    
    public MotoPartidaPedal(int quantRodas, String marca, String modelo, int peso, int silindradas) {
        super(quantRodas, marca, modelo, peso, silindradas);
        
    }

    public boolean isPuxaAcelerador() {
        return this.puxaAcelerador;
    }

    public void setPuxaAcelerador(boolean puxaAcelerador) {
        this.puxaAcelerador = puxaAcelerador;
    }
    public void liga() {
        if(puxaAcelerador) {
            super.setLiga(puxaAcelerador);
        }
    }
}
