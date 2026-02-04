package Javacore.Gabstract.dominio;

public abstract class Conta {
    protected String titular;
    protected double saldo;

    public Conta(double saldo, String titular) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public abstract void calcularRendimento();

    public void imprime(){
        System.out.println(this.titular);
        System.out.println(this.saldo + "$");
        System.out.println("------- Próximo --------");
    }
}
