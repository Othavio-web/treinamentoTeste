package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exemplo {
    public static void main(String[] args) {
        manipulaLista();
        manipularQueue();
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
}
