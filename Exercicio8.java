package arraydefloats;
public class ArrayDeFloats {
    public static void main(String[] args) {
    float[] constantes = {100f,10f,1f,0.1f,0.01f,0.001f};
    float[] duplicata = constantes;
    eIgual(constantes, duplicata);
    }
private static void eIgual(float[] constantes, float[] duplicata){
    boolean a = false;
    int c = duplicata.length; 
    if (constantes.length == duplicata.length){
        for (int i = 0; i< c ; i++){
            if (duplicata[i] == constantes[i]){
                a = true;
            } else{
                a = false;
            }
        }
    } else{
        a = false;
    }
    System.out.println("Os vetores são do mesmo tamanho e possuem os mesmos valores? " + a);
}
}
