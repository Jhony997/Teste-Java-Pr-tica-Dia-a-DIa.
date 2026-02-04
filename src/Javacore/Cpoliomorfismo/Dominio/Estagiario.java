package Javacore.Cpoliomorfismo.Dominio;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, double dinheiro) {
        super(nome, dinheiro);
    }

    public Estagiario(String nome, double dinheiro, String classe) {
        super(nome, dinheiro, classe);
    }

    @Override
    public double calculasalario() {
        return dinheiro * 0.05;
    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "nome='" + nome + '\'' +
                ", dinheiro=" + dinheiro +
                '}';
    }
}
