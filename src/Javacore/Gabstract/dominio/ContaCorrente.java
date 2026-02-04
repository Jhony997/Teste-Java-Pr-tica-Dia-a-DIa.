package Javacore.Gabstract.dominio;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public void calcularRendimento() {
        saldo += saldo * 0.02;
    }

}
