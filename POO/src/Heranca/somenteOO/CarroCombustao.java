package Heranca.somenteOO;

public class CarroCombustao extends Carro{
    private String modelo;
    
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    CarroCombustao(String marca){
      super(marca);  
    }
    
    public void ligar() {
        super.setLigado(acionarMotorACombustao());
    }
    private boolean acionarMotorACombustao() {
        return true;
    }

    @Override
    public void desligar() {
        super.setLigado(false);
    }
    
   
}
