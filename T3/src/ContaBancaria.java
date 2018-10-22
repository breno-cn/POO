public class ContaBancaria{

    private double saldo;
    private double limite;
    private String nome;

    public ContaBancaria(){
        saldo = 0;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getLimite(){
        return limite;
    }

    public  String getNome(){
        return nome;
    }

    public void depositar(double valor) throws IllegalArgumentException{
        if(valor <= 0) throw new IllegalArgumentException();
        else saldo += valor;
    }

    public void sacar(double valor) throws IllegalArgumentException, LimitException{
        if(valor <= 0) throw new IllegalArgumentException();
        else if(valor > limite) throw new LimitException();
        else saldo -= valor;
    }
}
