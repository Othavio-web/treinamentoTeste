package Operadores;

public class Exemplo {

    public static void main(String[] args) {
        //atribuição
        int numero = 2;
        System.out.println(numero);
        int nextNumero;
        nextNumero = 67;
        System.out.println(nextNumero);
        nextNumero = numero;
        System.out.println(nextNumero);
        numero = 0;
        System.out.println(numero);
        
        //aritiméticos
        //soma
        int soma = 5+5;
        System.out.println(soma);
        int segundaSoma = soma+10;
        System.out.println(segundaSoma);
        // extra
        String primeiroNome = "Renato";
        String segundoNome = "Chicoina";
        String nome = primeiroNome+" "+segundoNome;
        System.out.println(primeiroNome+" "+segundoNome);
        System.out.println(nome);
        //subitração
        int sub = 10-6;
        System.out.println(sub);
        int segundaSub = sub-2;
        System.out.println(segundaSub);
        //Multiplicação
        int mult = 3*3;
        System.out.println(mult);
        int segMult = mult*3;
        System.out.println(segMult);
        //divisão
        double div = 10/5;
        System.out.println(div);
        double segDiv  = div/3;
        System.out.println(segDiv);
        //modulo
        double mod = 10%3;
        System.out.println(mod);
        // incremento/decremento
        int contador = 0;
        System.out.println(contador);
        contador++;
        System.out.println(contador);
        int contador2 = 10;
        contador2--;
        System.out.println(contador2);
        //aritiméticos atalhos
        int numeroSoma = 1;
        System.out.println(numeroSoma);
        numeroSoma+=99;
        int numeroDivisao = 10;
        numeroDivisao/=5;
        System.out.println(numeroDivisao);
        //operadores de igualdade(ou diferença)
        boolean expr1 = 1==2;
        boolean exp2 = -7!=0;
        System.out.println(expr1);
        System.out.println(exp2);
        //operadores relacionais
        boolean expr3 = 1<=10;
        boolean expr4 = 1>=10;
        System.out.println(expr3);
        System.out.println(expr4);
        int nreal = 8;
        int nrel = 7;
        System.out.println(nreal<nrel);
        //operadores logicos
        boolean expr5 = true;
        boolean expr6 = 5>=10;
        boolean expr7 = "AB"!="BA";
        boolean resExpr = expr5&&expr6&&expr7; 
        System.out.println(resExpr);
        boolean expr8 = false;
        boolean expr9 = 5<=10;
        boolean expr10 = "AB"!="AB";
        boolean res1Expr = expr8||expr9||expr10; 
        System.out.println(res1Expr);
        int numSel = 8;
        boolean respExp = numSel==0||(numSel<=10&&numSel>0);
        System.out.println(respExp);
    }

}
