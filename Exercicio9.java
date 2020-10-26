package arraydefloats;
public class ArrayDeFloats {
    public static void main(String[] args) {
    float c = 10.1f;
    soma(c);
    }
private static void soma(float c){
    int i = 0;
    float[] constantes = {100f,10f,1f,0.1f,0.01f,0.001f};
    for (float a: constantes){
        a =a+c;
        i++;
    System.out.println("Posição  " + i + " vale " + a);    
    }
  }
}
