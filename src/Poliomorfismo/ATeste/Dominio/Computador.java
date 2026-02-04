package Poliomorfismo.ATeste.Dominio;

public class Computador extends Produto{
    private double imposto = 0.20;

    public Computador(String nome, double valor, double potencia) {
        super(nome, valor, potencia);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando Imposto");
        return this.getValor() * imposto;
    }
}
