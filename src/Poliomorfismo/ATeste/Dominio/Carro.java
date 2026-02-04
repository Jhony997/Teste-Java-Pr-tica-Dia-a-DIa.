package Poliomorfismo.ATeste.Dominio;

public class Carro extends Produto{
    private double imposto = 0.35;

    public Carro(String nome, double valor, double potencia) {
        super(nome, valor, potencia);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando Imposto");
       return this.getValor() * imposto;
    }
}
