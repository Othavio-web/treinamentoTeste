package ExerciciosAbsHer;

public class Guincho extends Automovel{
    private double pesoMax;

    public Guincho(int quantRodas, String marca, String modelo, int peso, double pesoMax) {
        super(quantRodas, marca, modelo, peso);
        this.pesoMax = pesoMax;
    }

    public double getPesoMax() {
        return this.pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }
    public boolean carrega(int peso) {
        if(peso<=pesoMax) {
            return true;
        }else {
            return false;
        }
    }
}
