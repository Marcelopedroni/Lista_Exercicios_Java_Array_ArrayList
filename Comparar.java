package arraydefloats;
public class Comparar {
    
    private final float[] constantes;

    public Comparar() {
        this.constantes = new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
    
   
    public void comparar (float c){
        boolean t = false;
        for (int i =0; i < constantes.length; i++){
            if (c ==constantes[i]){
                t = true;
                System.out.println("O valor " +c+ " foi encontrado na posição " +(i+1)+ ".");
                break;
            } else {
                t = false;
            }
        }
        if (t != false){
        } else {
            System.out.println("Valor " +c+ " não encontrado no vetor.");
        }
    }
    

}
