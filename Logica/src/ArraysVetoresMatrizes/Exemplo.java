package ArraysVetoresMatrizes;

public class Exemplo {
    public static void main(String[] args) {
        //Array vetor
        int[] vetor = {14,17,26};
        //System.out.print(vetor[0]);
        System.out.println("array:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] +"|");
            if(i==vetor.length -1) {
                System.out.println();
            }
        }
        //array matriz
        //int var = 340;   00 01 02   11  12 13   20 21 22  23    31 32 33 34
        int[][] matriz = {{67,60,79},{78,801,45},{73,36,78, 88}, {45,67,88,90}};
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"|");
                if(j==matriz[i].length-1) {
                    System.out.println();
                }
            }
        }
        int[][][] cubo = {{{10,68,50}, {67,78,85}}, {{57,67,75}, {68,78,88}}, {{80,90,100}, {100,110,115}}};
        System.out.println("Cubo:");
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int j2 = 0; j2 < cubo[j].length; j2++) {
                    System.out.print(i+"-"+j+"-"+j2+":"+cubo[i][j][j2]+"|");
                }
            }
        }
    }
}