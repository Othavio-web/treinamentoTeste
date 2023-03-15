package Polimorfismo;

public class Carro { // Classe base OU super (superior) OU pai/m�e
    // Caracter�sticas
    protected String marca;
    protected String modelo;
    protected boolean ligado = false;

    protected boolean sistemaEletricoPronto;
    protected boolean sistemaArPronto;
    protected boolean sistemaFrenagemPronto;

    // Construtores com overloading
    Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    Carro(String marca) {
        this(marca, "N�o definido");
    }
    Carro() {
        this("N�o definida");
    }

    // Comportamentos
    public String getMarca() {
        return this.marca;
    }

    public boolean getLigado() {
        return this.ligado;
    }
}