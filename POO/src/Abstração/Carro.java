package Abstração;

public class Carro {
    String marca;
    boolean ligado;
    private boolean sistemasEletricos;
    private boolean sistemaAr;
    private boolean sistemaFrenagem;
    
    Carro(String marca) {
        this.marca = marca;
    }
    Carro(boolean ligado){
        this.ligado = ligado;
    }
    Carro(){}
    
    void ligar() {
        this.ligado = acionarMotorACombustao();
        this.sistemaAr = this.ligado;
        this.sistemasEletricos = this.ligado;
        this.sistemaFrenagem = this.ligado;
    }
    void desligar() {
        this.ligado = false;
    }
    private boolean acionarMotorACombustao() {
        if(!executarTempo1()) {
            return false;
        }else if(executarTempo2()!=true) {
            return false;
        }else if(executarTempo3()==false) {
            return false;
        }else if(!executarTempo4()) {
            return false;
        }else {
            return true;
        }
    }
    private boolean executarTempo1() {
        return true;
    }
    private boolean executarTempo2() {
        return true;
    }
    private boolean executarTempo3() {
        return true;
    }
    private boolean executarTempo4() {
        return true;
    }
}
