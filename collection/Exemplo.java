package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class Exemplo {
    public static void main(String[] args) {
        manipulaLista();
        manipularQueue();
        manipularMap();
    }
    public static void manipulaLista() {
        ArrayList<String> animais = new ArrayList<String>();
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Peixe");
        animais.add("Passaro");
        animais.remove("Gato");
        animais.add(1, "Gato");
        System.out.println(animais);
    }
    public static void manipularQueue() {
        LinkedList<String> lista = new LinkedList<String>();
        lista.addLast("1st");
        lista.addLast("2st");
        lista.addLast("3st");
        lista.addLast("3st");
        lista.addLast("4st");
        lista.addLast("5st");
        System.out.println("minha fila possui: "+lista);
        while(!lista.isEmpty()) {
            System.out.println("quem saiu foi o: "+lista.removeFirst());
        }
        System.out.println("a minha filça possui: "+lista.size());
    }
    public static void manipularMap() {
        HashMap<String, String> dados = new HashMap<String, String>();
        
        dados.put("Nome", "Renato");
        dados.put("Sobrenome", "Chitolina");
        dados.put("Idade", "62");
        dados.put("CPF", "000.000.000-00");
        
        System.out.println(dados.get("CPF"));
        
        Set<Entry<String, String>> dadosIteraveis = dados.entrySet();
        
        for (Entry<String, String> entry : dadosIteraveis) {
            System.out.println("chade" +entry.getKey()+" - valor:"+entry.getValue());
        }
    }
}
