package Polimorfismo;

public class CarroCombustao extends Carro { // Classe especializada OU subclasse OU filho/filha
    // Construtor
    CarroCombustao(String marca) {
        super(marca);
    }
    
    void ligar() {
        this.ligado = acionarMotorACombustao();

        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagemPronto = this.ligado;
    }

    private boolean acionarMotorACombustao() {
        // Executa as complexidades de liga��o de um motor � combust�o

        return true;
    }
}