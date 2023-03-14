package Abstração;

public class Calculo {
    private double[] notas;
    private int quantProvas;
    public Calculo(double[] notas, int quantProvas) {
        super();
        this.notas = notas;
        this.quantProvas = quantProvas;
    }

    public static double media(double notas[], int quant) {
        double soma=0;
        for (int i = 0; i < notas.length; i++) {
            soma+=notas[i];
        }
        return soma/quant;
    }
    public double estadoAluno() {
        double nota = media(notas, quantProvas);
        if(nota<4) {
            System.out.println("Aluno Reprovado");
            return nota;
        }else if(nota>4&&nota<=6) {
            System.out.println("Aluno em recuperação");
            return nota;
        }else {
            System.out.println("Aluno aprovado");
            return nota;
        }
    }
    public void calculaTempo(int seg) {
        //double 
        int horas,aux, minutos;
       if(seg>=3600) {
            aux = seg%3600;
            horas = calculaHoras(seg);
            minutos = calculaMin(aux/60);
            aux%=60;
            System.out.println("o valor informado equivale à:"+horas+"horas,"+minutos+"minutos"+aux+"segundos");
        }else if(seg>=60) {
            aux = seg%60;
            horas = 0;
            minutos = calculaMin(seg);
            aux%=60;
            System.out.println("o valor informado equivale à:"+horas+"horas,"+minutos+"minutos"+aux+"segundos");
        }else {
            horas = 0;
            minutos = 0;
            aux = seg;
            System.out.println("o valor informado equivale à:"+horas+"horas,"+minutos+"minutos"+aux+"segundos");
        }
    }
    private static int calculaHoras(int seg){
        int aux;
        if(seg>=3600) {
            aux=calculaMin(seg%360);
            return seg/3600;
        }else {
            return 0;
        }
    }
    private static int calculaMin(int min) {
        if(min>=60) {
            calculaSeg(min%60);
            return min/60;
        }else {
            return min/60;
        }
    }
    private static int calculaSeg(int seg) {
        return seg;
    }
}
