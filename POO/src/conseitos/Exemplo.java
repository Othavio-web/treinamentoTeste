package conseitos;

public class Exemplo {
    public static void main(String[] args) {
        Forno fornoCasa = new Forno();
        fornoCasa.tipo = "metal";
        System.out.println(fornoCasa.ligado+"em: "+fornoCasa.temperatura+"�C");
        fornoCasa.ligar(150);
        System.out.println(fornoCasa.ligado+"em: "+fornoCasa.temperatura+"�C");
        Biscoito natal = new Biscoito();
        natal.forma = "redondo";
        natal.ingredientes[0] = "farinha de trigo";
        natal.ingredientes[1] = "leite";
        natal.ingredientes[2] = "a�ucar";
        natal.ingredientes[3] = "chocolate";
        System.out.println("O biscoito de natal esta pronto?"+natal.pronto);
        fornoCasa.assar(natal);
        System.out.println("O biscoito de natal esta pronto?"+natal.pronto);
        //natal.pronto
        Biscoito amantegado = new Biscoito();
        amantegado.forma = "quadrado";
        amantegado.ingredientes[0] = "farinha de trigo";
        amantegado.ingredientes[0] = "leite";
        amantegado.ingredientes[0] = "a�ucar";
        amantegado.ingredientes[0] = "manteiga";
        System.out.println("O biscoito amantegado esta pronto?"+amantegado.pronto);
        fornoCasa.assar(amantegado);
        System.out.println("O biscoito amantegado esta pronto?"+amantegado.pronto);
        Pessoa joao = new Pessoa();
        joao.nome = "Jo�o";
        joao.gostaDeBiscoitos = true;
        boolean comeu = joao.comer(amantegado);
        if(comeu) {
            System.out.println(joao.nome+" comeu");
        }else {
            System.out.println(joao.nome+" n�o comeu");
        }
        Pessoa renato = new Pessoa();
        renato.nome = "Renato";
        joao.gostaDeBiscoitos = false;
        comeu = renato.comer(amantegado);
        if(comeu) {
            System.out.println(renato.nome+" comeu");
        }else {
            System.out.println(renato.nome+" n�o comeu");
        }
    }
}