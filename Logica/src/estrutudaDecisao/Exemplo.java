package estrutudaDecisao;

public class Exemplo {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 8;
        
        if(numero1>=numero2){
            System.out.println("o n�mero 1 � maior que o n�mero 2");
            /*if(numero1==numero2) {
                System.out.println("o numero 1 � igual ao numero 2");
            }*/
        }else if(numero1==numero2) {
            System.out.println("os numeros s�o iguais");
        }else if(numero1<numero2) {
            System.out.println("o numero 1 � menor que o numero 2");
        }
        System.out.println("proxima etapa");
        String fruta="ma�a";
        switch (fruta) {
        
        case "banana":
            System.out.println("a fruta � banana");
            break;
        case "ma�a":
            System.out.println("a fruta � ma�a");
            break;
        case "uva":
            System.out.println("a fruta � uva");
            break;
        case "melancia":
            System.out.println("a fruta � melancia");
            break;

        default:
            System.out.println("A fruta �:"+fruta);
            break;
        }
    }
}
