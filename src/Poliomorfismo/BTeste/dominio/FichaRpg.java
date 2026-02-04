package Poliomorfismo.BTeste.dominio;

public abstract class FichaRpg {
    protected String nome;
    protected double vida;
    protected double dano;
    protected double defesa;

    public FichaRpg(String nome, double vida, double dano, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.defesa = defesa;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }
}
