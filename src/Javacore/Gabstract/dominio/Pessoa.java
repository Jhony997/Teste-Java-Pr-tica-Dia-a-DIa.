package Javacore.Gabstract.dominio;

public class Pessoa extends Conta{

    public Pessoa(double saldo, String titular){
        super(saldo, titular);
    }

    @Override
    public void calcularRendimento() {
        saldo += saldo * 0.02;
    }
}
