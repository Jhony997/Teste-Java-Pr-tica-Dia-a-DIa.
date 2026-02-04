package Javacore.DtoString.Metodo;

public class GameTester extends Funcionario{

    public GameTester(String jogos, double avaliacao) {
        super(jogos, avaliacao);
    }

    @Override
    public String toString() {
        return "GameTester{" +
                "jogos ='" + jogos + '\'' +
                ", avaliacao =" + avaliacao +
                '}';
    }
}
