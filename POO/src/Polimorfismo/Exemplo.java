package Polimorfismo;

public class Exemplo {
    public static void main(String[] args) {
        // Problema: Ter dois diferentes carros, um a combustão e outro elétrico, podendo ligá-los e obter resposta de ligado
        
        CarroCombustao comb = new CarroCombustao("Ford");
        
        comb.ligar();
        
        System.out.println("Carro combustão ligado? " + comb.getLigado());
        
        CarroEletrico eletr = new CarroEletrico("Tesla");
                
        eletr.ligar();
        
        System.out.println("Carro elétrico ligado? " + eletr.getLigado());
    }
}
