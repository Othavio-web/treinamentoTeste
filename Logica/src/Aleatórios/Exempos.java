package Aleatórios;

import java.util.Random;

public class Exempos {

    public static void main(String[] args) {
        double aleatorio = Math.random()*10;
        System.out.println(Math.round(aleatorio));
        
        Random sort = new Random();
        aleatorio=sort.nextInt(1000);
        System.out.println(aleatorio);
    }

}
