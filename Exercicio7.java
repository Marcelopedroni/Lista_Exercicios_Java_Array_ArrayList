package lista1exercicio7;

import java.util.Arrays;

public class Lista1Exercicio7 {
    public static void main(String[] args) {
        int tabuada [][] = new int [10][10];
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                tabuada[i][j] = i+1+j+1;
            }
            System.out.println(Arrays.toString(tabuada[i]));
        }
    }
}
