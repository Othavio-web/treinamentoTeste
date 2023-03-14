package Abstração;
import java.util.*;
public class Exemplo {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("kia");
        double[] nota;
        int quant;
        Scanner s=new Scanner(System.in);
        meuCarro.ligar();
        if(meuCarro.ligado) {
            System.out.println("Meu carro esta ligado");
        }else {
            System.out.println("meu carro esta desligado");
        }
        System.out.println("digite a quantidade de provas realizadas");
        quant = s.nextInt();
        nota = new double[quant];
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a nota da "+(i+1)+"ª prova");
            nota[i] = s.nextDouble();
        }
        Calculo c = new Calculo(nota, quant);
        c.estadoAluno();
        System.out.println("Digite a quantidade de segundos");
        int seg = s.nextInt();
        c.calculaTempo(seg);
    }
}
