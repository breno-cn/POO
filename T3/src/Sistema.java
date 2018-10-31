import java.util.Scanner;

public class Sistema
{
    public static void main(String args[])
    {
        String nome;
        int opcao = 0, op2;
        double valor;
        ContaBancaria conta = new ContaBancaria();
        ListaContaBancaria lista = new ListaContaBancaria(10);
        Scanner in = new Scanner(System.in);

        while(opcao != 5)
        {
            System.out.print("(1) Abrir conta\n(2) Remover existente\n" +
                    "(3) Modificar existente\n(4) Listar contas\n(5) Sair\n");
            opcao = in.nextInt();

            if(opcao == 1)
            {
                in.nextLine();                      //  Limpra buffer do teclado
                System.out.print("Digite o nome: ");
                nome = in.nextLine();
                System.out.print("Digite o valor do limite: ");
                valor = in.nextDouble();

                try
                {
                    conta.setNome(nome);
                    conta.setLimite(valor);
                    lista.addConta(conta);
                }
                catch(IllegalArgumentException e)
                {
                    System.out.println(e.toString());
                    return;
                }
                catch(OverflowException e)
                {
                    System.out.println(e.toString());
                    return;
                }

            }

            else if(opcao == 2)
            {
                in.nextLine();
                System.out.print("Digite o nome da conta: ");
                nome = in.nextLine();

                try
                {
                    lista.removeConta(nome);
                }
                catch(UnderflowException e)
                {
                    System.out.println(e.toString());
                    return;
                }
            }

            else if(opcao == 3)
            {
                in.nextLine();
                System.out.print("Digite o nome da conta: ");
                nome = in.nextLine();
                System.out.print("O que deseja fazer?\n(1) Depositar\n(2) Sacar\n");
                op2 = in.nextInt();
                in.nextLine();
                System.out.print("Digite um valor: ");
                valor = in.nextDouble();

                try
                {
                    if(op2 == 1) lista.getConta(nome).depositar(valor);
                    if(op2 == 2) lista.getConta(nome).sacar(valor);
                }
                catch(NullPointerException e)
                {
                    System.out.println(e.toString());
                    return;
                }
                catch(IllegalArgumentException e)
                {
                    System.out.println(e.toString());
                    return;
                }
                catch(LimitException e)
                {
                    System.out.println(e.toString());
                    return;
                }
            }
            else if(opcao == 4) lista.impContas();
        }
    }
}