package Polimorfismo;

public class Exemplo {
    public static void main(String[] args) {
        // Problema: Ter dois diferentes carros, um a combust�o e outro el�trico, podendo lig�-los e obter resposta de ligado
        
        CarroCombustao comb = new CarroCombustao("Ford");
        
        comb.ligar();
        
        System.out.println("Carro combust�o ligado? " + comb.getLigado());
        
        CarroEletrico eletr = new CarroEletrico("Tesla");
                
        eletr.ligar();
        
        System.out.println("Carro el�trico ligado? " + eletr.getLigado());
    }
}
