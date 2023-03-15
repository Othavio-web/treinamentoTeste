package Heranca.somenteOO;

public abstract class Carro implements ICarro{
    private String marca;
    private boolean ligado = false;
    
    Carro(String marca){
      this.marca=marca;  
    }
    
   
    
    public boolean getLigado() {
        return ligado;
    }
    public String getMarca() {
        return marca;
    }



    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public abstract void ligar();
    public abstract void desligar();
}
