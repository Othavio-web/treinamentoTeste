package ExerciciosAbsHer;

public abstract class Automovel {
    private int quantRodas;
    private String marca;
    private String modelo;
    private boolean liga;
    private int peso;
    public Automovel(int quantRodas, String marca, String modelo, int peso) {
        this.quantRodas = quantRodas;
        this.marca = marca;
        this.modelo = modelo;
        this.setPeso(peso);
    }
    public int getQuantRodas() {
        return this.quantRodas;
    }
    public void setQuantRodas(int quantRodas) {
        this.quantRodas = quantRodas;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean getLiga() {
        return this.liga;
    }
    public void setLiga(boolean liga) {
        this.liga = liga;
    }
    public int getPeso() {
        return this.peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
