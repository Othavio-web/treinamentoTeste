package estrutudaDecisao;

public class Exemplo {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 8;
        
        if(numero1>=numero2){
            System.out.println("o número 1 é maior que o número 2");
            /*if(numero1==numero2) {
                System.out.println("o numero 1 é igual ao numero 2");
            }*/
        }else if(numero1==numero2) {
            System.out.println("os numeros são iguais");
        }else if(numero1<numero2) {
            System.out.println("o numero 1 é menor que o numero 2");
        }
        System.out.println("proxima etapa");
        String fruta="maça";
        switch (fruta) {
        
        case "banana":
            System.out.println("a fruta é banana");
            break;
        case "maça":
            System.out.println("a fruta é maça");
            break;
        case "uva":
            System.out.println("a fruta é uva");
            break;
        case "melancia":
            System.out.println("a fruta é melancia");
            break;

        default:
            System.out.println("A fruta é:"+fruta);
            break;
        }
    }
}
