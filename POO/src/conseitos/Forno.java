package conseitos;

public class Forno {
    String tipo = "";
    double temperatura = 0;
    boolean ligado = false;
    
    public void ligar(double temperatura) {
        this.temperatura = temperatura; 
        this.ligado = true;
    }
    public void assar(Biscoito biscoito) {
        //alguma coisa
        biscoito.pronto = true;
    }
}
