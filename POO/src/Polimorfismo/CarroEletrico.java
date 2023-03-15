package Polimorfismo;

public class CarroEletrico extends Carro{
 // Construtor
    CarroEletrico(String marca) {
        super(marca);
    }
    
    void ligar() {
        this.ligado = acionarBateriaParaMotorEletrico();
        
        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagemPronto = this.ligado;
    }
    
    private boolean acionarBateriaParaMotorEletrico() {
        // Executa as complexidades de acionamento da bateria e posteriores sistemas
        
        return true;
    }
}
