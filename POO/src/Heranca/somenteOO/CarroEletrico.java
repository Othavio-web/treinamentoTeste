package Heranca.somenteOO;

public class CarroEletrico extends Carro{
    private String modelo;
    
    CarroEletrico(String marca){
      super(marca);  
    }
    
    public void ligar() {
        super.setLigado(acionarbateria());
    }
    private boolean acionarbateria() {
        return true;
    }
    
    public boolean getLigado() {
        return super.getLigado();
    }
    public String getMarca() {
        return super.getMarca();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void desligar() {
        super.setLigado(false);
    }
    
}
