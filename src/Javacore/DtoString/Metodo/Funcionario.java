package Javacore.DtoString.Metodo;

public abstract class Funcionario  {
    protected String jogos;
    protected double avaliacao;

    public Funcionario(String jogos, double avaliacao) {
        this.jogos = jogos;
        this.avaliacao = avaliacao;
    }

    public String getJogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "jogos='" + jogos + '\'' +
                ", avaliacao=" + avaliacao +
                '}';
    }

    public void imprime(){
        System.out.println("---OOO----");
        System.out.println(this.toString());
    }
}
