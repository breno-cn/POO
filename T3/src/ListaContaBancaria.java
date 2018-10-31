public class ListaContaBancaria
{

    private ContaBancaria contas[];
    private int num;
    private int MAX;

    public ListaContaBancaria(int MAX)
    {
        this.MAX = MAX;
        contas = new ContaBancaria[MAX];
        num = 0;
    }

    public int getNum()
    {
        return num;
    }

    ContaBancaria getConta(String nome) throws NullPointerException
    {
        for(int i = 0; i < num; i++)
            if(nome.equals(contas[i].getNome())) return contas[i];
        throw new NullPointerException();
    }

    public void addConta(ContaBancaria c) throws OverflowException
    {
        if(num == MAX) throw new OverflowException();
        contas[num] = new ContaBancaria();
        contas[num].setNome(c.getNome());
        contas[num].setLimite(c.getLimite());
        num++;
    }

    public void removeConta(String nome) throws UnderflowException
    {
        if(num == 0) throw new UnderflowException();
        if(nome.equals(contas[num]))
        {
            num--;
            return;
        }
        for(int i = 0; i < num; i++){
            if(nome.equals(contas[i].getNome()))
            {
                for(int j = i; j < num - 1; j++)
                    contas[j] = contas[j + 1];
            }
        }
        num--;
    }

    public void impContas()
    {
        for(int i = 0; i < num; i++)
        {
            System.out.println("Conta " + (i + 1));
            System.out.println("Nome: " + contas[i].getNome());
            System.out.println("Limite " + contas[i].getLimite());
            System.out.println("Saldo " + contas[i].getSaldo() + "\n");
        }
    }

}
