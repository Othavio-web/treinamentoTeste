package Exercicios;
import java.util.Scanner;
import java.util.Random;
public class Exercicios {

    public static void main(String[] args) {
        Random r = new Random(2);
        Scanner s = new Scanner(System.in);
        System.out.println("qual a sua idade");
        int idade = s.nextInt();
        if(idade>=18) {
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você é menor de idade");
        }
        System.out.println("informe a quantidade de produtos");
        int quant = s.nextInt();
        if(quant<=10) {
            System.out.println("Você não tem desconto");
        }else if(quant>10&&quant<=20) {
            System.out.println("Você tem desconto de 10%");
        }else if(quant>20&&quant<=50) {
            System.out.println("Você tem desconto de 20%");
        }else if(quant>50) {
            System.out.println("Você tem desconto de 25%");
        }
        System.out.println("escolha pedra papel ou tesoura");
        String jogada = s.next();
        int comJog = r.nextInt();
        String jogCom = "";
        switch(comJog){
        case 0:
            jogCom = "pedra";
            break;
        case 1:
            jogCom = "papel";
            break;
        case 2:
            jogCom = "tesoura";
            break;
            default:
                System.out.println("computador jogou errado");
        }
        if(jogada.equalsIgnoreCase(jogCom)) {
            System.out.println("empate");
        }else if(jogada.equalsIgnoreCase("pedra")&&jogCom.equalsIgnoreCase("papel")) {
            System.out.println("Computador venceu");
        }else if(jogada.equalsIgnoreCase("papel")&&jogCom.equalsIgnoreCase("tesouta")) {
            System.out.println("Computador venceu");
        }else if(jogada.equalsIgnoreCase("tesoura")&&jogCom.equalsIgnoreCase("pedra")) {
            System.out.println("Computador venceu");
        }else if(jogCom.equalsIgnoreCase("pedra")&&jogada.equalsIgnoreCase("papel")) {
            System.out.println("Jogador venceu");
        }else if(jogCom.equalsIgnoreCase("papel")&&jogada.equalsIgnoreCase("tesouta")) {
            System.out.println("jogador venceu");
        }else if(jogCom.equalsIgnoreCase("tesoura")&&jogada.equalsIgnoreCase("pedra")) {
            System.out.println("jogador venceu");
        }
        System.out.println("informe o primeiro valor");
        int x= s.nextInt();
        System.out.println("informe o segundo valor");
        int y= s.nextInt();
        System.out.println("informe a operação");
        String operacao= s.next();
        int res = 0;
        switch(operacao) {
        case"soma":
            res = x+y;
            break;
        case"subitração":
            res = x-y;
            break;
        case"multiplicação":
            res = x*y;
            break;
        case"divisão":
            res = x/y;
            break;
        default:
            System.out.println("informe uma operação valida");
        }
        System.out.println("a resposta da operação é:"+res);
    }

}
