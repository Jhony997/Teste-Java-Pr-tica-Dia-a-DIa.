package Javacore.DtoString.Metodo;

public class Programador extends Funcionario{

    public Programador(String jogos, double avaliacao) {
        super(jogos, avaliacao);
    }
    @Override
    public String toString() {
        return "Programador{" +
                "programador ='" + jogos + '\'' +
                ", avaliacao =" + avaliacao +
                '}';
    }
}
