public class ContaBancaria
{

    private double saldo;
    private double limite;
    private String nome;

    public ContaBancaria()
    {
        saldo = 0;
    }

    public void setLimite(double limite) throws IllegalArgumentException
    {
        if(limite <= 0) throw new IllegalArgumentException();
        this.limite = limite;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getLimite()
    {
        return limite;
    }

    public String getNome()
    {
        return nome;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void depositar(double valor) throws IllegalArgumentException
    {
        if(valor <= 0) throw new IllegalArgumentException();
        else saldo += valor;
    }

    public void sacar(double valor) throws IllegalArgumentException, LimitException
    {
        if(valor <= 0) throw new IllegalArgumentException();
        else if(valor > limite + saldo) throw new LimitException();
        else saldo -= valor;
    }
}