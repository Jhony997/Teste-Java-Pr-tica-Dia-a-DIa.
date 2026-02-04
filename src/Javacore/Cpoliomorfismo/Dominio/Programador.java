package Javacore.Cpoliomorfismo.Dominio;

public class Programador extends Funcionario{

    public Programador(String nome, double dinheiro) {
        super(nome, dinheiro);
    }

    public Programador(String nome, double dinheiro, String classe) {
        super(nome, dinheiro, classe);
    }

    @Override
    public double calculasalario() {
        return dinheiro * 0.15;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + nome + '\'' +
                ", dinheiro=" + dinheiro +
                '}';
    }
}
