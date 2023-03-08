package Laços;

public class Exemplo {
    
    public static void main(String[] args) {
        int contador=1;
      //while
        while(contador<=10) {
            System.out.println(contador++); 
        }
        do {
            System.out.println(contador--);
        }while(contador>0);
        
        //for
        //  inicializa   condição     incremento
        for(contador = 0;contador<=10;contador++) {
            System.out.println(contador);
        }
    }
    
}
