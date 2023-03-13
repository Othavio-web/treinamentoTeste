package Aleatórios;

import java.util.*;

public class Exercicios {
    /*public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        int segundoTotal = retornaValorDigitado(scan);
        int horaTotal = calculaHora(segundoTotal);
        int minutoTotal = calculaMinuto(segundoTotal);
        int seguntos = calculaSegundo(segundoTotal);
        exibeHoraMinutoSegundo(horaTotal,minutoTotal,seguntos,segundoTotal);

    }

    static int retornaValorDigitado(Scanner scan) {
        System.out.println("Digite um valor em segundos para converter para Horas:");
        int segTotal = scan.nextInt();
        return segTotal;
    }

    static int calculaHora(int segTotal) {
        int horas = (int) segTotal / 3600;
        return horas;
    }

    static int calculaMinuto(int segTotal) {
        int resto = segTotal % 3600;
        int minutos = resto / 60;
        return minutos;
    }
    static int calculaSegundo(int segTotal) {
        int resto = segTotal % 3600;
        int segundos = resto % 60;
        return segundos;
    }


    static void exibeHoraMinutoSegundo(int horas, int minutos, int segundos, int segundosTotal) {
        System.out.println("Os " + segundosTotal + " segundos digitados, equivalem a " + horas + "h" + minutos + "min" + segundos + "seg.");
    }*/

    public static void informaAprovado(double nota) {
        if(nota<4) {
            System.out.println("aluno reprovado");
        } else if(nota>=4||nota<=7) {
            System.out.println("aluno em recuperação");
        }else {
            System.out.println("Aluno aprovado");
        }
    }
    public static  double calculaMedia(double[] nota, int prova){
        double soma=0;
        double retorno;
        for (int i = 0; i < nota.length; i++) {
            soma+=nota[i];
        }
        retorno = soma/prova;
        informaAprovado(retorno);
        return retorno;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        int soma = 0;
        int[] vet = new int[100];
        System.out.println("informe o tamanho da matriz:");
        t = s.nextInt();
        int[][] matrix = new int[t][t];
        for(int i = 0;i<matrix.length;i++) {
            for(int j= 0;j<matrix[i].length;j++) {
                double n = Math.random()*10;
                matrix[i][j] = (int)Math.round(n);
                System.out.print(matrix[i][j]+"|");
            }
            System.out.println();
        }
        for(int i = 0;i<matrix.length;i++) {
            //soma = 0;
            for(int j= 0;j<matrix[i].length;j++) {
                if(i==j) {
                    soma += matrix[i][j]; 
                }
            }
        }
        System.out.println("O valor da soma da diagonal principal é:" +soma);
        System.out.println("preenchendo o vetor");
        for(int i = 0;i<vet.length;i++) {
            double n = Math.random()*100;
            vet[i] = (int)Math.round(n);
            System.out.print(vet[i]+"|");
        }
        System.out.println();
        System.out.println("ordenando o vetor");
        int aux = 0;
        for(int i = 0;i<vet.length;i++) {
            for (int j = 0; j < vet.length-1; j++) {
                if(vet[j]>vet[j+1]) {
                    System.out.println("trocou");
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;                    
                }                
            }
        }
        for(int i = 0;i<vet.length;i++)
            System.out.print(vet[i]+"|");
        int[] vet1 = new int[50];
        int[] vet2 = new int[50];
        System.out.println("preenchendo array");
        for(int i = 0;i<vet1.length;i++) {
            double n = Math.random()*100;
            vet1[i] = (int)Math.round(n);
            System.out.print(vet1[i]+"|");
        }
        System.out.println("preenchendo array");
        for(int i = 0;i<vet2.length;i++) {
            double n = Math.random()*100;
            vet2[i] = (int)Math.round(n);
            System.out.print(vet2[i]+"|");
        }
        aux = 0;
        System.out.println("/n ordenando...");
        for(int i = 0;i<vet1.length;i++) {
            for (int j = 0; j < vet1.length-1; j++) {
                if(vet1[j]>vet1[j+1]) {

                    aux = vet1[j];
                    vet1[j] = vet1[j+1];
                    vet1[j+1] = aux;                    
                }
                System.out.print(vet1[i]+"|");
            }
        }
        System.out.println();
        aux = 0;
        for(int i = 0;i<vet2.length;i++) {
            for (int j = 0; j < vet2.length-1; j++) {
                if(vet2[j]>vet2[j+1]) {

                    aux = vet2[j];
                    vet2[j] = vet2[j+1];
                    vet2[j+1] = aux;                    
                }  
                System.out.print(vet2[i]+"|");
            }
        }
        int[] vetF = new int[100];
        aux = 0;
        System.out.println("/n Novo Array");
        for (int i = 0; i < vetF.length; i++) {
            vetF[i] = vet1[i];
            aux++;
            if(i==vet1.length-1) {
                break;
            }
        }
        for (int i = 0; i < vet2.length-1; i++) {
            vetF[i+aux] = vet2[i];
        }
        aux = 0;
        for(int i = 0;i<vetF.length;i++) {
            for (int j = 0; j < vetF.length-1; j++) {
                if(vetF[j]>vetF[j+1]) {

                    aux = vetF[j];
                    vetF[j] = vetF[j+1];
                    vetF[j+1] = aux;                    
                }                
            }
        }
        System.out.println("imprimeindo novo Array");
        for(int i = 0;i<vetF.length;i++) {
            System.out.print(vetF[i]+"|");
        }
        System.out.println();
        System.out.println("quantas provas foram aplicadas?");
        int provas = s.nextInt();
        double[]notas = new double[provas];
        System.out.println("informe as notas do alunos");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("qual a nota da "+(i+1)+"ª prova");
            notas[i] = s.nextDouble();
        }
        calculaMedia(notas, provas);
    }

}
