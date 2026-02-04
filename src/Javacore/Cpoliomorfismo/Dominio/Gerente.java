package Javacore.Cpoliomorfismo.Dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double dinheiro) {
        super(nome, dinheiro);
    }

    public Gerente(String nome, double dinheiro, String classe) {
        super(nome, dinheiro, classe);
    }

    @Override
    public double calculasalario() {
        return dinheiro * 0.25;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", dinheiro=" + dinheiro +
                '}';
    }
}
