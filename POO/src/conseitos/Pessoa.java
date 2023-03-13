package conseitos;

public class Pessoa {
    String nome = "";
    boolean gostaDeBiscoitos;
    
    boolean comer(Biscoito biscoito) {
        if(gostaDeBiscoitos) {
            return true;
        }else {
            return false;
        }
    }
}
