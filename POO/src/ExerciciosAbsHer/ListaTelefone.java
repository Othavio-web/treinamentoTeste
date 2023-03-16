package ExerciciosAbsHer;

public class ListaTelefone {
    private Pessoa[] lista = new Pessoa[100];
    
    public void preencheLista(Pessoa p, String numTelefone) {
        Pessoa[] aux;
        for(int i=0;i<lista.length;i++) {
            if(lista[i].equals(p)) {
                p.setNumTelefone(numTelefone);
            }else if(lista[i].equals(null)) {
                p.setNumTelefone(numTelefone);
                lista[i] = p;
            }else if(i==lista.length-1) {
                aux = new Pessoa[lista.length+1];
                for (int j = 0; j < lista.length; j++) {
                    aux[j] = lista[j];
                }
                lista = aux;
            }
        }
        organizaLista();
    }
    private void organizaLista() {
        Pessoa aux;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length-1; j++) {
                if(lista[j].getNome().charAt(0)<lista[j+1].getNome().charAt(0)) {
                    aux = lista[j+1];
                    lista[j+1] = lista[j];
                    lista[j] = aux;
                }else if(lista[j].getNome().charAt(0)<lista[j-1].getNome().charAt(0)) {
                    aux = lista[j-1];
                    lista[j-1] = lista[j];
                    lista[j] = aux;
                }
            }
        }
    }
}
