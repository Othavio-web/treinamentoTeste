package Heranca.somenteOO;

public class Exemplo {

    public static void main(String[] args) {
        // problema: ter dois tipos diferentes de carros, combust�o e el�trico, podendo liga-los e obter a resposta correta
        CarroCombustao cc= new CarroCombustao("Ford");
        cc.ligar();
        System.out.println(cc.getLigado());
        
         
        CarroEletrico ce = new CarroEletrico("tesla");
        ce.ligar();
        System.out.println(ce.getLigado());
        
    }

}
