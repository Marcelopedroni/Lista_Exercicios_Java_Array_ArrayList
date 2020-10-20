package lista1exercicio5;
import java.util.Scanner;

public class Lista1Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho; 
        int contrue = 0; 
        int contfalse = 0;
                
        System.out.println("Digite o tamanho do vetor: ");
        tamanho = sc.nextInt();
        int booleano[] = new int [tamanho];
        System.out.println(booleano.length);
        
        for (int i=0; i < booleano.length; i++){
            System.out.println("Digite 1 para verdadeiro ou 0 para falso: ");
            int valor = sc.nextInt();
            if (valor != 0 && valor != 1){
                System.out.println("Valor inválido, digite apenas 1 ou 0.");
                i = i-1;
            }
            else if (valor == 1){
               contrue ++;
               booleano[i] = valor;
            } else if (valor == 0){
                contfalse ++;
                booleano[i] = valor;
            } 
           
        }
        System.out.println("Foram digitados " + contrue + " valores Trues e " +contfalse + " Falsos");
    }
    
}
