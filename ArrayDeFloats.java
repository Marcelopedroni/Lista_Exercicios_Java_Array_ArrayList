package arraydefloats;
import java.util.Scanner;
public class ArrayDeFloats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        float c = sc.nextFloat();
        Comparar c1 = new Comparar();
        c1.comparar(c);
    }
}

  