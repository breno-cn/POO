import java.util.Scanner;

public class Forca {
    private String frase;
    private  int tamanho;
    private int vida;
    private boolean acerto[];

    public Forca(String frase) {
        this.frase = frase;
        tamanho = frase.length();
        vida = 6;
        acerto = new boolean[tamanho];
        for (int i = 0; i < tamanho; i++) {
            if(frase.charAt(i) ==  ' ') acerto[i] = true;
            else acerto[i] = false;
        }
    }

     public void insereLetra(String c){
            for(int i = 0; i < tamanho; i++){
                if(c.toLowerCase().charAt(0) == frase.toLowerCase().charAt(i)) acerto[i] = true;
            }
    }

    public void escreve(){
        for(int i = 0; i < tamanho; i++){
            if(acerto[i] == true) System.out.print(frase.charAt(i) + " ");
            else System.out.print("_ ");
        }
    }

    public boolean completo(){
        for(int i = 0; i < tamanho; i++){
            if(acerto[i] == false) return false;
        }
        return  true;
    }

    public static void main(String args[]){
        Forca forca = new Forca("Raffa Moreira");
        Scanner in = new Scanner(System.in);
        String c;
        forca.escreve();
        while(forca.completo() == false){
            System.out.print("\nDigite uma letra: ");
            c = in.nextLine();
            forca.insereLetra(c);
            forca.escreve();
        }
    }
}