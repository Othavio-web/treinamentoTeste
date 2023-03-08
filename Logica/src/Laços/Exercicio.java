package Laços;
import java.util.*;

public class Exercicio {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int i, menor = -1, maior = -1;
        int[] lista = new int[100];
        System.out.println("informe um número");
        int n = s.nextInt();
        System.out.println("a tabuada deste número é:");
        for(i = 0;i<=10;i++) {
            System.out.println(n*i);
        }
        System.out.println("lista de números randomicos:");
        for( i= 0;i<lista.length;i++) {
            int m=r.nextInt(101);
            System.out.println(m);
            lista[i] = m;
        }
        for(i=0;i<lista.length;i++) {
            if(menor<0) {
                menor=lista[i];
            }if(maior<0) {
                maior = lista[i];
            }else if(lista[i]<menor) {
                menor = lista[i];
            }else if(lista[i]>maior) {
                maior = lista[i];
            }
        }
        System.out.println("O menor numero é: "+menor);
        System.out.println("O maior numero é: "+maior);
        do {
            System.out.println("informe um número não negativo");
            n = s.nextInt();
        }while(n<=0);
        lista = new int[n];
        for(i=0;i<=lista.length;i++) {
            if(i==0) {
                lista[i]=0;
                System.out.println(lista[i]);
            }else if(i==1) {
                lista[i] = 1;
                System.out.println(lista[i]);
            }else {
                lista[i] = (lista[i-1]+lista[i-2]);
                System.out.println(lista[i]);
            }
        }
        do {
            System.out.println("Digite algum numero, 10 para sair");
            n= s.nextInt();
        }while(n!=10);
    }

}
