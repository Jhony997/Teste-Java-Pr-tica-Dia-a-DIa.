package Javacore.Gabstract.dominio;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public void calcularRendimento() {
        saldo += saldo * 0.05;
    }

}
