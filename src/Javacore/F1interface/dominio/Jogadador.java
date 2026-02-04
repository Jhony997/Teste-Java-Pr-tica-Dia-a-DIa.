package Javacore.F1interface.dominio;

public abstract class Jogadador implements Jogo {
    private String nome;
    private double dinheiro;
    private int level;
    private String jogo;

    public Jogadador(String nome, double dinheiro, int level, String jogo) {
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.level = level;
        this.jogo = jogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }
}
