import java.util.Scanner;

public class Sistema{

    public static void main(String args[]){
        ContaBancaria conta =  new ContaBancaria();
        conta.setLimite(500);
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor para depositar: ");
        double valor = in.nextDouble();
        try{
            conta.depositar(valor);
        }
        catch(IllegalArgumentException e){
            System.out.println("Nao e possivel depositar um valor negativo!");
            System.exit(0);
        }
        System.out.print("Digite um valor para sacar: ");
        valor = in.nextDouble();
        try{
            conta.sacar(valor);
        }
        catch(IllegalArgumentException e){
            System.out.println("Nao e possivel sacar um valor negativo");
            System.exit(0);
        }
        catch(LimitException e){
            //System.out.println("Saque fora do limite!");
            System.out.println(e.toString());
            System.exit(0);
        }
    }
}
